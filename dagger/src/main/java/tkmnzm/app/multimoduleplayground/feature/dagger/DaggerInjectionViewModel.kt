package tkmnzm.app.multimoduleplayground.feature.dagger

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import tkmnzm.app.multimoduleplayground.feature.Feature

class DaggerInjectionViewModel constructor(private val repo: Repository,
                                           private val featureB: Feature) : ViewModel() {

    val repoText: LiveData<String> by lazy {
        MutableLiveData<String>().also {
            it.value = repo.action()
        }
    }

    val featureCText: LiveData<String> by lazy {
        MutableLiveData<String>().also {
            it.value = featureB.action()
        }
    }
}