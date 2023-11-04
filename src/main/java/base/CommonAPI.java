package base;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.options.XCUITestOptions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.util.Map;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;


public class CommonAPI {
    //1 Don't set Driver

    //    public static AndroidDriver androidDriver;
//    public static IOSDriver iosDriver;
//    static AppDriver driver;

    @BeforeMethod
    public void setUp(String PlatformName, String DeviceName) throws MalformedURLException {
        if (PlatformName == "Android") {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName(DeviceName);
            options.setApp(System.getProperty("user.dir") + "/src/TestApps/Android-MyDemoApp.apk");
            LaunchApp.androidLaunch(options);
        } else if (PlatformName == "iOS") {
            XCUITestOptions options = new XCUITestOptions();
            options.setDeviceName("iPhone 14");
            options.setApp(System.getProperty("user.dir") + "/TestApps/iOS-MyDemoApp.app");
            LaunchApp.iOSLaunch(options);
        }
    }

    @AfterMethod
        public void cleanUp() {
        AppDriver.getDriver().quit();
    }

    public void clickByAccessibilityId(String locator) {
        AppDriver.getDriver().findElement(AppiumBy.accessibilityId(locator)).click();
    }
    public void clickByXpath(String locator) {
        AppDriver.getDriver().findElement(By.xpath(locator)).click();
    }

    public void tapByXpath(String locator){
        WebElement appElement = AppDriver.getDriver().findElement(By.xpath(locator));
        TouchAction touch = new TouchAction((PerformsTouchActions) AppDriver.getDriver());
        touch.tap(tapOptions().withElement(element(appElement))).perform();
    }

    public void tapByAccessibilityId(String locator){
        WebElement appElement = AppDriver.getDriver().findElement(AppiumBy.accessibilityId(locator));
        TouchAction touch = new TouchAction((PerformsTouchActions) AppDriver.getDriver());
        touch.tap(tapOptions().withElement(element(appElement))).perform();
    }

    public void sendTextByAccessibilityId(String locator, String keyText){
        AppDriver.getDriver().findElement(AppiumBy.accessibilityId(locator)).sendKeys(keyText);
    }

    public void sendTextByXpath(String locator, String keyText){
        AppDriver.getDriver().findElement(By.xpath(locator)).sendKeys(keyText);
    }

    public void swipeUpDownByXpath(String locator, String deriction){
        RemoteWebElement scrollView = (RemoteWebElement) AppDriver.getDriver().findElement(By.xpath("\t\n" +
                "//android.view.ViewGroup[@content-desc=\"products screen\"]"));

        ((JavascriptExecutor)AppDriver.getDriver()).executeScript("gesture: swipe", Map.of("elementId", scrollView.getId(),
                "percentage", 50,
                "direction", deriction));
    }

}







//        if (PlatformName == "Android") {
//            UiAutomator2Options options = new UiAutomator2Options();
//            options.setDeviceName(DeviceName);
//            options.setApp(System.getProperty("user.dir") + "/src/TestApps/Android-MyDemoApp.apk");
//            androidDriver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
//        } else if (PlatformName == "iOS") {
//            XCUITestOptions options = new XCUITestOptions();
//            options.setDeviceName("iPhone 14");
//            options.setApp(System.getProperty("user.dir") + "/TestApps/iOS-MyDemoApp.app");
//            iosDriver = new IOSDriver(new URL("http://127.0.0.1:4723/"), options);
//        }
//    }

//        public void clickByaccessibilityIdAndroid(String locator){
//        androidDriver.findElement(AppiumBy.accessibilityId(locator)).click();
//    }
//    public void clickByaccessibilityIdIOS(String locator){
//        iosDriver.findElement(AppiumBy.accessibilityId(locator)).click();
//    }
//


//    @AfterMethod
//    public void cleanUp() {
//        androidDriver.quit();
//        iosDriver.quit();
//
//    }





//    public void clickByaccessibilityIdAndroid(String locator){
//        androidDriver.findElement(AppiumBy.accessibilityId(locator)).click();
//    }
//    public void clickByaccessibilityIdIos(String locator){
//        iosDriver.findElement(AppiumBy.accessibilityId(locator)).click();
//    }
//
//    public void tapByXpathAndroid(String locator){
//        WebElement appElement = androidDriver.findElement(By.xpath(locator));
//        TouchAction touch = new TouchAction(androidDriver);
//        touch.tap(tapOptions().withElement(element(appElement))).perform();
//    }



// 2 Set Driver
//    static AppDriver driver;
//    public void setUp(String PlatformName, String DeviceName) throws MalformedURLException {
//        if (PlatformName == "Android") {
//            UiAutomator2Options options = new UiAutomator2Options();
//            options.setDeviceName(DeviceName);
//            options.setApp(System.getProperty("user.dir") + "/src/TestApps/Android-MyDemoApp.apk");
//            LaunchApp.androidLaunch(options);
//        } else if (PlatformName == "iOS") {
//            XCUITestOptions options = new XCUITestOptions();
//            options.setDeviceName("iPhone 14");
//            options.setApp(System.getProperty("user.dir") + "/TestApps/iOS-MyDemoApp.app");
//            LaunchApp.iOSLaunch(options);
//        }
//    }
//
//    public void clickByaccessibilityId(String locator){
//        AppDriver.getDriver().findElement(AppiumBy.accessibilityId(locator)).click();
//    }
//
//    public void swipeUpDownByXpath(String locator, String direction){
//        RemoteWebElement product = (RemoteWebElement) AppDriver.getDriver().findElement(By.xpath(locator));
//        ((JavascriptExecutor)AppDriver.getDriver()).executeScript("gesture: swipe", Map.of("elementId", product.getId(),
//                "percentage", 50,
//                "direction", direction));
//    }
//}

