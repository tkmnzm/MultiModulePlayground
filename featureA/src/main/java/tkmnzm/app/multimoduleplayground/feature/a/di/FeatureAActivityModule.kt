package tkmnzm.app.multimoduleplayground.feature.a.di

import android.content.Context
import dagger.Module
import dagger.Provides
import tkmnzm.app.multimoduleplayground.common.di.ActivityScope
import tkmnzm.app.multimoduleplayground.feature.a.FeatureAActivity

@Module(includes = [FeatureAModule::class])
class FeatureAActivityModule {
    @Provides
    @ActivityScope
    fun provideContext(activity: FeatureAActivity): Context = activity
}