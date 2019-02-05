package tkmnzm.app.multimoduleplayground.feature.a

import tkmnzm.app.multimoduleplayground.feature.b.FeatureB

class FeatureA(private val featureB: FeatureB) {

    fun action(): String {
        return featureB.action()
    }
}