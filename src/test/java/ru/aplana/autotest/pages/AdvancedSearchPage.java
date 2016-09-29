package ru.aplana.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.aplana.autotest.Page;
import ru.aplana.autotest.tests.BaseTest;


public class AdvancedSearchPage extends Page {
    public AdvancedSearchPage() {
        PageFactory.initElements(BaseTest.getDriver(), this);
    }


    @FindBy(id = "glf-pricefrom-var") // надо ввести значение
    public static WebElement price;
    public static void selectPrise() { // не уверен что так
        price.sendKeys("5000");
    }

    @FindBy(id = "glf-pricefrom-var")
    public static  WebElement priceTV;
    public static void selectPriseTV() { // не уверен что так
        priceTV.sendKeys("20000");

    }
    @FindBy (xpath = "//div[7]/span/label")
    public static WebElement lg;
    public static void setLg (){
        lg.click();
    }

    @FindBy(xpath = "//div[3]/span/label")
    public static WebElement samsyng;
    public static void setSamsyng(){
        samsyng.click();
    }

    @FindBy(xpath = "//div[3]/span/label")
    public static WebElement beats;
    public static void selectBeats() {
        beats.click();
    }

    @FindBy(xpath = "//div[2]/div/div/span/span/input")
    public static WebElement canon;
    public static void selectCanon() {
        canon.click();

    }

    @FindBy(xpath = "//div[9]/span/label")
    public static WebElement mir;
    public static void selectMirror_lens(){//переименнуй
        mir.click();
    }


    @FindBy (xpath = "//div[9]/span/span/input")
    public static WebElement delivery;
    public static void selectDelivery(){
        delivery.click();
    }

    @FindBy(xpath ="//button[@type='submit']")
    public static WebElement search;
            public static void setSearch(){
    search.click();}


    @FindBy(css = "h1.title.title_size_22")
public static WebElement oneItem;
    public static String setOneItem(){
        String oneItems1 = oneItem.getText();
return oneItems1;
    }



}
