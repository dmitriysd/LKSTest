package reports;

import base.aside.AsideReportsTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Sla extends AsideReportsTest {

    @Test
      public void sla() {
        WebElement slaButton = driver.findElement(By.xpath("//p[contains(text(),'Отчет SLA')]/parent::*"));
        slaButton.click();
        WebElement tab = driver.findElement(By.xpath("//h1[contains(text(),'Отчет по SLA выведения поставщика')]"));

        assertThat(tab.isDisplayed()).as("Element has not been displayed!").isTrue();
        assertThat(tab.getText()).as("Wrong page!").isEqualTo("Отчет по SLA выведения поставщика");
    }
}
