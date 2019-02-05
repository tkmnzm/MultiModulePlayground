package tkmnzm.app.multimoduleplayground.feature.constructor.di

import tkmnzm.app.multimoduleplayground.common.di.Provided
import tkmnzm.app.multimoduleplayground.common.di.ProvidedActivity
import tkmnzm.app.multimoduleplayground.common.di.UnProvided
import tkmnzm.app.multimoduleplayground.feature.constructor.ConstructorInjectionActivity
import tkmnzm.app.multimoduleplayground.feature.di.FeatureModule

class ActivityModule {
    fun provide(className: String): ProvidedActivity {

        if (className == ConstructorInjectionActivity::class.java.name) {
            //暫定的にDaggerで使用したModuleを使用する
            val featureModule = FeatureModule()
            return Provided(ConstructorInjectionActivity(featureModule.feature()))
        }
        return UnProvided()
    }
}