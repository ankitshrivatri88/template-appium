package tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseClass {

    static AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void setup() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel 2");
        cap.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0.0");
//        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
//        cap.setCapability(MobileCapabilityType.APP,"/Users/ankitshrivatri/Desktop/projects/AppiumTests/src/test/resources/app/Sample Android App Login Test_v4.0_apkpure.com.apk" );
        cap.setCapability("chromedriverExecutable","/Users/ankitshrivatri/Desktop/projects/chromedriver");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

        try {
            URL url= new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url, cap);
//            driver = new AndroidDriver<MobileElement>(url, cap);
//            driver = new IOSDriver<MobileElement>(url, cap);

        } catch (MalformedURLException e) {
            System.out.println("Cause is:" +e.getCause());
            System.out.println("Cause is:" +e.getMessage());
            e.printStackTrace();
        }



    }


    @AfterTest
    public void teardown(){
        driver.close();
        driver.quit();
    }
}

