package com.example.logonrmlocal.githubaac.di.components

import android.app.Activity
import android.app.Application
import com.example.logonrmlocal.githubaac.MyApp


import com.example.logonrmlocal.githubaac.di.modules.ActivityModule
import com.example.logonrmlocal.githubaac.di.modules.AppModule
import com.example.logonrmlocal.githubaac.di.modules.FragmentModule
import dagger.Binds
import dagger.BindsInstance
import dagger.Component
import dagger.Provides
import dagger.android.AndroidInjection
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
        modules = [
        AndroidInjectionModule::class,
        ActivityModule::class,
        FragmentModule::class,
        AppModule::class
        ]
)
interface AppComponent{
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent

    }
    fun inject(app: MyApp)
}