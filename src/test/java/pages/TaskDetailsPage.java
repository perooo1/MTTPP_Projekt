package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class TaskDetailsPage extends BasePage{
    public TaskDetailsPage(AndroidDriver driver) {
        super(driver);
    }

    MobileElement dueDate = (MobileElement) driver.findElement(By.id("com.plenart.organizeme:id/tv_select_due_date"));

    public String getDueDate(){
        System.out.println("Due date is: " + dueDate.getText());
        return dueDate.getText();
    }
}
