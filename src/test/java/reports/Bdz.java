package reports;

import base.aside.AsideReportsTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Bdz extends AsideReportsTest {

    @Test
    public void bdz() {
        WebElement bdzButton = driver.findElement(By.xpath("//p[contains(text(),'Отчет по БДЗ')]/parent::*"));
        bdzButton.click();
        WebElement tab = driver.findElement(By.xpath("//h2[contains(text(),'Отчёт БДЗ')]"));

        assertThat(tab.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(tab.getText()).as("Wrong page!").isEqualTo("Отчёт БДЗ");
    }
}
