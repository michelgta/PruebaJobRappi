package mx.com.pruebajobrappi.base

import android.app.Application

import mx.com.pruebajobrappi.di.ApplicationModule
import mx.com.pruebajobrappi.di.NetworkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MoviesApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        //Start koin modules
        startKoin {
            androidContext(this@MoviesApplication)
            modules(listOf(NetworkModule, ApplicationModule))
        }
    }
}