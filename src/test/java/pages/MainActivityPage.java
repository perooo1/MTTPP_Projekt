package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MainActivityPage extends BasePage {
    public MainActivityPage(AndroidDriver driver) {
        super(driver);
    }

    MobileElement viewHolder = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.TextView[1]"));
    MobileElement hamburgerMenu = (MobileElement) driver.findElement(By.id("com.plenart.organizeme:id/fab_create_board"));
    MobileElement myProfileNav = (MobileElement) driver.findElement(By.id("com.plenart.organizeme:id/nav_my_profile"));

    public void viewHolderClick(){
        viewHolder.click();
    }
    public void viewHamburgerClick(){
        hamburgerMenu.click();
    }
    public void myProfileNavClick(){
        myProfileNav.click();
    }

}
