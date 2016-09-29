package ru.aplana.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.aplana.autotest.Page;
import ru.aplana.autotest.tests.BaseTest;

/**
 * Created by AMalysheva on 21.09.2016.
 */
public class MarketHomePage extends Page{

    public MarketHomePage(){
        PageFactory.initElements(BaseTest.getDriver(), this);
    }

    @FindBy(linkText = "Электроника")
    public WebElement electronics;

      public void goToElectronicsPage() {

        electronics.click();

    }



}
