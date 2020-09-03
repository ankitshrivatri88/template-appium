package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCases extends BaseClass {

    @Test
    public void TestCase1() {

        driver.get("https://www.google.de");
        driver.findElement(By.id("com.android.chrome:id/infobar_close_button")).click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.id("com.android.chrome:id/search_box_text")).sendKeys("First Automation");
        driver.findElement(By.id("com.android.chrome:id/search_box_text")).sendKeys(Keys.ENTER);

        System.out.println("First Tests Completed");

    }

}
