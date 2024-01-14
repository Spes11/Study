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
