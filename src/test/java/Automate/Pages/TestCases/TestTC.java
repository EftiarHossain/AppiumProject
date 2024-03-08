package Automate.Pages.TestCases;

import Automate.Library.BaseClass;
import Automate.Pages.Implementation.SignIn;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

public class TestTC extends BaseClass {

    SignIn sign = new SignIn();

    @BeforeTest
    public void setupDriver() throws MalformedURLException {

        setUp();
    }

    @Test
    public void method_test() {
        sign.methodVerify(driver, getMail(), getPassword());
    }



    @AfterTest
    public void  testCaseTearDown() {
        tearDown();
    }

}
