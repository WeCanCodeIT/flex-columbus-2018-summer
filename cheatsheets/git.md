# Git Cheatsheet

This cheatsheet has info on what Git is, how it works, and the commands you can use with it.

## Git

Git is distributed version control system we use to manage code:
* Distributed: means multiple computers have copies of the code, and different individuals work with their own copies. Git allows programmers to work on the same project separately, then merge their updates together.
* Version Control: means Git keeps track of the changes in each file over time, so you never lose old code and you can clearly see WHAT you changed, WHEN you changed it, and WHY you did so. 

## GitHub

GitHub is a service that hosts Git repositories so there is a central location from which your team can coordinate their work.

GitHub allows us to create pull requests, which mean: "Pull my updated code into your master branch and make it official!"

## Key Terms
A `repository` is a directory (folder) that Git is tracking. Git tracks each repository by creating and updating a hidden `.git` directory inside it. That directory stores the changes that happen in the repository over time. Git is **NOT** automatic: it doesn't watch your files and automatically save their history. You have to manually choose which files to `commit` to the history.

Git allows us to "split" a repository's history by creating `branches`. A Git repository starts out with a single branch called `master`. This is where all official updates should go. When we want to add a new feature, we should create another branch to work with so we don't mess up master. This also allows different programmers to add different features at the same time without disturbing the current working code in master.

When we use services like GitHub, we are working with a `remote` repository. The remote repository on GitHub allows our entire team to stay on the same page. We call this centralized repository `origin`. We can `clone` a repository from GitHub (copy it to our own machine) and `pull` changes from an existing repository (download updates made by our team members). We can also `push` our own updates to GitHub.

GitHub allows us to create pull requests, which mean: "Pull my updated code into your master branch and make it official!" The `pull` command pulls updates from GitHub to our machine, but a pull request is a way of asking the repository owner to `merge` our updates into their code. Specifically, we will ask them to merge our feature branch into the master branch.

## Git Commands

`git` is the singular command for working with Git. The commands below start with `git`. If you want to see a list of the different things Git can do, run `git` by itself with no arguments.

**Anything in `<Angular Brackets>` is a placeholder - you can enter whatever you want there. Don't type the brackets!**

|Command|Effect|
|---|---|
|`git init`|Initializes a Git repository, creating the hidden `.git` directory inside it.|
|`git add <filename>`|Adds a file named `<filename>` to the currently staged commit. This doesn't actually commit the file to history. It just adds it to the list of files that will be committed.|
|`git add .`|Adds all changed files to the currently staged commit.|
|`git commit`|Commits staged files (their changes) to the repository history. If you call `git commit` without specifying a message, Git will open a text editor so you can add a message.|
|`git commit -m "<Commit Message>"`|Commits staged files to the repository history. You can put anything you want between the quotation marks - this is how you will know what you changed in your code, so make it relevant!|
|`git clone <repository-url>`|Clones a remote Git repository into the current folder. It will create a new folder for the repository based on the name of the remote repository|
|`git clone <repository-url> <new-folder-name>`|Clones a remote Git repository into the current folder. It will create a new folder for the repository based on the name you provided.|
|`git push`|Pushes your updated code to GitHub.|
|`git pull`|Pulls other people's updates to the repository down from GitHub.|
