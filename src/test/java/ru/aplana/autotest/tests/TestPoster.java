package ru.aplana.autotest.tests;

import org.junit.Assert;
import org.junit.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ru.aplana.autotest.steps.MainSteps7;

import java.util.List;

import static java.lang.Thread.sleep;

/**
 * Created by AMalysheva on 28.09.2016.
 */
public class TestPoster extends BaseTest {
    MainSteps7 mainSteps7 = new MainSteps7();
    @Test
    public void testNew7() throws Exception {
        mainSteps7.goToTVShowPage();
        sleep(10000);
        mainSteps7.goToCulture();
        List<WebElement> items = driver.findElements(By.className("tv-event__title-inner"));
        String firstElement = items.get(0).getText();
        Assert.assertFalse("нет элемента", Boolean.parseBoolean(firstElement));

    }
}