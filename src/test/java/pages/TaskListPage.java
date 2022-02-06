package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class TaskListPage extends BasePage{
    public TaskListPage(AndroidDriver driver) {
        super(driver);
    }

    MobileElement threeDotMenu = (MobileElement) driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
    MobileElement menu = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout/android.widget.LinearLayout"));
    MobileElement task = (MobileElement) driver.findElement(By.xpath("//*[@text=\"HP and the Philosopher's stone\"]"));

    public void threeDotMenuClick(){
        threeDotMenu.click();
    }

    public void menuClick(){
        menu.click();
    }

    public void taskClick(){
        task.click();
    }

}
