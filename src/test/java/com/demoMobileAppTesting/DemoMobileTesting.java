package com.demoMobileAppTesting;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

import java.net.MalformedURLException;

import base.CommonAPI;

public class DemoMobileTesting extends CommonAPI {

    @Test
    public void clickMenu() throws MalformedURLException {
        setUp("Android", "R5CTB189HLY");
        clickByAccessibilityId("open menu");
        System.out.println("Open Menu");
        tapByXpath("//android.view.ViewGroup[@content-desc=\"menu item log in\"]");
        sendTextByAccessibilityId("Username input field", "ABC");
        cleanUp();
    }
    @Test
    public void swipeUpDownAndroid() throws MalformedURLException{
        setUp("Android", "iPhone 14");
        swipeUpDownByXpath("//android.view.ViewGroup[@content-desc=\"products screen\"]", "up");
        swipeUpDownByXpath("//android.view.ViewGroup[@content-desc=\"products screen\"]", "down");
    }
    public void swipeUpDownIOS() throws MalformedURLException{
        setUp("iOS", "R5CTB189HLY");
        clickByAccessibilityId("tab bar option menu");
        tapByXpath("//XCUIElementTypeOther[@name=\"menu item log in\"]");
    }
}



//    @Test
//    public void myDemoAppLaunchAndroid() throws MalformedURLException {
//        setUp("Android", "R5CTB189HLY");
//        clickByaccessibilityId("open menu");
//        System.out.println("Open Menu");
 //       driver.findElement(AppiumBy.accessibilityId("open menu")).click();
//        WebElement logInButton = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"menu item log in\"]"));
//        TouchAction touch = new TouchAction(driver);
//        touch.tap(tapOptions().withElement(element(logInButton))).perform();


//        driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys("ABC");
//    }
//    @Test
//    public void swipeUpDownAndroid() throws MalformedURLException {
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setDeviceName("R5CTB189HLY");
//        options.setApp(System.getProperty("user.dir") + "/src/TestApps/Android-MyDemoApp.apk");
//        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
//
//        RemoteWebElement scrollView = (RemoteWebElement) driver.findElement(By.xpath("\t\n" +
//                "//android.view.ViewGroup[@content-desc=\"products screen\"]"));
//
//        driver.executeScript("gesture: swipe", Map.of("elementId", scrollView.getId(),
//                "percentage", 50,
//                "direction", "up"));
//        driver.executeScript("gesture: swipe", Map.of("elementId", scrollView.getId(),
//                "percentage", 50,
//                "direction", "down"));
//    }






//    @Test
//    public void scrollUpAndroid() throws MalformedURLException {
//        UiAutomator2Options options = new UiAutomator2Options();
//        options.setDeviceName("R5CTB189HLY");
//        options.setApp(System.getProperty("user.dir") + "/src/TestApps/Android-MyDemoApp.apk");
//        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
//
//        RemoteWebElement product = (RemoteWebElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"products screen\"]"));
//
//        driver.executeScript("gesture: swipe", Map.of("elementId", product.getId(),
//                "percentage", 50,
//                "direction", "up"));
//
//    }







//    @Test
//    void iosMyDemoApp() throws MalformedURLException, InterruptedException {
//        XCUITestOptions options = new XCUITestOptions();
//        options.setDeviceName("iPhone 14");
//        options.setApp(System.getProperty("user.dir") + "/TestApps/iOS-MyDemoApp.app");
//        IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/"), options);
//
//        driver.findElement(AppiumBy.accessibilityId("tab bar option menu")).click();
//
//        WebElement logInButton = driver.findElement(By.xpath("//XCUIElementTypeOther[@name=\"menu item log in\"]"));
//        TouchAction touch = new TouchAction(driver);
//        touch.tap(tapOptions().withElement(element(logInButton))).perform();
//
//
//        driver.findElement(AppiumBy.accessibilityId("Username input field")).sendKeys("ABC");
//    }







// 1 Don't set driver
//    @Test
//    public void clickMenu() throws MalformedURLException {
//        setUp("Android", "R5CTB189HLY");
//        clickByaccessibilityIdAndroid("open menu");
//        System.out.println("Open Menu");
//        tapByXpathAndroid("//android.view.ViewGroup[@content-desc=\"menu item log in\"]");
//        System.out.println("Open Menu");
//    }









 // 2 Set Driver
//    @Test
//    public void clickMenu() throws MalformedURLException {
//        setUp("Android", "R5CTB189HLY");
//        clickByaccessibilityIdAndroid("open menu");
//        System.out.println("Open Menu");
//    }

//    @Test
//    public void scrollUpAndroid() throws MalformedURLException{
//        setUp("Android", "R5CTB189HLY");
//        swipeUpDownByXpath("//android.view.ViewGroup[@content-desc=\"products screen\"]", "up");
//        swipeUpDownByXpath("//android.view.ViewGroup[@content-desc=\"products screen\"]", "down");
//    }

//}
