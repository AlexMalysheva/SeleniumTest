package ru.aplana.autotest.steps;

import org.openqa.selenium.support.FindBy;
import ru.aplana.autotest.Page;
import ru.aplana.autotest.pages.*;
import ru.yandex.qatools.allure.annotations.Step;

import static ru.aplana.autotest.Page.setCurrentPage;

/**
 * Created by AMalysheva on 27.09.2016.
 */
public class MainSteps6 {
    @Step("переход на страницу \"Маркет\"")
    public void goToMarketPage() {
        HomePage homePage = (HomePage) Page.getCurrentPage();
        homePage.goToMarketPage();
        setCurrentPage(new MarketHomePage());
    }

    @Step("переход на страницу \"Электроника\"")
    public void goToElectronicsPage() {
        MarketHomePage page = (MarketHomePage) Page.getCurrentPage();
        page.goToElectronicsPage();
        Page.setCurrentPage(new ElectronicsPage());
    }
    @Step("переход на страниу \"Электроника\"")
    public void goToTVPage(){
        ElectronicsPage page = (ElectronicsPage) Page.getCurrentPage();
        page.goToTVPage();
        Page.setCurrentPage(new TVPage());
    }
    @Step("переход на страницу \"Расширенный поиск\"")//понять как составлять шаги
    public void AdvancedSearchPage() {
        TVPage page = (TVPage) Page.getCurrentPage();
        page.goToAdvancedSearchPage();
        Page.setCurrentPage(new AdvancedSearchPage());
    }
}