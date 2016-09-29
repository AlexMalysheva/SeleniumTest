package ru.aplana.autotest.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.aplana.autotest.Page;
import ru.aplana.autotest.pages.HomePage;
import ru.aplana.autotest.steps.MainSteps4;

import java.util.List;

import static java.lang.Thread.sleep;

/**
 * Created by AMalysheva on 26.09.2016.
 */
public class TestNews extends BaseTest {
    MainSteps4 mainSteps4 = new MainSteps4();
    @Test
    public void testNew4() throws Exception {
        mainSteps4.goToNewsPage();
        sleep(10000);
        mainSteps4.goToEconomicPage();


        List<WebElement> items = driver.findElements(By.xpath("//div[6]/div/div/div/div/a/span"));
        Assert.assertTrue("Количество элементов не соотвествует ожидаемому", items.size() == 1);



    }
}
