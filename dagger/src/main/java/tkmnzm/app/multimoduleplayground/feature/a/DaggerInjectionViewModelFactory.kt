package tkmnzm.app.multimoduleplayground.feature.a

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import tkmnzm.app.multimoduleplayground.feature.b.FeatureB

@Suppress("UNCHECKED_CAST")
class DaggerInjectionViewModelFactory internal constructor(private val repository: Repository,
                                                           private val featureB: FeatureB) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return DaggerInjectionViewModel(repository, featureB) as T
    }
}