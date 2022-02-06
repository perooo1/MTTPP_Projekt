package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MembersPage extends BasePage{
    public MembersPage(AndroidDriver driver) {
        super(driver);
    }

    MobileElement email = (MobileElement) driver.findElement(By.id("com.plenart.organizeme:id/tv_member_email_item_member"));
    MobileElement backBtn = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"] "));

    public String getEmail(){
        System.out.println("Email is " + email.getText());
        return email.getText();
    }

    public void backBtnClick(){
        backBtn.click();
    }

}
