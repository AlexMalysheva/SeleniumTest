package ru.aplana.autotest.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.aplana.autotest.pages.AdvancedSearchPage;
import ru.aplana.autotest.steps.MainSteps2;
import ru.aplana.autotest.steps.MainSteps3;

import java.util.List;

import static java.lang.Thread.sleep;

/**
 * Created by AMalysheva on 26.09.2016.
 */
public class TestTelescopes extends BaseTest {
    MainSteps3 mainSteps3 = new MainSteps3();
    @Test
    public void testNew3() throws Exception {
        mainSteps3.goToMarketPage();
        sleep(10000);

        mainSteps3.goToElectronicsPage();
        sleep(10000);

        mainSteps3.goToTelescopesPage();
        sleep(10000);

        mainSteps3.AdvancedSearchPage();
        sleep(10000);

        AdvancedSearchPage.selectMirror_lens();
        AdvancedSearchPage.selectDelivery();
        AdvancedSearchPage.selectPriseTV();

        List<WebElement> items = driver.findElements(By.xpath("//*[@class='snippet-card__header-text']"));
        Assert.assertTrue("Количество элементов не соотвествует ожидаемому", items.size() == 12);
        String firstElement = items.get(0).getText();
        driver.findElement(By.id("header-search")).sendKeys(firstElement);
        AdvancedSearchPage.setSearch();
        Thread.sleep(10000);

        Assert.assertTrue("Элемент не тот", firstElement.equals(AdvancedSearchPage.setOneItem()));
    }
}