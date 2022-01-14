package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LogInAdm extends BaseTest{

    @Test
    public void loginAdm() {

        WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
        login.sendKeys("adm");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("adm");
        WebElement buttonSubmit = driver.findElement(By.xpath("//div[contains(text(),'Войти')]/parent::*"));
        buttonSubmit.sendKeys(Keys.ENTER);
    }
}
