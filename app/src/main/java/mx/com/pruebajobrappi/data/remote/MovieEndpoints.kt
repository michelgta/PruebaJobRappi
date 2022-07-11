package mx.com.pruebajobrappi.data.remote

import mx.com.pruebajobrappi.data.model.PageMovie
import mx.com.pruebajobrappi.data.model.VideoTrailer
import mx.com.pruebajobrappi.utils.Constants.API_KEY
import mx.com.pruebajobrappi.utils.Constants.DEFAULT_LANGUAGE
import mx.com.pruebajobrappi.utils.Constants.DEFAULT_REGION
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieEndpoints {
    @GET("popular")
    suspend fun getPopularMovies(
            @Query("page") page: Int,
            @Query("api_key") apiKey: String = API_KEY,
            @Query("language") language: String = DEFAULT_LANGUAGE,
            @Query("region") region: String = DEFAULT_REGION
    ): PageMovie

    @GET("{idMovie}/videos")
    suspend fun getVideoTrailerMovies(
        @Path("idMovie") idMovie: Int,
        @Query("api_key") apiKey: String = API_KEY,
        @Query("language") language: String = DEFAULT_LANGUAGE
    ): VideoTrailer

}