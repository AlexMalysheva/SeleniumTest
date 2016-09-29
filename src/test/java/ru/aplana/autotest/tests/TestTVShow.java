package ru.aplana.autotest.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.aplana.autotest.steps.MainSteps5;

import java.util.List;

import static java.lang.Thread.sleep;

/**
 * Created by AMalysheva on 27.09.2016.
 */
public class TestTVShow extends BaseTest {
    MainSteps5 mainSteps5 = new MainSteps5();
    @Test
    public void testNew5() throws Exception {
        mainSteps5.goToTVShowPage();
        sleep(10000);
        mainSteps5.goToData();
        List<WebElement> items = driver.findElements(By.xpath("//body[@id='app']/div/div[3]/div/table/tbody/tr/td/div/div[2]/div/div[4]/div"));
        String firstElement = items.get(0).getText();
        Assert.assertFalse("нет элемента", Boolean.parseBoolean(firstElement));



    }
}
