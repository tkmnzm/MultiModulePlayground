package tkmnzm.app.multimoduleplayground.feature.a

import com.google.common.truth.Truth.assertThat
import io.mockk.every
import io.mockk.mockk
import io.mockk.spyk
import org.junit.Test
import tkmnzm.app.multimoduleplayground.feature.b.DefaultFeatureB
import tkmnzm.app.multimoduleplayground.feature.b.FeatureB

class FeatureATest {

    @Test
    fun stub() {

        val featureB = mockk<FeatureB> {
            every { action() } returns "Test"
        }

        val target = FeatureA(featureB)

        assertThat(target.action()).isEqualTo("Test")
    }

    @Test
    fun spy() {

        val featureB = spyk(DefaultFeatureB())

        val target = FeatureA(featureB)

        assertThat(target.action()).isEqualTo("Default FeatureB")
    }
}