package Automate.Pages.Implementation;

import Automate.Pages.Interface.SignIn_Interface;
import static Automate.Pages.ObjectRepository.SignIn_OR.Locator;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import Automate.Library.Operations;

public class SignIn implements SignIn_Interface {


    @Override
    public  void methodVerify(AndroidDriver<MobileElement> driver, String email, String password){

        Operations.switchToWebView(driver);
        Operations.verifyElementIsDisplayed(Locator.loginLink,driver);
        Operations.verifyElementIsPresent(Locator.loginLink, driver);
        Operations.matchText(Locator.loginLink, "Sign in", driver);
        Operations.click(Locator.loginLink, driver);
        Operations.switchToMobileView(driver);
        Operations.verifyElementIsEnabled(Locator.userName, driver);
        Operations.click(Locator.userName, driver);
        Operations.sendText(Locator.userName, email, driver);
        Operations.hideKeyboard(driver);
        Operations.click(Locator.signUpLink, driver);
        Operations.scrollIntoElementByText("Already have", driver);
        Operations.verifyElementIsSelected(Locator.termsView, driver);
        Operations.click(Locator.termsView, driver);
        Operations.verifyElementIsSelected(Locator.termsView, driver);

    }
}
