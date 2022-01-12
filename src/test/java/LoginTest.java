import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;


public class LoginTest extends BaseTest {


    @Test
    public void LoginAdm(){

        WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
        login.sendKeys("adm");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("adm");
        WebElement buttonSubmit = driver.findElement(By.xpath("//div[contains(text(),'Войти')]/parent::*"));
        buttonSubmit.sendKeys(Keys.ENTER);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement userProfile = driver.findElement(By.xpath("//a[@title='Открыть профиль']"));
        userProfile.click();
        WebElement role = driver.findElement(By.xpath("//li[6]//div[@title='Администратор прикладной']"));

        assertThat(role.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(role.getText()).as("Wrong role!").isEqualTo("Администратор прикладной");
        assertThat(role.getAttribute("title")).as("Wrong attribute text!").contains("Администратор прикладной");



        WebElement logOut = driver.findElement(By.xpath("//div[contains(text(),('Выйти'))]/parent::*"));
        logOut.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void LoginTop(){
        WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
        login.sendKeys("top");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("top");
        WebElement buttonSubmit = driver.findElement(By.xpath("//div[contains(text(),'Войти')]/parent::*"));
        buttonSubmit.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement userProfile = driver.findElement(By.xpath("//a[@title='Открыть профиль']"));
        userProfile.click();
        WebElement role = driver.findElement(By.xpath("//li[6]//div[@title='Топ-менеджер ДЦБ']"));

        assertThat(role.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(role.getText()).as("Wrong role!").isEqualTo("Топ-менеджер ДЦБ");
        assertThat(role.getAttribute("title")).as("Wrong attribute text!").contains("Топ-менеджер ДЦБ");

        WebElement logOut = driver.findElement(By.xpath("//div[contains(text(),('Выйти'))]/parent::*"));
        logOut.click();
      }

    @Test
    public void LoginCur(){
        WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
        login.sendKeys("cur");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("cur");
        WebElement buttonSubmit = driver.findElement(By.xpath("//div[contains(text(),'Войти')]/parent::*"));
        buttonSubmit.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement userProfile = driver.findElement(By.xpath("//a[@title='Открыть профиль']"));
        userProfile.click();
        WebElement role = driver.findElement(By.xpath("//li[6]//div[@title='Территориальный менеджер']"));

        assertThat(role.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(role.getText()).as("Wrong role!").isEqualTo("Территориальный менеджер");
        assertThat(role.getAttribute("title")).as("Wrong attribute text!").contains("Территориальный менеджер");

        WebElement logOut = driver.findElement(By.xpath("//div[contains(text(),('Выйти'))]/parent::*"));
        logOut.click();
    }
    @Test
    public void LoginLdr(){
        WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
        login.sendKeys("ldr");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("ldr");
        WebElement buttonSubmit = driver.findElement(By.xpath("//div[contains(text(),'Войти')]/parent::*"));
        buttonSubmit.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement userProfile = driver.findElement(By.xpath("//a[@title='Открыть профиль']"));
        userProfile.click();
        WebElement role = driver.findElement(By.xpath("//li[6]//div[@title='Руководитель отдела']"));

        assertThat(role.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(role.getText()).as("Wrong role!").isEqualTo("Руководитель отдела");
        assertThat(role.getAttribute("title")).as("Wrong attribute text!").contains("Руководитель отдела");

        WebElement logOut = driver.findElement(By.xpath("//div[contains(text(),('Выйти'))]/parent::*"));
        logOut.click();
    }

    @Test
    public void LoginMng(){
        WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
        login.sendKeys("mng");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("mng");
        WebElement buttonSubmit = driver.findElement(By.xpath("//div[contains(text(),'Войти')]/parent::*"));
        buttonSubmit.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement userProfile = driver.findElement(By.xpath("//a[@title='Открыть профиль']"));
        userProfile.click();
        WebElement role = driver.findElement(By.xpath("//li[6]//div[@title='Менеджер ДЦБ']"));

        assertThat(role.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(role.getText()).as("Wrong role!").isEqualTo("Менеджер ДЦБ");
        assertThat(role.getAttribute("title")).as("Wrong attribute text!").contains("Менеджер ДЦБ");

        WebElement logOut = driver.findElement(By.xpath("//div[contains(text(),('Выйти'))]/parent::*"));
        logOut.click();
    }
    @Test
    public void LoginCurDrb(){
        WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
        login.sendKeys("cur-drb");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("cur-drb");
        WebElement buttonSubmit = driver.findElement(By.xpath("//div[contains(text(),'Войти')]/parent::*"));
        buttonSubmit.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement userProfile = driver.findElement(By.xpath("//a[@title='Открыть профиль']"));
        userProfile.click();
        WebElement role = driver.findElement(By.xpath("//li[6]//div[@title='Куратор ДРБ']"));

        assertThat(role.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(role.getText()).as("Wrong role!").isEqualTo("Куратор ДРБ");
        assertThat(role.getAttribute("title")).as("Wrong attribute text!").contains("Куратор ДРБ");

        WebElement logOut = driver.findElement(By.xpath("//div[contains(text(),('Выйти'))]/parent::*"));
        logOut.click();
    }
    @Test
    public void LoginSup(){
        WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
        login.sendKeys("sup");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("sup");
        WebElement buttonSubmit = driver.findElement(By.xpath("//div[contains(text(),'Войти')]/parent::*"));
        buttonSubmit.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement userProfile = driver.findElement(By.xpath("//a[@title='Открыть профиль']"));
        userProfile.click();
        WebElement role = driver.findElement(By.xpath("//li[5]//div[@title='Техническая поддержка']"));

        assertThat(role.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(role.getText()).as("Wrong role!").isEqualTo("Техническая поддержка");
        assertThat(role.getAttribute("title")).as("Wrong attribute text!").contains("Техническая поддержка");

        WebElement logOut = driver.findElement(By.xpath("//div[contains(text(),('Выйти'))]/parent::*"));
        logOut.click();
    }
    @Test
    public void LoginAib(){
        WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
        login.sendKeys("aib");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("aib");
        WebElement buttonSubmit = driver.findElement(By.xpath("//div[contains(text(),'Войти')]/parent::*"));
        buttonSubmit.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement userProfile = driver.findElement(By.xpath("//a[@title='Открыть профиль']"));
        userProfile.click();
        WebElement role = driver.findElement(By.xpath("//li[6]//div[@title='Аудитор ИБ']"));

        assertThat(role.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(role.getText()).as("Wrong role!").isEqualTo("Аудитор ИБ");
        assertThat(role.getAttribute("title")).as("Wrong attribute text!").contains("Аудитор ИБ");

        WebElement logOut = driver.findElement(By.xpath("//div[contains(text(),('Выйти'))]/parent::*"));
        logOut.click();
    }
    @Test
    public void LoginAnl(){
        WebElement login = driver.findElement(By.xpath("//input[@name='username']"));
        login.sendKeys("anl");
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("anl");
        WebElement buttonSubmit = driver.findElement(By.xpath("//div[contains(text(),'Войти')]/parent::*"));
        buttonSubmit.click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement userProfile = driver.findElement(By.xpath("//a[@title='Открыть профиль']"));
        userProfile.click();
        WebElement role = driver.findElement(By.xpath("//li[6]//div[@title='Аналитик ДЦБ']"));

        assertThat(role.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(role.getText()).as("Wrong role!").isEqualTo("Аналитик ДЦБ");
        assertThat(role.getAttribute("title")).as("Wrong attribute text!").contains("Аналитик ДЦБ");

        WebElement logOut = driver.findElement(By.xpath("//div[contains(text(),('Выйти'))]/parent::*"));
        logOut.click();
    }
}

