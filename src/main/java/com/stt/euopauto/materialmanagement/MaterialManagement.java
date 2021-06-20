package com.stt.euopauto.materialmanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.stt.euopauto.framework.SeleniumTestClass;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MaterialManagement extends SeleniumTestClass {
	@Test
	public void testMaterialManagementClick() {
		//driver.get("http://192.168.1.181:8080/euop/user/login.do");
	    driver.manage().window().setSize(new Dimension(1900, 1005));
	    driver.findElement(By.linkText("物料管理")).click();
	    driver.findElement(By.cssSelector(".toggleBtn")).click();
	    driver.switchTo().frame(0);
	    driver.findElement(By.id("leftMarketingMt_1_switch")).click();
	    driver.findElement(By.id("leftMarketingMt_2_switch")).click();
	    driver.findElement(By.id("leftMarketingMt_3_span")).click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(1);
	    driver.findElement(By.id("searchType")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("searchType"));
	      dropdown.findElement(By.xpath("//option[. = '营销活动ID']")).click();
	    }
	    driver.findElement(By.cssSelector("option:nth-child(2)")).click();
	    driver.findElement(By.id("searchKey")).click();
	    driver.findElement(By.id("searchKey")).sendKeys("607001");
	    driver.findElement(By.id("searchbtn")).click();
	    assertThat(driver.findElement(By.cssSelector("tr:nth-child(1) > .popover-show1")).getText(), is("18120210607001"));
	  }
}
