package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SignUpPage extends BasePage {

    public SignUpPage(AndroidDriver driver) {
        super(driver);
    }

    MobileElement name = (MobileElement) driver.findElement(By.id("com.plenart.organizeme:id/et_name_sign_up_activity"));
    MobileElement emailEt = (MobileElement) driver.findElement(By.id("com.plenart.organizeme:id/et_email_sign_up_activity"));
    MobileElement passwordEt = (MobileElement) driver.findElement(By.id("com.plenart.organizeme:id/et_password_sign_up_activity"));
    MobileElement signUpBtn = (MobileElement) driver.findElement(By.id("com.plenart.organizeme:id/btn_sign_in_sign_up_activity"));
    MobileElement signUpDesc = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView"));

    public void enterName(String name) {
        this.name.sendKeys(name);

    }

    public void enterEmail(String email) {
        emailEt.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordEt.sendKeys(password);
    }

    public void signUpBtnClick() {
        signUpBtn.click();
    }

    public void getSignUpDescription(){
        System.out.println(signUpDesc.getText());
    }

}
