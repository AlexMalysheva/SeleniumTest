package ru.aplana.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.aplana.autotest.Page;
import ru.aplana.autotest.tests.BaseTest;

/**
 * Created by AMalysheva on 28.09.2016.
 */
public class TVShowPage extends Page {
    public TVShowPage() {
        PageFactory.initElements(BaseTest.getDriver(), this);}


        @FindBy(linkText = "30, пт")
    public WebElement data;
    public void setData(){
        data.click();
    }
    @FindBy(xpath = "//body[@id='app']/div/div[3]/div/div[6]/div[2]/div/div/div[2]/div/div[2]/div/div/div[8]/a/div/div")
    public WebElement show;
    public void setShow(){
        show.click();
    }
    @FindBy(linkText = "Культура")
    public WebElement cultura;

    public void setCultura() {
        cultura.click();
    }

    }

