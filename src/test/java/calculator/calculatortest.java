package calculator;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class calculatortest {
    static AppiumDriver<MobileElement> driver;

    public static void  main(String[] args) {
        //Appium Code
        try {
            openCalculator();
        } catch (MalformedURLException e) {
            e.getCause();
            e.getMessage();
            e.printStackTrace();
        }

    }

    public static void openCalculator() throws MalformedURLException {

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel 2");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "9.0.0");
        cap.setCapability("appPackage", "com.android.calculator2");
        cap.setCapability("appActivity", "com.android.calculator2.Calculator");

        URL url= new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AppiumDriver<MobileElement>(url, cap);
        System.out.println("App Started");

        MobileElement two= driver.findElement(By.id("com.android.calculator2:id/digit_2"));
        MobileElement plus= driver.findElement(By.id("com.android.calculator2:id/op_add"));
        MobileElement three= driver.findElement(By.id("com.android.calculator2:id/digit_3"));
        MobileElement equal= driver.findElement(By.id("com.android.calculator2:id/eq"));

        two.click();
        plus.click();
        three.click();
        equal.click();
    }
}
