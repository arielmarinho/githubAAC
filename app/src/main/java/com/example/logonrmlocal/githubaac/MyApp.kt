package com.example.logonrmlocal.githubaac

import android.app.Activity
import android.app.Application
import com.example.logonrmlocal.githubaac.di.components.DaggerAppComponent
import com.facebook.stetho.Stetho
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject


    class MyApp : Application(), HasActivityInjector {

        @Inject
        lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

        override fun onCreate() {
            super.onCreate()
            this.initDagger()
            this.initStetho()
        }

        private fun initStetho() {
            Stetho.initializeWithDefaults(this);
        }

        override fun activityInjector(): DispatchingAndroidInjector<Activity>? {
            return dispatchingAndroidInjector
                        }

        private fun initDagger() {
            DaggerAppComponent.builder().application(this).build().inject(this)
        }
    }
