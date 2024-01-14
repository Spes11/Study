# 先頭から数行だけを取得する

```SQL
SELCT <列名>... FROM <テーブル名
ORDER BY <列名>
OFFSET <先頭から除外する行数> ROWS
（FETCH NEXT 取得行数 ROWS ONLY）
```
