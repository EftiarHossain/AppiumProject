package Automate.Pages.Interface;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public interface SignIn_Interface {
	
	void methodVerify(AndroidDriver<MobileElement> driver, String email, String password);
}
