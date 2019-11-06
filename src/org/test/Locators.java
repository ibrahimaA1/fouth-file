package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mohammedibrahimji\\Downloads\\eclipse-committers-oxygen-3a-win32-x86_64\\eclipse\\SeleniumLocators\\drive\\chromedriver.exe");
WebDriver d = new ChromeDriver();
d.get("https://infinity.icicibank.com/corp/Login.jsp ");
WebElement s = d.findElement(By.xpath("//input[@name=\"AuthenticationFG.USER_PRINCIPAL\"]"));
s.sendKeys("58590888");


}
}
