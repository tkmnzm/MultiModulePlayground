package tkmnzm.app.multimoduleplayground.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import tkmnzm.app.multimoduleplayground.common.di.ActivityScope
import tkmnzm.app.multimoduleplayground.feature.a.DaggerInjectionActivity
import tkmnzm.app.multimoduleplayground.feature.a.di.DaggerInjectionActivityModule

@Module(includes = [AndroidSupportInjectionModule::class])
abstract class AppModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [DaggerInjectionActivityModule::class])
    abstract fun contributesAndroidInjector(): DaggerInjectionActivity
}