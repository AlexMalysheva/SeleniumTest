package ru.aplana.autotest.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.aplana.autotest.Page;
import ru.aplana.autotest.pages.AdvancedSearchPage;
import ru.aplana.autotest.pages.ElectronicsPage;
import ru.aplana.autotest.steps.MainSteps;
import ru.aplana.autotest.steps.MainSteps2;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.properties.annotations.Resource;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.lang.Thread.sleep;


public class TestCamera extends BaseTest {
    MainSteps2 mainSteps2 = new MainSteps2();//77

    @Test
    public void testNew1() throws Exception {
        mainSteps2.goToMarketPage();
        sleep(10000);

        mainSteps2.goToElectronicsPage();
        sleep(10000);

      mainSteps2.goToCameraPage();
        sleep(10000);

        mainSteps2.AdvancedSearchPage();
        sleep(10000);

        AdvancedSearchPage.selectCanon();
        AdvancedSearchPage.selectPriseTV();

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