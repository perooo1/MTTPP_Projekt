package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    public LoginPage(AndroidDriver driver) {
        super(driver);
    }

    MobileElement emailEt = (MobileElement) driver.findElement(By.id("com.plenart.organizeme:id/et_email_sign_in_activity"));
    MobileElement passwordEt = (MobileElement) driver.findElement(By.id("com.plenart.organizeme:id/et_password_sign_in_activity"));
    MobileElement signInBtn = (MobileElement) driver.findElement(By.id("com.plenart.organizeme:id/btn_sign_in_sign_in_activity"));

    MobileElement signInDescription = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"));

    public void enterEmail(String email){
        emailEt.sendKeys(email);
    }

    public void enterPassword(String password){
        passwordEt.sendKeys(password);
    }
    public void signInBtnClick(){
        signInBtn.click();
    }
    public void getSignInDescription(){
        System.out.println(signInDescription.getText());
    }

}
