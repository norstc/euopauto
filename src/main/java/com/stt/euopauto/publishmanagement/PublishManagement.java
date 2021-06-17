package com.stt.euopauto.publishmanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

import com.stt.euopauto.framework.SeleniumTestClass;

public class PublishManagement extends SeleniumTestClass{
	@Test
	public void testClickPublishManagement() {
		driver.get("http://192.168.1.181:8080/euop/user/login.do");
		//等待完成
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    driver.manage().window().setSize(new Dimension(1900, 1003));
	    driver.findElement(By.linkText("发布管理")).click();
	    
	  //等待完成
  		try {
  			Thread.sleep(10000);
  		} catch (InterruptedException e) {
  			// TODO Auto-generated catch block
  			e.printStackTrace();
  		}
  		
	    driver.switchTo().frame(1);
	    driver.findElement(By.id("searchType")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("searchType"));
	      dropdown.findElement(By.xpath("//option[. = '工单编号']")).click();
	    }
	    driver.findElement(By.cssSelector("#searchType > option:nth-child(2)")).click();
	    driver.findElement(By.name("searchKey")).click();
	    driver.findElement(By.name("searchKey")).sendKeys("720129");
	    driver.findElement(By.id("searchbtn")).click();
	    assertThat(driver.findElement(By.cssSelector(".popover-show2")).getText(), is("PO5003001000004812021060720129"));
	}
	
}
