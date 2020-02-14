package com.nirajan.droid.movies

import android.app.Application
import com.nirajan.droid.movies.base.di.AppComponent
import com.nirajan.droid.movies.base.di.AppComponentProvider
import com.nirajan.droid.movies.base.di.DaggerAppComponent

class MyApplication : Application(), AppComponentProvider {

    private lateinit var appComponent: AppComponent

    override fun provideAppComponent(): AppComponent = appComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .application(this)
            .build()
    }
}