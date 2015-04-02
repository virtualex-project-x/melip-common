# Build方法
(root)/build.xmlを実行すると下記ファイルが作成される。<br>
　1. (root)/release/melip-common.jar<br>
　2. (root)/release/melip-common-src.zip<br><br>
尚、AndroidでJava1.7を使用している為、Build.xmlでコンパイルターゲットを指定している。

```
<!-- コンパイル -->
<!-- AndroidStudioではjava1.8でjarを作成すると動かないため、1.7でコンパイル（暫定対応） -->
<javac debug="true" destdir="${binDir}" encoding="UTF-8" classpathref="project.class.path"
  includeantruntime="false" target="1.7" source="1.7">
  <src path="${srcDir}" />
  <!-- <compilerarg value="-Xlint:deprecation" /> -->
  <!-- <compilerarg value="-Xlint:unchecked" /> -->
</javac>
```
# 思想的なコメント
ウェブサービス、モバイル、CMSが使用する定数、オブジェクト、処理を実装するべき。<br>
