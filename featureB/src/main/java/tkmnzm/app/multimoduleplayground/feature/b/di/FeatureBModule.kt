package tkmnzm.app.multimoduleplayground.feature.b.di

import dagger.Module
import dagger.Provides
import tkmnzm.app.multimoduleplayground.feature.b.DefaultFeatureB
import tkmnzm.app.multimoduleplayground.feature.b.FeatureB

@Module
class FeatureBModule {
    @Provides
    fun featureB(): FeatureB =
        DefaultFeatureB()
}