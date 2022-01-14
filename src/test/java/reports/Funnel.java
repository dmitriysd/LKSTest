package reports;

import base.aside.AsideReportsTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Funnel extends AsideReportsTest {

    @Test
    public void funnel() {
        WebElement funnelButton = driver.findElement(By.xpath("//p[contains(text(),'Отчет Воронка')]/parent::*"));
        funnelButton.click();
        WebElement tab = driver.findElement(By.xpath("//h2[contains(text(),'Отчет')]"));

        assertThat(tab.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(tab.getText()).as("Wrong page!").isEqualTo("Отчеты");
    }
}
