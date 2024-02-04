# Chapter1 React の世界へようこそ

## パッケージとは

React アプリケーションの開発や管理を支援するためのコードや資源のまとまり。  
パッケージマネージャを介してインストールされる。

# Chapter2 React 学習に必要な JavaScript の知識

## 変数の定義

- ### var キーワード

上書き可能。

```JS
var pizza = ture;
pizza = false;
console.log(pizza);//false
```

if/else 文の{}で囲んでもスコープを持たない。（関数によってのみスコープを作り出せた）

```JS
var topic = "JavaScript";

if (topic) {
var topic = "React";
console.log("block", topic); // block React
}
console.log("global", topic); // global React
```

- ### const キーワード
  Read-Only で上書きできない。

```JS
const pizza = true;
pizza = false;//エラー（代入不可）
```

- ### let キーワード
  スコープを持つ。

```JS
lst topic = "JavaScript";

if (topic) {
lst topic = "React";
console.log("block", topic); // block React
}
console.log("global", topic); // global JavaScript
```
