package com.stt.euopauto.user;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;

public class Euoptest1loginTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void euoptest1login() {
		driver.get("http://192.168.1.181:8080/euop/user/login.do");
		driver.manage().window().setSize(new Dimension(1898, 1032));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("zhangjh2@sh-stt.com");
		driver.findElement(By.id("mobile")).sendKeys("15800407048");
		driver.findElement(By.id("imageValidCode2")).sendKeys("1");
		driver.findElement(By.id("ssoLogin")).click();
		// 处理弹窗
		checkAlert();
		//弹窗关闭后返回
		driver.switchTo().defaultContent();
		driver.findElement(By.id("txtMobileSn")).sendKeys("1");
		driver.findElement(By.id("btnVaild")).click();
		//等待完成登录
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThat(driver.findElement(By.cssSelector(".active")).getText(), is("个人工作台"));
		//截图
		
	}

	private void checkAlert() {
		// 处理登录时的弹窗
		try {
			WebDriverWait wait = new WebDriverWait(driver, 2);
			wait.until(ExpectedConditions.alertIsPresent());
			Alert alert = driver.switchTo().alert();
			//校验弹窗内容
			assertThat(alert.getText(), is("短信发送成功，请接收"));
			alert.accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}