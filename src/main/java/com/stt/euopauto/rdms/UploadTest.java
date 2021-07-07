package com.stt.euopauto.rdms;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

public class UploadTest {
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

	
	

	// 上传文档 
	@Test(enabled=true)
	public void uploadDocument() {
		//登录
		driver.get("http://192.168.0.224:8080/login.jsp");
		driver.manage().window().setSize(new Dimension(1832, 828));
		driver.findElement(By.cssSelector(".form-item:nth-child(4) > .placeholder")).click();
		driver.findElement(By.name("username")).sendKeys("zhangjh");
		driver.findElement(By.cssSelector(".form-item:nth-child(5) > .placeholder")).click();
		driver.findElement(By.name("password")).sendKeys("!QAZ2wsx3edc");
		driver.findElement(By.cssSelector(".loginButton")).click();
		sleep(1000);
		
		driver.get("http://192.168.0.224:8080/explorer.jsp");
	    driver.manage().window().setSize(new Dimension(1832, 790));
	    //点击 文档
	    driver.findElement(By.cssSelector("#DocCenter > .text")).click();
	    // 左边栏： 北京门户2020年技术服务-》工程文档
	    driver.findElement(By.id("J_word_13")).click();
	    driver.findElement(By.id("J_word_34")).click();
	    sleep(1000);
	    driver.switchTo().frame(1);
	    sleep(1000);
	    driver.switchTo().frame(0);
	    sleep(1000);
	    driver.findElement(By.linkText("账号管理")).click();
	    sleep(5000);
	   
	    //这里找不到 “账号申请”
	    // /html/body/div[1]/form/table/tbody/tr/td[17]/div/a
	    //driver.findElement(By.xpath("/html/body/div[1]/form/table/tbody/tr/td[17]/div/a"));
	    // 重新加载页面后再找
	    driver.get("http://192.168.0.224:8080/explorer.jsp");
	    driver.manage().window().setSize(new Dimension(1832, 790));
	    sleep(1000);
	    driver.switchTo().frame(1);
	    sleep(1000);
	    driver.switchTo().frame(0);
	    driver.findElement(By.linkText("账号申请")).click();
	    sleep(1000);
	    // 直接找不到，先重新加载页面后再找
	    driver.get("http://192.168.0.224:8080/explorer.jsp");
	    driver.manage().window().setSize(new Dimension(1832, 790));
	    sleep(1000);
	    driver.switchTo().frame(1);
	    sleep(1000);
	    driver.switchTo().frame(0);
	    driver.findElement(By.linkText("2021年")).click();
	    sleep(1000);
	    //点击上传
	    sleep(5000);
	    driver.switchTo().parentFrame();
	    driver.findElement(By.id("tool2")).click();
	    driver.switchTo().frame(0);
	    sleep(5000);//需要加延时
	    // cssSelector: .uploadfile
	    // driver.findElement(By.cssSelector(".uploadfile")).click();
	    // 这个无法直接点击，需要改成browser action
	    Actions actions = new Actions(driver);
	    actions.moveToElement(driver.findElement(By.cssSelector(".uploadfile"))).click().build().perform();
	    //此时会弹出文件上传的窗口
	    // 还有两个步骤
	    // 1. 输入文件名： E:\zjh\work\stt-it\普通账号申请记录\普通用户权限申请表-20210708 0900-1800-张俊华.doc
	    // 2. 点击 打开
	    // 此时 上传文件提示框 会显示为 ： C:\fakepath\普通用户权限申请表-20210706 0900-1800-张俊华.doc
	    // 使用autoit 编写脚本，转换为exe后，从这里调用
	    Runtime runtime = Runtime.getRuntime();
	    String uploaderPath = "E:\\tech\\selenium\\upload.exe";
	    try {
			runtime.exec(uploaderPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    //driver.findElement(By.name("formFile")).sendKeys("C:\\fakepath\\普通用户权限申请表-20210706 0900-1800-张俊华.doc");
	    //点击提交
	    //driver.findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(3) > input")).click();
	}

	//关联文档，依赖于 新增评审 和上传文档
	//@Test(dependsOnMethods= {"addAudit","uploadDocument"})
	public void connectDocument() {
		//TODO:	
	}
	
	private void sleep(int i) {
		try {
			Thread.sleep(i);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}
	
}
