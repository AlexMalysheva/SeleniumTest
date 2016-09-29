package ru.aplana.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.aplana.autotest.Page;
import ru.aplana.autotest.tests.BaseTest;

/**
 * Created by AMalysheva on 27.09.2016.
 */
public class TelescopesPage extends Page {
    public TelescopesPage() {
        PageFactory.initElements(BaseTest.getDriver(), this);}
        @FindBy(css="a.black")
        public WebElement advancedSearchPage;

    public void goToAdvancedSearchPage() {

        advancedSearchPage.click();
    }
}
