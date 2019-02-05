package tkmnzm.app.multimoduleplayground.feature.dagger

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import tkmnzm.app.multimoduleplayground.feature.Feature

@Suppress("UNCHECKED_CAST")
class DaggerInjectionViewModelFactory internal constructor(private val repository: Repository,
                                                           private val featureB: Feature) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return DaggerInjectionViewModel(repository, featureB) as T
    }
}