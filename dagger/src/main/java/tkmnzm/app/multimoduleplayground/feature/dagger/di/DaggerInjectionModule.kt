package tkmnzm.app.multimoduleplayground.feature.dagger.di

import android.content.Context
import dagger.Module
import dagger.Provides
import tkmnzm.app.multimoduleplayground.feature.dagger.Repository
import tkmnzm.app.multimoduleplayground.feature.dagger.DaggerInjectionViewModelFactory
import tkmnzm.app.multimoduleplayground.feature.Feature
import tkmnzm.app.multimoduleplayground.feature.di.FeatureModule

@Module(includes = [FeatureModule::class])
class DaggerInjectionModule {

    @Provides
    fun viewModelFactory(repo: Repository, featureC: Feature):
            DaggerInjectionViewModelFactory = DaggerInjectionViewModelFactory(repo, featureC)

    @Provides
    fun repository(context: Context): Repository = Repository(context)
}