package com.stt.euopauto.rdms;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAuditTest {
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

	
	

	// 发起新评审
		@Test(enabled=true)
		public void addAudit() {
			driver.get("http://192.168.0.224:8080/explorer.jsp");
			driver.manage().window().setSize(new Dimension(1832, 828));
			driver.findElement(By.cssSelector(".form-item:nth-child(4) > .placeholder")).click();
			driver.findElement(By.name("username")).sendKeys("zhangjh");
			driver.findElement(By.cssSelector(".form-item:nth-child(5) > .placeholder")).click();
			driver.findElement(By.name("password")).sendKeys("!QAZ2wsx3edc");
			driver.findElement(By.cssSelector(".loginButton")).click();
			sleep(1000);
			// 直接打开 新增评审 页面, 不建议这样用，因为会破坏页面的frame结构，要重新调整脚本
			//driver.get("http://192.168.0.224:8080/project/actions/TechDecisionAction.do?method=newPage&personalView=true");
			// 项目评审
			driver.findElement(By.xpath("//*[@id='J_word_4']")).click();
			// 发起评审
			 driver.switchTo().frame(1);
			 driver.findElement(By.xpath("//*[@id='tool5']")).click();
			sleep(1000);
			// 所属项目
			 driver.switchTo().frame(0);
			 // 用side 重新录制，点输入框，不是点下拉按钮
			driver.findElement(By.cssSelector("#projectId > .cb-input")).click();
			driver.findElement(By.cssSelector("#projectId > .cb-input")).sendKeys("eu");
			sleep(1000); //必须加延时，等euop项目 刷出来
			driver.findElement(By.xpath("//li[contains(.,\'EUOP项目\')]")).click();

			// 评审名称
			sleep(1000);
			driver.findElement(By.name("title")).click();
			sleep(1000);
			driver.findElement(By.name("title")).sendKeys("临时账号申请_普通账号权限申请信息" + getCurrentDate()+ " 0900-1800");

			// 评审流程
			driver.findElement(By.cssSelector("#categoryId > .cb-input")).click();
			driver.findElement(By.cssSelector("#categoryId > .cb-input")).sendKeys("权限审批流程");
			sleep(1000); //必须加延时，等  刷出来
			driver.findElement(By.xpath("//li[contains(.,\'权限审批流程\')]")).click();

			//受理人
			driver.findElement(By.cssSelector("#accepter > .cb-input")).click();
			driver.findElement(By.cssSelector("#accepter > .cb-input")).sendKeys("李宝");
			sleep(1000); //必须加延时，等  刷出来
			driver.findElement(By.xpath("//li[contains(.,\'李宝\')]")).click();
			
			// 申请理由
			driver.switchTo().frame(1);
			driver.findElement(By.cssSelector("html")).click();
			sleep(1000);
			{
				WebElement element = driver.findElement(By.cssSelector(".cke_editable"));
				js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = '由于一级手厅新增位置对接联调，需要账号权限查看应用和接口机日志'}"
								, element);
			}
			//返回上一级frame，即从所见即所得 那层返回上一次，side 自动导出来的是 defaultContent 不适用
			driver.switchTo().parentFrame();
			// 提交
			 driver.findElement(By.cssSelector("td:nth-child(1) > input")).click();
			//取消
			sleep(5000);
			//driver.findElement(By.xpath("//input[@value='取 消']")).click();
		}

		private String getCurrentDate() {
			// 返回当前日期
			// 20210702
			LocalDate localDate = LocalDate.now();
			int year = localDate.getYear();
			int mon = localDate.getMonthValue();
			int day = localDate.getDayOfMonth();
			String ret = String.format("%04d%02d%02d",year, mon, day);
			
			return ret;
		}
		private void sleep(int i) {
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		}
}
