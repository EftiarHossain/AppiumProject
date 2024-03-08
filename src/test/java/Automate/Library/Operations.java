package Automate.Library;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.util.Set;
import java.util.concurrent.TimeUnit;


public class Operations {

    static MobileElement findElement(By path, AndroidDriver<MobileElement> driver) {
        MobileElement el = driver.findElement(path);
        return el;
    }

    public static MobileElement scrollIntoElementByText(String text, AndroidDriver<MobileElement> driver) {
        return driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+text+"\").instance(0))");
    }

    public static void click(By locator, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElement(locator, driver);
        el.click();
    }

    public static void sendText(By locator, String text, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElement(locator, driver);
        el.clear();
        el.sendKeys(text);
    }

    public static void hideKeyboard(AndroidDriver<MobileElement> driver) {
        driver.hideKeyboard();
    }

    public static void matchText(By locator, String expectedText, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElement(locator, driver);
        String actualText = el.getText();
        Assert.assertEquals(actualText, expectedText);
    }

    public static boolean verifyElementIsDisplayed(By locator, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElement(locator, driver);
        boolean isDisplayed = el.isDisplayed();
        System.out.println("Element displayed is : " + isDisplayed);
        return isDisplayed;
    }

    public static boolean verifyElementIsEnabled(By locator, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElement(locator, driver);
        boolean isEnabled = el.isEnabled();
        System.out.println("Element enabled is : " + isEnabled);
        return isEnabled;
    }

    public static boolean verifyElementIsSelected(By locator, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElement(locator, driver);
        boolean isSelected = el.isSelected();
        System.out.println("Element selected is : " + isSelected);
        return isSelected;
    }

    public static boolean verifyElementIsPresent(By locator, AndroidDriver<MobileElement> driver) {
        MobileElement el = findElement(locator, driver);
        if (el != null) {
            System.out.println("Element is Present");
            return true;
        } else {
            System.out.println("Element is Absent");
            return false;
        }
    }

    public static void switchToWebView(AndroidDriver<MobileElement> driver) {

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Set<String> availableContexts = driver.getContextHandles();
        System.out.println("Total No of Context Found After we reach to WebView = " + availableContexts.size());
        for (String context : availableContexts) {
            if (context.contains("WEBVIEW")) {
                System.out.println("Context Name is " + context);
                // 4.3 Call context() method with the id of the context you want to access and change it to WEBVIEW_1
                //(This puts Appium session into a mode where all commands are interpreted as being intended for automating the web view)
                driver.context(context);
                driver.manage().timeouts().implicitlyWait(160, TimeUnit.SECONDS);
                break;
            }
        }
    }

    public static void switchToMobileView(AndroidDriver<MobileElement> driver) {

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        Set<String> availableContexts = driver.getContextHandles();
        System.out.println("Total No of Context Found After we reach to MobileView = " + availableContexts.size());
        for (String context : availableContexts) {
            if (context.contains("NATIVE")) {
                System.out.println("We are Back to " + context);
                driver.context(context);
            }
        }
    }
}

