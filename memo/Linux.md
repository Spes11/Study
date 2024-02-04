# 「WSL から切断されました」のエラー

PowerShell から以下コマンドを実行し Ubuntu を再起動する。

```text
wsl -shutdown
```

# フォルダの権限を付与

```bash
sudo chmod 777 <ディレクトリ名>
```

# フォルダの権限設定状況の確認

```bash
ls -l
```

■ 実行結果

```bash
spec@DESKTOP-RYOHEI:/usr/local/src$ ls -l
total 4
drwxrwxrwx 2 root root 4096 Jan 11 22:46 dev
```

### `drwxrwxrwx`の意味

- ### d
  ディレクトリ
- ### rwx
  「オーナー」「グループ」「その他」  
  三者それぞれに以下権限が付与されている。
  - r=読み取り
  - w=書き込み
  - x=実行

# mkdir -p

`mkdir -p` を使用すると、指定したディレクトリが存在しなくても、そのディレクトリとその親ディレクトリがすべて作成される。

```bash
mkdir -p /path/to/some/directory
```

このコマンドは `/path/to/some/directory` というディレクトリを作成しますが、もし `/path` や `/path/to` といったディレクトリが存在しない場合でも、自動的にそれらのディレクトリも作成される。

# Linux 主なコマンド

![Alt text](/memo/png/image.png)

# mnt

mount の略。 デバイスやリモートのファイルシステムを特定のディレクトリに接続するために使用されるディレクトリの１つ。

# 今いるディレクトリ

カレントディレクトリ、ワーキングディレクトリと言う。

```bash
$ pwd
```
