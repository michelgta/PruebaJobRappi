package mx.com.pruebajobrappi.di

import androidx.room.Room
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.skydoves.sandwich.coroutines.CoroutinesResponseCallAdapterFactory
import mx.com.pruebajobrappi.data.local.MoviesDao
import mx.com.pruebajobrappi.data.local.MoviesDataBase
import mx.com.pruebajobrappi.data.remote.HttpInterceptor.createOkHttpInterceptor
import mx.com.pruebajobrappi.data.remote.MovieEndpoints
import mx.com.pruebajobrappi.data.repository.FavoriteRepository
import mx.com.pruebajobrappi.data.repository.FavoriteRepositoryImpl
import mx.com.pruebajobrappi.data.repository.PopularRepository
import mx.com.pruebajobrappi.data.repository.PopularRepositoryImpl
import mx.com.pruebajobrappi.domain.usecase.GetFavoritesUseCase
import mx.com.pruebajobrappi.domain.usecase.GetFavoritesUseCaseImpl
import mx.com.pruebajobrappi.domain.usecase.GetPopularUseCase
import mx.com.pruebajobrappi.domain.usecase.GetPopularUseCaseImpl
import mx.com.pruebajobrappi.ui.favorite.viewmodel.FavoritesViewModel
import mx.com.pruebajobrappi.ui.popular.viewmodel.PopularViewModel
import mx.com.pruebajobrappi.utils.Constants.DATA_BASE_NAME_MOVIES
import mx.com.pruebajobrappi.utils.Constants.URL_BASE
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

val ApplicationModule = module {

    factory<PopularRepository> {
        PopularRepositoryImpl(get() as MovieEndpoints, get() as MoviesDao)
    }

    factory<FavoriteRepository> {
        FavoriteRepositoryImpl(get() as MovieEndpoints,get() as MoviesDao)
    }

    factory<GetPopularUseCase> {
        GetPopularUseCaseImpl(
            get() as PopularRepository,
            get() as FavoriteRepository
        )
    }
    viewModel {
        PopularViewModel(get() as GetPopularUseCase)
    }

    factory<GetFavoritesUseCase> {
        GetFavoritesUseCaseImpl(get() as FavoriteRepository)
    }

    viewModel {
        FavoritesViewModel(get() as GetFavoritesUseCase)
    }
}


val NetworkModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            MoviesDataBase::class.java, DATA_BASE_NAME_MOVIES
        ).build()
    }

    single { get<MoviesDataBase>().moviesDao() }

    single {
        OkHttpClient.Builder()
            .addInterceptor(createOkHttpInterceptor())
            .addNetworkInterceptor(StethoInterceptor())
            .build()
    }

    single {
        Retrofit.Builder()
            .client(get<OkHttpClient>())
            .baseUrl(URL_BASE)
            .addConverterFactory(MoshiConverterFactory.create())
            .addCallAdapterFactory(CoroutinesResponseCallAdapterFactory())
            .build()
    }

    single { get<Retrofit>().create(MovieEndpoints::class.java) }
}