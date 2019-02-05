package tkmnzm.app.multimoduleplayground.common.di

import android.app.Activity

sealed class ProvidedActivity

class Provided(val instance: Activity) : ProvidedActivity()
class UnProvided : ProvidedActivity()