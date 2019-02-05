package tkmnzm.app.multimoduleplayground.feature.di

import dagger.Module
import dagger.Provides
import tkmnzm.app.multimoduleplayground.feature.DefaultFeature
import tkmnzm.app.multimoduleplayground.feature.Feature

@Module
class FeatureModule {
    @Provides
    fun feature(): Feature = DefaultFeature()
}