# 設定確認
### emailを確認
>git config user.email

### usernameを確認
>git config user.name

<br>

# 設定変更
>git config --global user.<設定変更したいもの><br>

例：usernameを変更する<br>
git config --global user.name


<br>

# エラー

>$ git push
>fatal: The current branch main has no upstream branch.
>To push the current branch and set the remote as upstream, use
>
>   git push --set-upstream origin main
>
>To have this happen automatically for branches without a tracking
>upstream, see 'push.autoSetupRemote' in 'git help config'.

### 背景
ローカルで作成したリポジトリをgit hubで作成したリモートリポジトリにpushする際に発生。

### 原因
puahしたローカルリポジトリが

### 対処法
下記コマンドを入力
>git push --set-upstream origin main


