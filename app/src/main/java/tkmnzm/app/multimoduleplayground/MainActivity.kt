package tkmnzm.app.multimoduleplayground

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import tkmnzm.app.multimoduleplayground.feature.a.FeatureAActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this, FeatureAActivity::class.java))
    }
}
