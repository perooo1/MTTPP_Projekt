package scripts;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestCase {

    AndroidDriver driver;

    @BeforeClass()
    public void setUp() throws MalformedURLException{
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "D:\\Labosi2021\\MTTPP\\projekt\\OrganizeMe_base.apk");
        capabilities.setCapability("VERSION", "9.0");
        capabilities.setCapability("deviceName", "emulator");
        capabilities.setCapability("platformName", "Android");

        capabilities.setCapability("wdaStartupRetries", "4");
        capabilities.setCapability("iosInstallPause","8000" );
        capabilities.setCapability("wdaStartupRetryInterval", "20000");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    @Test
    public void TestCaseGetAppDesc(){
        IntroPage introPage = new IntroPage(driver);
        introPage.getAppDescr();

        teardown();
    }

    @Test
    public void TestCaseGetSignInDesc(){

        try {
            setUp();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        IntroPage introPage = new IntroPage(driver);
        introPage.signInBtnClick();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.getSignInDescription();

        driver.navigate().back();

        teardown();
    }

    @Test
    public void TestCaseGetSignUpDesc(){
        try {
            setUp();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        IntroPage introPage = new IntroPage(driver);
        introPage.signUpBtnClick();

        SignUpPage page = new SignUpPage(driver);
        page.getSignUpDescription();

        //driver.navigate().back();
        teardown();
    }

    @Test
    public void TestCaseRegisterUser(){
        try {
            setUp();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        IntroPage introPage = new IntroPage(driver);
        introPage.signUpBtnClick();

        SignUpPage page = new SignUpPage(driver);
        page.enterName("mujo678");
        page.enterEmail("mujo69@email.com");
        page.enterPassword("111111");
        page.signUpBtnClick();


        //driver.navigate().back();
        teardown();
    }


    @Test
    public void TestCaseLogin(){

        try {
            setUp();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        //  try {
        //    Thread.sleep(4000);     //wait for splash screen(3s) to finish
        //} catch (InterruptedException e) {
        //   e.printStackTrace();
        //}

        IntroPage introPage = new IntroPage(driver);
        introPage.signInBtnClick();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterEmail("ana1@ana.com");
        loginPage.enterPassword("111111");
        loginPage.signInBtnClick();

        teardown();
    }


    @Test(dependsOnMethods = {"TestCaseLogin"})
    public void TestCaseGetTaskDueDate(){

        try {
            setUp();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        MainActivityPage mainActivityPage = new MainActivityPage(driver);
        mainActivityPage.viewHolderClick();



        TaskListPage taskListPage = new TaskListPage(driver);
        taskListPage.taskClick();

        TaskDetailsPage taskDetailsPage = new TaskDetailsPage(driver);
        taskDetailsPage.getDueDate();


        taskListPage.threeDotMenuClick();
        taskListPage.menuClick();

        MembersPage membersPage = new MembersPage(driver);
        membersPage.getEmail();



        driver.quit();

    }


    public void teardown(){
        driver.quit();
    }


}
