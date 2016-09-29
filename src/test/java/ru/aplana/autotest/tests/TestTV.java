package ru.aplana.autotest.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.aplana.autotest.pages.AdvancedSearchPage;
import ru.aplana.autotest.pages.TVPage;
import ru.aplana.autotest.steps.MainSteps6;

import java.util.List;

import static java.lang.Thread.sleep;

/**
 * Created by AMalysheva on 27.09.2016.
 */
public class TestTV extends BaseTest {
    MainSteps6 mainSteps6 = new MainSteps6();
    @Test
    public void testNew6() throws Exception {
        mainSteps6.goToMarketPage();
        sleep(10000);

        mainSteps6.goToElectronicsPage();
        sleep(10000);

        mainSteps6.goToTVPage();
        sleep(10000);

        mainSteps6.AdvancedSearchPage();
        sleep(10000);
        AdvancedSearchPage.selectPriseTV();
        AdvancedSearchPage.setLg();
        AdvancedSearchPage.setSamsyng();
        sleep(10000);


        List<WebElement> items = driver.findElements(By.xpath("//*[@class='snippet-card__header-text']"));
        Assert.assertTrue("Количество элементов не соотвествует ожидаемому", items.size() == 12);
        String firstElement = items.get(0).getText();
        driver.findElement(By.id("header-search")).sendKeys(firstElement);
        AdvancedSearchPage.setSearch();
        Thread.sleep(10000);

        Assert.assertTrue("Элемент не тот", firstElement.equals(AdvancedSearchPage.setOneItem()));

    }
}
