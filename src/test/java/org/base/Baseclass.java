package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	public static Actions ac;
	public static Robot r;
	
public static void chromeBrowser() {
	
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
}
public static void launchUrl(String url) {
	driver.get(url);
}
public static void maxWindow() {
	driver.manage().window().maximize();
}
public static void implicitWait(int sec) {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
}
public static void fillTextBox(WebElement ref,String val) {
	ref.sendKeys(val);
}
public static void buttonClick(WebElement ref) {
	ref.click();
}
public static String titleFetch() {
	String t = driver.getTitle();
	return t;
}
public static String currentUrl() {
	String c = driver.getCurrentUrl();
	return c;
}
public static String getText(WebElement ref) {
	String txt = ref.getText();
	return txt;	
}
public static String getAttribute(WebElement ref) {
	String a = ref.getAttribute("value");
	return a;
}
public static void moveToElement(WebElement tar) {
	ac=new Actions(driver);
	ac.moveToElement(tar).perform();
}
public static void dragNDrop(WebElement src,WebElement dest) {
	ac=new Actions(driver);
	ac.dragAndDrop(src, dest).perform();
}
public static void rightClick(WebElement tar) {
	ac=new Actions(driver);
	ac.contextClick(tar).perform();
}
public static void doubleClick(WebElement tar) {
	ac=new Actions(driver);
	ac.doubleClick(tar).perform();
}
public static void copy() throws AWTException {
r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_C);

r.keyRelease(KeyEvent.VK_C);
r.keyRelease(KeyEvent.VK_CONTROL);
}
public static void paste() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);

	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
}
public static void cut() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_X);

	r.keyRelease(KeyEvent.VK_X);
	r.keyRelease(KeyEvent.VK_CONTROL);
}
public static void selectAll() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_A);
}
public static void enter() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
}
public static void tab() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_TAB);
	r.keyRelease(KeyEvent.VK_TAB);
}
public static void keyUp() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_UP);
	r.keyRelease(KeyEvent.VK_UP);
}
public static void keyDown() throws AWTException {
	r=new Robot();
	r.keyPress(KeyEvent.VK_DOWN);
	r.keyRelease(KeyEvent.VK_DOWN);
}
public static void takeScreenshot(String picName) {
	TakesScreenshot tk=(TakesScreenshot)driver;
	File src = tk.getScreenshotAs(OutputType.FILE);
	File dest=new File("C:\\Users\\Subash\\eclipse-workspace\\ProjectGmail\\Screenshot\\"+picName+".png");
}
public static void scrollUp(WebElement ref) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].ScrollIntoView(false)", ref);
}
public static void scrollDown(WebElement ref) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].ScrollIntoView(true)", ref);
}
public static void jsSetattribute(String val,WebElement ref) {
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript(val, ref);
}













	
	
	
}
