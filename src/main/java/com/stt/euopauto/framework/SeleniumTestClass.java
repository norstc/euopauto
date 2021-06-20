package com.stt.euopauto.framework;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/*
 * Selenium 驱动的测试类
 * 注意：只有使用selenium的测试类才用这个，其他非selenium的禁止用这个
 */
public class SeleniumTestClass {
	protected WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;
	
	// 在每个suite前
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("BeforeSuite");
	}

	//在每个test前运行，注意这个test是testng.xml里的test标签
	@BeforeTest
	public void beforeTest() {
		System.out.println("BeforeTest");
		driver = new FirefoxDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
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
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("BeforeMethod");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("AfterMethod");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}

	//在每个test后运行，这个test是testng.xml里的标签test， 不是测试用例
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
		driver.quit();
	}

	//在每个suite后运行
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
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
