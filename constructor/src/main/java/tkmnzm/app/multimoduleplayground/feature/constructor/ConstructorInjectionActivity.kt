package tkmnzm.app.multimoduleplayground.feature.constructor

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import tkmnzm.app.multimoduleplayground.feature.Feature

class ConstructorInjectionActivity(private val featureB: Feature) : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constructor_injection)

        findViewById<TextView>(R.id.constructor_injection_text).text = featureB.action()
    }
}
