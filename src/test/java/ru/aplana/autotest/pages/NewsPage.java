package ru.aplana.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.aplana.autotest.Page;
import ru.aplana.autotest.tests.BaseTest;

/**
 * Created by AMalysheva on 27.09.2016.
 */
public class NewsPage extends Page {
    public NewsPage(){
        PageFactory.initElements(BaseTest.getDriver(), this);}
        @FindBy(linkText = "Экономика")
        public WebElement ecomic;
    public void goToEconomicPage(){
        ecomic.click();

}
}
