# NewGamePlus - Starter Project For Android
This project serves as a template for library or app based projects.

![Build](https://github.com/krogertechnology/kap-np-android-newgameplus/actions/workflows/commit.yml/badge.svg) [![ktlint](https://img.shields.io/badge/code%20style-%E2%9D%A4-FF4081.svg)](https://ktlint.github.io/)

To use it [click here](https://github.com/krogertechnology/kap-np-android-newgameplus/generate) or use the green `Use this template` button at the top of the page.

## Using this template

This project uses [gradle version catalogs](https://docs.gradle.org/current/userguide/platforms.html). The [catalog](https://github.com/krogertechnology/kap-np-android-newgameplus/blob/main/gradle/libs.versions.toml) lives in the `gradle` folder

Ground Kontrol updates the versions at least quarterly, in accordance with our [care and feeding checklist](https://github.com/krogertechnology/kap-np-documentation/blob/master/guidelines/android_library_care_and_feeding.md), but you'll likely want to run `./gradlew dependencyUpdates` in the project root to get the latest updates.

---

## Changing project, module, and artifact names

You can refactor module names as normal, by right-clicking them in the project pane. You'll need to
find and replace references to it manually, however.

Do a project-wide search and replace of `NewGamePlus` with the name of your new project. Most importantly,
ensure that it is changed in `settings.gradle.kts`.

Changing the project root directory name must be done from outside Android Studio. Close Android
Studio before changing it in order to avoid IDE confusion.
I'd suggest just renaming the directory with a new name in the terminal using
`mv NewGamePlus/ MyNewProject/`.
Then, use the "open an existing project" option to open your newly renamed copy.

If your project exists outside the native-platform space, be sure to change the group id when
updating the publishing tasks in your build scripts.

---

## Using our release publishing CI flow

Ground Kontrol uses a [shared workflow](https://github.com/krogertechnology/kap-np-android-workflows/) for all of our repositories. You're welcome to use this directly or use it as inspriation for your own workflows.

We're currently working on breaking these out into actions within the workflow repository in order to be more composable.

If the current workflow setup doesn't fit your use case we'd love to hear more and if it's possible to support you in some way. Please reach out via our [teams channel](https://teams.microsoft.com/l/channel/19%3a84c93131b09a414e807260913441f8d6%40thread.skype/Android?groupId=22436d9e-3df2-4bff-be35-074608859941&tenantId=8331e14a-9134-4288-bf5a-5e2c8412f074)

We publish tags and releases on Github automatically using a tool called [semantic-release]([https://github.com/semantic-release](https://github.com/semantic-release/semantic-release).
This tool generates version numbers based on commit messages to the main, alpha, and beta branches using conventional
commit messages. As part of the pipeline, we check that messages meet these criteria. You can learn
more about conventional commits [here](https://www.conventionalcommits.org/en/v1.0.0/).

You'll need to add credentials to your pipeline to properly build and optionally, publish to artifactory. In your repository, navigate
Settings -> Secrets -> Actions and create the following secrets:
- KT_JFROG_USERID
  - required
  - read only credentials to get gradle dependencies
- KT_JFROG_TOKEN
  - required
  - read only credentials to get gradle dependencies
- ARTIFACTORY_USERNAME
  - optional
  - write credentials for publishing to artifactory
- ARTIFACTORY_PASSWORD
  - optional
  - write credentials for publishing to artifactory

---

## Git-hook Setup
We use a tool called `husky` to setup our git hooks. [Here's more info](Githook-Setup.md) about what hooks it sets up, but `npm i` will get it up and running

---

## Releases
semantic-release will release:
* regular releases to the default distribution channel from the branch main
* prereleases to the beta distribution channel from the branch beta
* prereleases to the alpha distribution channel from the branch alpha
If you would like to introduce more distribution-channels to your release workflow, you could use a custom configuration as mentioned [here](https://github.com/semantic-release/semantic-release/blob/master/docs/usage/workflow-configuration.md#workflow-configuration)
