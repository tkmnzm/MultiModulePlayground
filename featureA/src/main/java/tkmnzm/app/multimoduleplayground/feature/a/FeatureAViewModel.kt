package tkmnzm.app.multimoduleplayground.feature.a

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FeatureAViewModel internal constructor(private val repo: FeatureARepository) : ViewModel() {

    val text: LiveData<String> by lazy {
        MutableLiveData<String>().also {
            it.value = repo.action()
        }
    }
}