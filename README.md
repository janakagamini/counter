Exploring Detox by Wix for end to end testing of native mobile apps.

This repo has an iOS app and an Android app, both with identical functionality. Detox is used to test this functionality by writing tests once (in javascript) and executing on both platforms.

1. Follow the [Getting Started](https://github.com/wix/Detox/blob/master/docs/Introduction.GettingStarted.md) at [Detox](https://github.com/wix/Detox) to prep your environment. Don't forget to take a look at the [Android Guide](https://github.com/wix/Detox/blob/master/docs/Introduction.Android.md) as well but most likely you don't have to do anything since this project already has a working android project.
1. Clone this project.
1. `cd` int `test`
1. Run `npm i`
1. Run `detox build -c <pick a configuration from package.json>`
1. Run `detox test -c <pick a configuration from package.json>`