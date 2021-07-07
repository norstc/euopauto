package com.stt.euopauto.rdms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.stt.euopauto.utils.ConfUtil;

public class RdmsLoginTestByChrome {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@BeforeMethod
	public void setUp() {
		//需要设置一下，chromedriver的位置，否则会找不到这个最新的，尤其是其他路径有旧版本的时候
		System.setProperty("webdriver.chrome.driver","E:\\tech\\selenium\\chromedriver\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@AfterMethod
	public void tearDown() {
		// driver.quit();
	}

	public String waitForWindow(int timeout) {
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Set<String> whNow = driver.getWindowHandles();
		Set<String> whThen = (Set<String>) vars.get("window_handles");
		if (whNow.size() > whThen.size()) {
			whNow.removeAll(whThen);
		}
		return whNow.iterator().next();
	}

	// 登录，因为每次重新打开页面都需要登录
	@Test(enabled = false)
	public void rdmsLogin() {
		driver.get("http://192.168.0.224:8080/login.jsp");
		driver.manage().window().setSize(new Dimension(1832, 828));
		driver.findElement(By.cssSelector(".form-item:nth-child(4) > .placeholder")).click();
		driver.findElement(By.name("username")).sendKeys("zhangjh");
		driver.findElement(By.cssSelector(".form-item:nth-child(5) > .placeholder")).click();
		String rdmsPassword = ConfUtil.getConfUtil("config/password.properties").getProperties().getProperty("rdmsPassword");
		System.out.println("rdmsPassword is: " + rdmsPassword);
		driver.findElement(By.name("password")).sendKeys(rdmsPassword);
		driver.findElement(By.cssSelector(".loginButton")).click();
		// 项目评审
		// driver.findElement(By.cssSelector("#j_node_id4 .menu-text")).click();
		sleep(5000);
		// .list-left > strong:nth-child(2)
		//Assert.assertEquals(driver.findElement(By.cssSelector(".list-left > strong:nth-child(2)")).getText(),"待办工作");
		// .error
		Assert.assertEquals(driver.findElement(By.cssSelector(".error")).getText(),"用户名或密码错误，请重新输入！");
	}

	
	@Test(enabled = true)
	public void rdmsLoginWrongPassword() {
		driver.get("http://192.168.0.224:8080/login.jsp");
		driver.manage().window().setSize(new Dimension(1832, 828));
		driver.findElement(By.cssSelector(".form-item:nth-child(4) > .placeholder")).click();
		driver.findElement(By.name("username")).sendKeys("zhangjh");
		driver.findElement(By.cssSelector(".form-item:nth-child(5) > .placeholder")).click();
		String rdmsPassword = ConfUtil.getConfUtil("config/password.properties").getProperties().getProperty("rdmsPassword");
		System.out.println("rdmsPassword is: " + rdmsPassword);
		driver.findElement(By.name("password")).sendKeys(rdmsPassword);
		driver.findElement(By.cssSelector(".loginButton")).click();
		// 项目评审
		// driver.findElement(By.cssSelector("#j_node_id4 .menu-text")).click();
		sleep(5000);
		// .list-left > strong:nth-child(2)
		//Assert.assertEquals(driver.findElement(By.cssSelector(".list-left > strong:nth-child(2)")).getText(),"待办工作");
		// .error
		Assert.assertEquals(driver.findElement(By.cssSelector(".error")).getText(),"用户名或密码错误，请重新输入！");
	}
	
	
	private void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
}
