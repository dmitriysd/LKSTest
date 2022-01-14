package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.File;

public abstract class BaseTest {
    protected WebDriver driver;

    @BeforeClass
    public void openLKS() {
        File file = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.get("http://spms-ddb-web.spms-develop.apps.ds1-genr01.corp.dev.vtb/#/");

    }

    @AfterClass
    public void tearDown(){
       // driver.quit();

    }
    @AfterMethod

    void clearCookiesAndLocalStorage() {
    //    driver.manage().deleteAllCookies();
    }
}
