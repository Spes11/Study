# マイグレーション

モデルを生成<br>
モデル ⇒DB を管理する表のようなもの<br>
DB のスキーマの変更を管理し、バージョン管理するためのシステム

- 自動生成
- 適用＆ロールバック
- 依存関係管理

## マイグレーションファイル

DB にテーブルを定義するためのファイル

### makemigration

モデルの変更を検出し新しいマイグレーションのコードを生成

```python
python manage.py makemigratons
```

### migrate

生成されたマイグレーションをデータベースに適用

```python
python manage.py migrate
```

### showmigrations

適用されたマイグレーションと未適用のマイグレーションリストを表示

```python
python manage.py showmigrations
```

### sqlmigrate

特定のマイグレーションに関連する SQL ステートメントを表示する。
DB には変更を加えない。

```python
python manage.py sqlmigrate [appname] [migration_name]
```

### rollback

前のマイグレーションに戻す

```python
python manage.py migrate [appname] [migration_name]
```

### マイグレーションを実施

```
python manage.py migrate --settings config.settings.development
```

# アプリケーションの作成

```py
django-admiin startapp [アプリケーション名]
```

# INSTALLED_APPS

django プロジェクトで使用するアプリケーションを定義するための設定

# サーバー起動

```
python manage.py runserver --settings config.settings.development
```
