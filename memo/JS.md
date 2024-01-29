# 変数の宣言

- let:再代入可能
- const:再代入不可能
- var:再代入、再宣言可能だが基本的に使用しない

# 関数の宣言

方法 ①

```JS
const 関数名 = (引数) =>{
    //処理
}
```

方法 ②：最も基本的

```JS
function 関数名 = (引数) {
    //処理
}
```

方法 ③：名前付き関数。function を左辺に代入

```JS
const 関数名 = function(引数) {
    //処理
}
```

例 ①

```JS
//事前に宣言された機能のエクスポート
export {関数名１、関数名２};

const 関数名１ = (引数 ) =>{
    //処理
}
```

```JS
import {インポートしたい変数や関数名}from"インポートするモジュール"
```

例

```JS
import {関数名１}from"関数名１が定義されているファイル名"
```

# 代入

`変数名 = 値`

# td タグ

table data の略<br>
テーブルセルの内容を指定

# 関数リテラル

### リテラル

#### ● 特徴

- ソースコードにべた書きした文字や数字
  例

```JS
var name = "taro";
var age = 18;
//"taro" 18 がリテラル
```

### 関数リテラル

#### ● 特徴

- ソースコードにべた書きしたされた関数
- JS では関数はデータ型のひとつ
- 匿名関数、無名関数

```JS
let getTriangle = function(base,height){
 return base * height / 2;
};

console.log('三角形の面積は' + getTriangle(10,2));//三角形の面積は10
```

# アロー関数

基本構文

```JS
（引数,...）=> (関数の本体...)
```

例

```JS
let getTriangle = (base,height) => {
 return base * height / 2;
};

console.log('三角形の面積は' + getTriangle(10,2));//三角形の面積は10
```

## 他の書き方

- ### 1.関数の本体が 1 文である場合
  - ブロックを表す{...}を省略できる
  - return 文も省略可能

```JS
let getTriangle = (base,height) => base * height / 2;
console.log('三角形の面積は' + getTriangle(10,2));//三角形の面積は10

```

- ### 2.引数が１つの場合
  - 引数をくくる（）を省略できる

```JS
let getCircle = redius => redius * redius * / 2;
console.log('三角形の面積は' + getTriangle(10,2));//三角形の面積は10

```

- ### 3.引数が無い場合
  - 引数がない場合は()を省略せず記述します

```JS
let show =()=> console.log("Hello,world!")
show();//Hello,world!

```

# Array.prototype.map()

与えられた関数を配列のすべてに対して呼び出す。

```JS
const array1 = [1, 4, 9, 16];

// Pass a function to map
const map1 = array1.map((x) => x * 2);

console.log(map1);
// Expected output: Array [2, 8, 18, 32]
```
