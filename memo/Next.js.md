# Next.js とは

#### ■ 特徴

React をベースに開発された、フロントフレームワーク。<br>
「URL ルーティング」⇒ リクエストされた URL に対して呼び出すアクションを決定する仕組み。

#### ■React との違い

- React

  - サーバー機能 ×
  - JavaScript のライブラリ

- Next.js
  - サーバー機能 ●
  - React ベースの FW

# アプリケーションの起動

```js
yarn <アプリケーション名>
```

# next.config.js

```js
module.exports = {
  async rewrites() {
    return [
      {
        sorce: "/api/:path*",
        destnation: "http://host.docker.internal:8000/api/:path*/",
      },
    ];
  },
};
```

フロントとバックエンドを疎通させるための設定。

`sorce: "/api/:path*",`というリクエストが来たら、`http://host.docker.internal:8000/api/:path*/`のリクエストをリトライすることで呼び出す。

# function

```js
export default function
```

- #### function
  関数
- #### export default
  関数の前に記載することによりページの初期表示に最初に実行される関数となる

# ステート

画面に表示させる値を動的に変更する仕組み

#### ・メモ

単に変数の中身を変えただけでは、イベントが起こらず、画面は再レンダリング（再描画）されない。

# mui/material

MUI はボタン、ダイアログ、ダイアログ、フォーム要素、ナビゲーションなど、多数のコンポーネントを提供している。

# emotion/react

コンポーネントに直接スタイルを適用することを可能にする。

# axios

HTTP 通信のためのライブラリ

- 共通の設定（ログ出力やタイムアウト）を行う機能
- リクエストおよびレスポンスを JSON に変換する機能
- リクエスト時とレスポンス時に任意の処理を挟み込む機能