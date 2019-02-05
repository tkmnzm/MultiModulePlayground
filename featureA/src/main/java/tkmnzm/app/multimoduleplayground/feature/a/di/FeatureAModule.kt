package tkmnzm.app.multimoduleplayground.feature.a.di

import android.content.Context
import dagger.Module
import dagger.Provides
import tkmnzm.app.multimoduleplayground.feature.a.FeatureARepository
import tkmnzm.app.multimoduleplayground.feature.a.FeatureAViewModelFactory
import tkmnzm.app.multimoduleplayground.feature.b.FeatureB
import tkmnzm.app.multimoduleplayground.feature.b.di.FeatureBModule

@Module(includes = [FeatureBModule::class])
class FeatureAModule {

    @Provides
    fun viewModelFactory(repo: FeatureARepository, featureC: FeatureB):
            FeatureAViewModelFactory = FeatureAViewModelFactory(repo, featureC)

    @Provides
    fun repository(context: Context): FeatureARepository = FeatureARepository(context)


}