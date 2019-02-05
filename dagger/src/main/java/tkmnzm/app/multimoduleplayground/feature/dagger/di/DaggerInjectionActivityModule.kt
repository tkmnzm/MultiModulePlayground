package tkmnzm.app.multimoduleplayground.feature.dagger.di

import android.content.Context
import dagger.Module
import dagger.Provides
import tkmnzm.app.multimoduleplayground.common.di.ActivityScope
import tkmnzm.app.multimoduleplayground.feature.dagger.DaggerInjectionActivity

@Module(includes = [DaggerInjectionModule::class])
class DaggerInjectionActivityModule {
    @Provides
    @ActivityScope
    fun provideContext(activity: DaggerInjectionActivity): Context = activity
}