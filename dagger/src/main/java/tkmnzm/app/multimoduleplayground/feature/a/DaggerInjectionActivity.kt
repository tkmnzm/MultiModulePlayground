package tkmnzm.app.multimoduleplayground.feature.a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import dagger.android.AndroidInjection
import tkmnzm.app.multimoduleplayground.feature.R
import javax.inject.Inject

class DaggerInjectionActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: DaggerInjectionViewModelFactory

    private val viewModel: DaggerInjectionViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(DaggerInjectionViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)
        AndroidInjection.inject(this)

        findViewById<TextView>(R.id.repo_textView).text = viewModel.repoText.value
        findViewById<TextView>(R.id.feature_c_textView).text = viewModel.featureCText.value

    }
}
