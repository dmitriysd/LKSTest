package base.aside;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class AsideTasksTest extends BaseTest {

    @Test
    public void mainPage(){
        WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
        login.sendKeys("adm");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("adm");
        WebElement buttonSubmit = driver.findElement(By.xpath("//div[contains(text(),'Войти')]/parent::*"));
        buttonSubmit.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement tab = driver.findElement(By.xpath("//h2[contains(text(),'Задачи')]"));


        assertThat(tab.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(tab.getText()).as("Wrong page!").isEqualTo("Задачи");

    }
}
