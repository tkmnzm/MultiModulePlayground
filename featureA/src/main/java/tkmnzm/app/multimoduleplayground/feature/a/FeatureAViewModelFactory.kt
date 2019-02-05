package tkmnzm.app.multimoduleplayground.feature.a

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import tkmnzm.app.multimoduleplayground.feature.b.FeatureB

@Suppress("UNCHECKED_CAST")
class FeatureAViewModelFactory internal constructor(private val repository: FeatureARepository, private val featureB: FeatureB) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FeatureAViewModel(repository, featureB) as T
    }
}