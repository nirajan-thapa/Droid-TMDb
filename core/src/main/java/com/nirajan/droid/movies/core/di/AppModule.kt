package com.nirajan.droid.movies.core.di

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module

@Module
internal abstract class AppModule {

    @Binds
    abstract fun context(application: Application): Context
}