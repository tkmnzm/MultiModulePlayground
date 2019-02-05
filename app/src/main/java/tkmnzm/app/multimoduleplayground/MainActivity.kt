package tkmnzm.app.multimoduleplayground

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import tkmnzm.app.multimoduleplayground.feature.a.DaggerInjectionActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startActivity(Intent(this, DaggerInjectionActivity::class.java))
    }
}
