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
Gitで現在のブランチがリモートリポジトリに対応する上流ブランチ（upstream branch）を持っていない場合に表示される<br>

#### 「upstream branch」（上流ブランチ）とは
リモートブランチに対応するブランチ。具体的には、あるローカルブランチがリモートリポジトリの特定のブランチを「追跡（トラッキング）」しているとき、そのリモートブランチがそのローカルブランチの「upstream branch」と見なされます。Upstreamブランチが設定されていると、例えば git pull や git push の際に、対応するリモートブランチが自動的に選択されます。

git push --set-upstream origin main のコマンドを使用すると、現在の main ブランチが origin リモートリポジトリの main ブランチをupstreamとして設定されます。これにより、今後は git push や git pull を実行する際に、明示的にリモートブランチを指定する必要がなくなります。

Upstreamブランチが設定されていない場合、Gitは特定のリモートブランチがどのブランチにプッシュまたはプルされるべきかを判断できません。そのため、上述のエラーメッセージが表示され、--set-upstream オプションを使用して明示的に設定するよう促されることがあります。

### 対処法
下記コマンドを入力
>git push --set-upstream origin main


