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

## テンプレート文字列（テンプレートリテラル）

文字連結の新たな手法。  
文字列の中に変数の値を埋め込むことができる。

従来は`""`で囲う必要があった。

```JS
console.log(lastName + "," + firstName + " " + middleName);
```

現在はバッククォート(\`)で囲み、`${}`の中に変数を記述する。

```JS
console.log(`${lastName},${firstName} ${middleName}`);
```

## 関数の作成

- ### 関数宣言

  `function`の横に関数名を書きその後ろに関数の本体を記述する。

```JS
          //関数名
function logCompleiment(){
  //関数本体
  console.log("you're doing great!");
  }
//関数呼出し
  logCompleiment();
```

- #### 特徴
  関数の巻き上げ（hosting）が起きる。  
  関数宣言より前に関数を呼び出せる。

```javascript
//宣言より間に関数を呼び出せる。
hey();
//関数宣言
function(){
  alert("hey!");
}
```

```javascript
//宣言より間に関数を呼び出せない。
hey();
//関数式
const hey = function () {
  alert("hey!");
};

//関数式は関数の巻き上げが起こらないため、宣言前の変数を参照しようとしてエラー
test.js:1 Uncaught ReferenceError: Cannot access 'hey' before initialization
```

- ### 関数式
  変数に代入してから関数を呼び出す。

```JS
const logCompliment = function(){
  console.log("You're doing great!") ;
};

logComplimet();
```
