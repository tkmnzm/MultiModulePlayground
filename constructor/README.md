# Constructor(おまけ)

コンストラクタインジェクションでDIを試みるモジュールです。

ActivityはAppComponentFactoryを使用してコンストラクタインジェクションをしています。

カスタムのAppComponentFactoryは↓に実装しています。

[MyAppComponentFactory](../app/src/main/java/tkmnzm/app/multimoduleplayground/MyAppComponentFactory.kt)

constructorモジュールでは下記のようにActivityのインスタンスを生成しています。

[ActivityModule](src/main/java/tkmnzm/app/multimoduleplayground/feature/constructor/di/ActivityModule.kt)

## 課題

カスタムコンストラクタを持つActivityのテストはどうするかの方針がまだ決まっていません。

普通のクラスのようにコンスタントで依存を渡してテストをしてしまってもよいのか、ActivityScenarioと連携させることができるのかあたりの調査がまだです。

また、カスタムコンストラクタを持つActivityをActivityScenarioで起動しようとすると、引数なしコンストラクタがないためエラーになります。


## 参考

https://satoshun.github.io/2018/11/android_all_inject_ctor/