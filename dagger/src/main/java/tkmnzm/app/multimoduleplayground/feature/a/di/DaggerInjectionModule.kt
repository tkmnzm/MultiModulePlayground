package tkmnzm.app.multimoduleplayground.feature.a.di

import android.content.Context
import dagger.Module
import dagger.Provides
import tkmnzm.app.multimoduleplayground.feature.a.Repository
import tkmnzm.app.multimoduleplayground.feature.a.DaggerInjectionViewModelFactory
import tkmnzm.app.multimoduleplayground.feature.b.FeatureB
import tkmnzm.app.multimoduleplayground.feature.b.di.FeatureBModule

@Module(includes = [FeatureBModule::class])
class DaggerInjectionModule {

    @Provides
    fun viewModelFactory(repo: Repository, featureC: FeatureB):
            DaggerInjectionViewModelFactory = DaggerInjectionViewModelFactory(repo, featureC)

    @Provides
    fun repository(context: Context): Repository = Repository(context)


}