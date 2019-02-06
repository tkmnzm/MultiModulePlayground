package tkmnzm.app.multimoduleplayground.feature.dagger

import android.app.Activity
import android.app.Application
import androidx.test.ext.junit.runners.AndroidJUnit4
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.DispatchingAndroidInjector_Factory
import dagger.android.HasActivityInjector
import org.junit.Test
import org.junit.runner.RunWith

import javax.inject.Provider

@RunWith(AndroidJUnit4::class)
class FeatureAActivityTest {

    @Test
    fun onCreate() {
    }

    inline fun <reified T : Activity> createFakeActivityInjector(crossinline block: T.() -> Unit): DispatchingAndroidInjector<Activity> {
        val injector = AndroidInjector<Activity> { instance ->
            if (instance is T) {
                instance.block()
            }
        }
        val factory = AndroidInjector.Factory<Activity> { injector }
        val map = mapOf(
            Pair<Class<out Activity>, Provider<AndroidInjector.Factory<out Activity>>>(
                T::class.java,
                Provider { factory })
        )
        return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(map)
    }

    class TestApplication : Application(), HasActivityInjector {
        override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector

        lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>
    }
}