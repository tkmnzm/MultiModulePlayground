package tkmnzm.app.multimoduleplayground.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import tkmnzm.app.multimoduleplayground.common.di.ActivityScope
import tkmnzm.app.multimoduleplayground.feature.a.FeatureAActivity
import tkmnzm.app.multimoduleplayground.feature.a.di.FeatureAActivityModule

@Module(includes = [AndroidSupportInjectionModule::class])
abstract class AppModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = [FeatureAActivityModule::class])
    abstract fun contributesAndroidInjector(): FeatureAActivity
}