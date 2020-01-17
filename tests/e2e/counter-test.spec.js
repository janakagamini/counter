describe('Example', () => {
  beforeEach(async () => {
    await device.relaunchApp();
  });

  it('increment by 1 and accept to reset ever 5 increments', async () => {
    let counter = element(by.label('counter'))
    let incrementButton = element(by.label('incrementButton'))
    let dialogYesButton = element(by.text('YES'))
    let dialogNoButton = element(by.text('NO'))

    await expect(counter).toBeVisible();
    await expect(incrementButton).toBeVisible();

    await expect(counter).toHaveText('0')

    for (i = 1; i <= 4; i++) {
      await incrementButton.tap()
      await expect(counter).toHaveText(i.toString())
    }
    await incrementButton.tap()
    await expect(dialogYesButton).toBeVisible();
    await expect(dialogNoButton).toBeVisible();

    await dialogYesButton.tap();
    await expect(counter).toHaveText('0')

    for (i = 1; i <= 4; i++) {
      await incrementButton.tap()
      await expect(counter).toHaveText(i.toString())
    }
    await incrementButton.tap()
    await expect(dialogYesButton).toBeVisible();
    await expect(dialogNoButton).toBeVisible();

    await dialogNoButton.tap();
    await expect(counter).toHaveText('5')

    for (i = 1; i <= 4; i++) {
      await incrementButton.tap()
      await expect(counter).toHaveText((i + 5).toString())
    }
    await incrementButton.tap()
    await expect(dialogYesButton).toBeVisible();
    await expect(dialogNoButton).toBeVisible();

    await dialogNoButton.tap();
    await expect(counter).toHaveText('10')
  });
});
