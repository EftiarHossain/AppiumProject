package Automate.Pages.ObjectRepository;

import org.openqa.selenium.By;

public class SignIn_OR {
	
     public static class Locator{

          //public static String login = "//span[contains(text(),'Sign in')]";
          public static By loginLink = By.xpath("//*[@id=\"start-of-content\"]/div/section/div[2]/header/button");

          public static By userName = By.xpath("//android.widget.EditText[@resource-id='identifier']");

          public static By signUpLink = By.xpath("//android.view.View[@content-desc=\"Sign Up\"]/android.widget.TextView");

          public static By termsView = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.widget.CheckBox");

          public static By textToScroll= By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[6]/android.widget.TextView[1]");


     }
     

     public static class UIElementConstant{

          public static String loginUI = "Sign in";
     
     
     }
     
}
