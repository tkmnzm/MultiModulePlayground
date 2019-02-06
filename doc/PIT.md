# PIT

http://pitest.org/

PITのシンプルな導入手順や実行手順は下記を参照。

https://qiita.com/tkmnzm/items/36d8332e58c1d71bd037

## マルチモジュールプロジェクトへの導入

ルートのプロジェクトで、全サブプロジェクトにPITのAndroidプラグインを設定している。

実際のコードは下記ファイルに記載。設定の詳細はコメントを参照。

[build.gradle](../build.gradle)

## レポートのマージ

各モジュールでpitを実行した結果をマージするタスクを定義する。
pitのレポートマージはGradle Plugin側では対応しておらず、PITで提供されている`ReportAggregator`を使用して実装。

http://pitest.org/aggregating_tests_across_modules/

buildscriptの依存にorg.pitest:pitest-aggregatorとorg.pitest:pitest-parentを定義する。

[build.gradle](../build.gradle)


今回はVariantごとにタスクを作成したかったため、appモジュールのbuild.gradleにタスクを定義した。

[app/build.gradle](../app/build.gradle)


mergePitReport[Variant]タスクを実行すると、ルートプロジェクトの`buildr/eport/pitest`に各moduleの結果をマージしたHTMLレポートが作成される。


