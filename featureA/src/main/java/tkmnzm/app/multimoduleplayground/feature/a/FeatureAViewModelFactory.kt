package tkmnzm.app.multimoduleplayground.feature.a

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class FeatureAViewModelFactory internal constructor(private val repository: FeatureARepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FeatureAViewModel(repository) as T
    }
}