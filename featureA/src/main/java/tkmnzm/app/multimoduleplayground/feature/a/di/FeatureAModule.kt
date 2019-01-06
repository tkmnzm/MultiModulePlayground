package tkmnzm.app.multimoduleplayground.feature.a.di

import android.content.Context
import dagger.Module
import dagger.Provides
import tkmnzm.app.multimoduleplayground.common.di.ActivityScope
import tkmnzm.app.multimoduleplayground.feature.a.FeatureARepository
import tkmnzm.app.multimoduleplayground.feature.a.FeatureAViewModelFactory

@Module
class FeatureAModule {
    @Provides
    @ActivityScope
    fun viewModelFactory(repo: FeatureARepository): FeatureAViewModelFactory = FeatureAViewModelFactory(repo)

    @Provides
    @ActivityScope
    fun repository(context: Context): FeatureARepository = FeatureARepository(context)


}