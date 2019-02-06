# Dagger-Android

マルチモジュールなプロジェクトでDagger-Androidを使用した場合のサンプルです。

導入の手順は公式のdocを参照。
https://google.github.io/dagger/android.html

各moduleの依存関係は以下のようになっています。
```
app -> dagger(has Activity) -> feature 
```

**daggerモジュールの依存定義:** [daggerモジュール diパッケージ](src/main/java/tkmnzm/app/multimoduleplayground/feature/dagger/di)

daggerモジュール内クラスの依存をDaggerInjectionModuleに定義しています。今回はActivity以外では@Injectアノテーションを使用しない書き方にしました。

**featureモジュールの依存定義:** [featureモジュール diパッケージ](../feature/src/main/java/tkmnzm/app/multimoduleplayground/feature/di)

参照元のモジュールではfeatureモジュールが持つIFを参照するように実装しており、実インスタンスへの解決はFeatureModuleクラスで実現しています。

**appモジュールの依存定義:** [appモジュール diパッケージ](../app/src/main/java/tkmnzm/app/multimoduleplayground/di)

daggerモジュールのDaggerInjectionActivityModuleを利用して、DaggerInjectionActivityの依存を解決しています。

## 課題

Activityのテストで依存をmockしたい場合、どのように記述すればRobolectric上とDevice上でテストコードを共通化できるのかが未解決。

モノリシックな構成の場合、`ApplicationProvider.getApplicationContext`からApplicationクラスを取得して定義を変更してあげればよいように思える。
しかし、マルチモジュールな構成だとこのモジュールではApplicationクラスを持つappモジュールへの参照を持っていない。

Applicationクラス自体の差し替えはRobolectricとInstrumentationTestでやり方が異なるため、1つのコードで両環境での実行ができないはず。

このあたりの指針がまだ決めきれていなのが課題。