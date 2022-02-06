package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class IntroPage extends BasePage {

    public IntroPage(AndroidDriver driver) {
        super(driver);
    }

    MobileElement signInBtn = (MobileElement) driver.findElement(By.id("com.plenart.organizeme:id/btn_sign_in_intro"));
    MobileElement signUpBtn = (MobileElement) driver.findElement(By.id("com.plenart.organizeme:id/btn_sign_up_intro"));
    MobileElement textAppDescr = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[3]"));

    public void signInBtnClick() {
        signInBtn.click();
    }
    public void signUpBtnClick() {
        signUpBtn.click();
    }

    public void getAppDescr() {
        System.out.println(textAppDescr.getText());
    }

}
