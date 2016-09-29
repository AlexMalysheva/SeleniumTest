package ru.aplana.autotest.tests;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import ru.aplana.autotest.pages.AdvancedSearchPage;
import ru.aplana.autotest.pages.HomePage;
import ru.aplana.autotest.pages.MarketHomePage;
import ru.aplana.autotest.steps.MainSteps;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class TestHeadphones extends BaseTest {
    MainSteps mainSteps = new MainSteps();

    @Test
    public void testNew() throws Exception {

        mainSteps.goToMarketPage();
        Thread.sleep(10000);


        mainSteps.goToElectronicsPage();
        Thread.sleep(10000);


        mainSteps.goToHeadphonesPage();
        Thread.sleep(10000);


        mainSteps.AdvancedSearchPage();
        Thread.sleep(10000);


        AdvancedSearchPage.selectPrise();
        AdvancedSearchPage.selectBeats();
        Thread.sleep(10000);


        List<WebElement> items = driver.findElements(By.xpath("//*[@class='snippet-card__header-text']"));
        Assert.assertTrue("Количество элементов не соотвествует ожидаемому", items.size() == 12);
        String firstElement = items.get(0).getText();
        driver.findElement(By.id("header-search")).sendKeys(firstElement);
        AdvancedSearchPage.setSearch();
        Thread.sleep(10000);

        Assert.assertTrue("Элемент не тот", firstElement.equals(AdvancedSearchPage.setOneItem()));





    }


    }






