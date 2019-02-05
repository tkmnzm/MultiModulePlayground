package tkmnzm.app.multimoduleplayground.feature.dagger

import android.content.Context
import tkmnzm.app.multimoduleplayground.feature.R

class Repository(private val context: Context) {

    fun action(): String {
        return context.getString(R.string.resource)
    }
}