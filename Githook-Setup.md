# NewGamePlus - Git Hook set up

## Pre-set up for using our git hooks
We're using [husky](https://typicode.github.io/husky/#/) as our git-hook manager. 


### pre-commit hook
Install ktlint as below.
````bash
curl -sSLO https://github.com/pinterest/ktlint/releases/download/0.41.0/ktlint && chmod a+x ktlint
````

### commit-message hook
To set up husky with commit-lint as a commit-message hook, please follow the steps below.
Install and configure commitlint.

If not already defined in `.commitlintrc.json`,  configuraion for conventional-commits should be copied into your project at the root level [.commitlintrc.json](/.commitlintrc.json)


### Husky Setup
````bash
npm install --save-dev @commitlint/{cli,config-conventional}
````
Install husky as devDependency and perform initial setup
````bash
npm install husky --save-dev
npx husky install
````

Copy the [commit message hook](/.husky/commit-msg) and the [pre-commit code formatting hook](/.husky/pre-commit) into your `.husky` folder

Re-run husky install to activate the git-hooks
````bash
npx husky install
````

> **Note**
> Make sure to add `/node_modules` to your `.gitignore` before performing any commits!
> `package.json` and `package-lock.json` should be committed to your repo, along with the `.husky` directory

You're good to go!

