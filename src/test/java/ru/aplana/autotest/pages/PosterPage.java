package ru.aplana.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.aplana.autotest.Page;
import ru.aplana.autotest.tests.BaseTest;

/**
 * Created by AMalysheva on 28.09.2016.
 */
public class PosterPage extends Page{
        public PosterPage() {
    PageFactory.initElements(BaseTest.getDriver(), this);}


        @FindBy(linkText = "30, пт")
        public WebElement data;
        public void setData(){
            data.click();
        }

@FindBy(linkText = "Культура")
    public WebElement cultura;

    public void setCultura() {
        cultura.click();
    }
}
