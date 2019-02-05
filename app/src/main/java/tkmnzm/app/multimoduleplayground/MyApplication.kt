package tkmnzm.app.multimoduleplayground

import android.app.Activity
import android.app.Application
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import tkmnzm.app.multimoduleplayground.di.AppComponent
import tkmnzm.app.multimoduleplayground.di.DaggerAppComponent
import javax.inject.Inject

class MyApplication : Application(), HasActivityInjector {

    lateinit var appComponent : AppComponent

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

    override fun onCreate() {
        super.onCreate()
        appComponent =  DaggerAppComponent.create()
        DaggerAppComponent.create().inject(this)
    }
}