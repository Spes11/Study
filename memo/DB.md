# データ型

### 数値

- 整数型 INTEGER 型
- 小数型 DECIMAL 型、 REAL 型

### 文字型

- 固定長 CHAR 型
- 可変長 VARCHAR 型

### 日付と時刻

- DATETIME 型、 DATE 型、 TIME 型

# データベース設計

- #### 論理設計
  正規化や ER 図といった道具を使ったデータのモデル設計。
- #### 物理設計

  サーバーやストレージといった物理的なハードウェアレベルの設計。

- #### 実装設計
  特定の DB 製品を前提に、具体的な構築の手順や方法を解説したもの。

# ３層スキーマ

- #### 外部スキーマ（外部モデル）＝ビューの世界
  ユーザーからみた DB
- #### 概念スキーマ（論理データモデル）＝テーブルの世界
  開発者からみた DB  
  データ独立性を保証するためにある
- #### 内部スキーマ（物理データモデル）＝ファイルの世界
  DBMS から見た DB
