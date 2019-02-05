package tkmnzm.app.multimoduleplayground.di

import dagger.Component
import tkmnzm.app.multimoduleplayground.MyApplication


@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: MyApplication)
}