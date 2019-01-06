package tkmnzm.app.multimoduleplayground.feature.a

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProviders
import dagger.android.AndroidInjection
import tkmnzm.app.multimoduleplayground.feature.R
import javax.inject.Inject

class FeatureAActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: FeatureAViewModelFactory

    private val viewModel: FeatureAViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(FeatureAViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature)
        AndroidInjection.inject(this)

        findViewById<TextView>(R.id.textView).text = viewModel.text.value
    }
}
