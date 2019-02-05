package tkmnzm.app.multimoduleplayground

import android.app.Activity
import android.app.AppComponentFactory
import android.app.Application
import android.content.Intent
import tkmnzm.app.multimoduleplayground.common.di.Provided
import tkmnzm.app.multimoduleplayground.common.di.UnProvided
import tkmnzm.app.multimoduleplayground.feature.constructor.di.ActivityModule

class MyAppComponentFactory : AppComponentFactory() {

    private lateinit var application: MyApplication

    override fun instantiateActivity(cl: ClassLoader,
                                     className: String,
                                     intent: Intent?): Activity {

        return when (val providedActivity = ActivityModule().provide(className)) {
            is Provided -> providedActivity.instance
            is UnProvided -> super.instantiateActivity(cl, className, intent)
        }
    }

    override fun instantiateApplication(cl: ClassLoader,
                                        className: String): Application {
        application = super.instantiateApplication(cl, className) as MyApplication
        return application
    }
}