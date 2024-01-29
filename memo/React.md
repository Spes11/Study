# コンポーネントの作成とネスト

### React アプリはコンポーネントで構成されている。

- #### コンポーネント

  独自のロジックと外見を持つ UI（ユーザインターフェース）<br>
  ボタンのような小さなものからページ全体を現す。<br>
  コンポーネント名は大文字で始まる必要がある。<br>
  HTML タグは小文字

  ```JS
  function MyButton() {
    return (
        <button>I'm a button</button>
    );
  }
  ```

# スタイルの追加

#### CSS クラスを`classname` で指定する。

```CSS
.avatar {
  border-radius: 50%;
}
```

```JS
import { use } from "react";
import './style.css';

const user = {
    name: 'Hedy Lammar',
    imageUrl: 'https://i.imgur.com/yXOvdOSs.jpg',
    imageSize: 90,
};

export default function Profile() {
    return (
        <>
            <h1>{user.name}</h1>
            <img
                className="avatar"
                src={user.imageUrl}
                alt={'Photo of' + user.name}
                style={{
                    width: user.imageSize,
                    height: user.imageSize,
            }}/>
        </>
    )
}
```

# 条件付きカレンダー

#### React には、条件分岐を書くための構文は存在しない。

JS の条件分岐の構文を使用する。

# 画面の更新

## State：コンポーネントのメモリ

state の例

- フォーム上でタイプすると画面上の表示内容を変更する
  - 現在の入力値
- 「次」ボタンをクリックすると表示される画像が変わる
  - 現在の画像
- 「購入」ボタンをクリックすると買い物かごに商品が入る
  - ショッピングカートの状態

# useEffect

#### していること

関数コンポーネント内で副作用を実行することができる

- 1
  useState の set 関数等によって関数の値が書き換わる
- 2
  DOM を書き換える
- 3
  画面を再レンダリングする
- 4
  再レンダリングごに useEffect の第一引数に渡した処理を実行する

  ```JS
  補足
  useEffect(() => {
  // 何らかの処理
  } ,[dependencies])"
  における
  "() => {
  // 何らかの処理
  　}"
  の箇所が第一引数のコールバック関数です。

  ```
