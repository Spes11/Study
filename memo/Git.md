# 設定確認

### email を確認

```bash
git config user.email
```

### username を確認

```bash
git config user.name
```

<br>

# 設定変更

> git config --global user.<設定変更したいもの><br>

例：username を変更する<br>

```bash
git config --global user.name
```

<br>

# エラー

```bash
$ git push
fatal: The current branch main has no upstream branch.
To push the current branch and set the remote as upstream, use

   git push --set-upstream origin main

To have this happen automatically for branches without a tracking
upstream, see 'push.autoSetupRemote' in 'git help config'.
```

### 背景

ローカルで作成したリポジトリを git hub で作成したリモートリポジトリに push する際に発生。

### 原因

Git で現在のブランチがリモートリポジトリに対応する上流ブランチ（upstream branch）を持っていない場合に表示される<br>

#### 「upstream branch」（上流ブランチ）とは

リモートブランチに対応するブランチ。具体的には、あるローカルブランチがリモートリポジトリの特定のブランチを「追跡（トラッキング）」しているとき、そのリモートブランチがそのローカルブランチの「upstream branch」と見なされます。Upstream ブランチが設定されていると、例えば git pull や git push の際に、対応するリモートブランチが自動的に選択されます。

git push --set-upstream origin main のコマンドを使用すると、現在の main ブランチが origin リモートリポジトリの main ブランチを upstream として設定されます。これにより、今後は git push や git pull を実行する際に、明示的にリモートブランチを指定する必要がなくなります。

Upstream ブランチが設定されていない場合、Git は特定のリモートブランチがどのブランチにプッシュまたはプルされるべきかを判断できません。そのため、上述のエラーメッセージが表示され、--set-upstream オプションを使用して明示的に設定するよう促されることがあります。

### 対処法

下記コマンドを入力

```bash
git push --set-upstream origin main
```

<br>

# 起動時のディレクトリ（ホームディレクトリ）の変更

### 1.タスクバーにピン止めしている場合

C:\Users\ユーザ名\AppData\Roaming\Microsoft\InternetExplorer\Quick Launch\User Pinned\TaskBar

プロパティから「作業フォルダー」をホームディレクトリに設定したいパスを設定する。

### 2.していない場合

1.Git bash を起動<br> 2.「.bash_profile」の有無を確認。ないなら作成<br>
mkdir .bash_profile<br> 3.「.bash_profile」をエディタで開き「ホームディレクトリに設定したいパスを記載」
