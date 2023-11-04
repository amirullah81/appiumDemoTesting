package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

import java.net.MalformedURLException;
import java.net.URL;

public class LaunchApp {
  //  static AppDriver driver;
    public static void androidLaunch(UiAutomator2Options options) throws MalformedURLException {
  AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
        AppDriver.setDriver(driver);
        System.out.println("Android driver is set");
    }

    public static void iOSLaunch(XCUITestOptions options) throws MalformedURLException {
        IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
        AppDriver.setDriver(driver);
        System.out.println("iOS driver is set");
    }
}
