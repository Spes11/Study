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

- ### 関数の引数
  任意の値を関数の引数として渡すことができる。  
  複数の引数を設定可能。

```js
const hey = function (name, amimal) {
  alert(`hey! ${name},${animal}`);
};

hey("タナカタロウ", "ポチ");
```

- ### 関数の戻り値

  関数に戻り値を設定することができる。

```js
let name = "ごりら";
let message = "バナナが好物。";

const hey = function (name, message) {
  return `${name}は${message}`;
};

//ごりらはバナナが好物。
console.log(hey(name, message));
```

## デフォルト引数

関数呼び出し時に引数が与えら無かった場合のデフォルト値を記述できる。  
引数を設定して呼び出すと、設定した引数が使用される。

```JS
function logActive(name = "Shane McConkey", activity = "sking") {
  console.log(`${name}loves${activity}`);
}
//Shane McConkeylovessking
logActive();
//タナカloves料理
logActive("タナカ", "料理");

const defaultPerson = {
  name: {
    first: "Shane",
    last: "McConkey",
  },
  favActivty: "sking",
};
function logActivity(person = defaultPerson) {
  console.log(`${person.name.first} loves ${person.favActivty}`);
}
//Shane loves sking
logActivity();
```

## アロー関数

`funcrion`や`return`文無しで関数を記述できる。

```JS
// 非アロー関数
const lordify = function (fistName) {
  return `${firstName} of Canterbury`;
};

// Dale of Centerbury
console.log(lordify("Dale"));
// Gail of Centerbury
console.log(lordify("Gail"));


// アロー関数
const lordify = function (firstName, land) {
  return `${firstName} of ${land}`;
};
// Dail of CenterBury
console.log(lordify("Dail", "Centerbury"));

// インラインで記述
// 引数が１つの場合引数を囲む（）を省略できるが複数ある場合は省略不可。
const lordify = (firstName, land) => `${firstName} of ${land}`;

console.log(lordify("Dail", "Centerbury"));

```

## オブジェクトの返却

アロー関数をインラインで記述するときには、戻り値のオブジェクトをかっこで囲む。

```JS
const person = (fistName, lastName) => ({
  first: firstName,
  last: lastName,
});

console.log("Bard", "Janosn");
```

## アロー関数とスコープ

アロー関数は独自のスコープを持たない。

```js
const tahoe = {
  mountains: ["Freel", "Rose", "Tallac", "Rubicon", "Silver"],
  print: function (delay = 1000) {
    setTimeout(function () {
      console.log(this.mountains.join(", "));
    }, delay);
  },
};
// Uncaught TypeError: Cannot read properties of undefined (reading 'join')
tahoe.print();
```

```js
const tahoe = {
  mountains: ["Freel", "Rose", "Tallc", "Rubicon", "Silber"],
  print: function (delay = 1000) {
    setTimeout(() => {
      console.log(this.mountains.join(", "));
    }, delay);
  },
};
// Freel, Rose, Tallc, Rubicon, Silber
tahoe.print();
```

## JavaScript のコンパイル

新しい構文で記述されたコードを、古い構文に変換すること。
Babel

## オブジェクトと配列

### デストラクチャリング

オブジェクトを分解する。  
使用する際は、渡すプロパティを`{}`で囲む。

```JS
const sandwich = {
  bread: "dutch crunch",
  meat: "tuna",
  cheese: "swiss",
  topping: ["lettice", "tomato", "mustard"],
};

let { bread, meat } = sandwich;
bread = "garlic";
meat = "turkey";

// garlic turkey
console.log(bread, meat);
// dutch crunch tuna
console.log(sandwich.bread, sandwich.meat);
```

関数の引数にも適用可能。

```JS
// デストラクチャリング未使用
const lordify = (regularPerson) => {
  console.log(`${regularPerson.firstname} of Canterbury`);
};

const regularPerson = {
  firstname: "Bill",
  lastname: "Wilson",
};

// Bill of Canterbury
lordify(regularPerson);

// デストラクチャリング使用
const lordify2 = ({ firstname }) => {
  console.log(`${firstname}of Canterbury`);
};

const regularPerson2 = {
  firstname: "Bill",
  lastname: "Wilson",
};

// Bill of Canterbury
lordify2(regularPerson2);

```

オブジェクトの深いレベルのプロパティも選択することができる。

```JS
const lordify = ({ sponse: { firstname } }) => {
  console.log(`${firstname} of Canterbury`);
};

const regularPerson = {
  firstname: "Bill",
  lastname: "Wilson",
  sponse: {
    firstname: "Phil",
    lastname: "Wilson",
  },
};

// Phil of Canterbury
lordify(regularPerson);
```

## 配列のデストラクチャリング

配列にも適用可能。
スプレット構文と組み合わせて使われる事が多い。

```JS
const [firstAnimal] = ["Horse", "Mouse", "Cat"];
// Horse
console.log(firstAnimal);

const [, , thirdAnimal] = ["Horse", "Mouse", "Cat"];
// Cat
console.log(thirdAnimal);

```
