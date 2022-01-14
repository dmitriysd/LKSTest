package supplier;


import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SupplierPage extends BaseTest{


    @Test
           public void supplierPage() {

        WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
        login.sendKeys("adm");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("adm");
        WebElement buttonSubmit = driver.findElement(By.xpath("//div[contains(text(),'Войти')]/parent::*"));
        buttonSubmit.sendKeys(Keys.ENTER);
        driver.navigate().to("http://spms-ddb-web.spms-develop.apps.ds1-genr01.corp.dev.vtb/#/suppliers/fa66a3bd-164c-495d-83ae-1bef0591eefa");


    }
}
