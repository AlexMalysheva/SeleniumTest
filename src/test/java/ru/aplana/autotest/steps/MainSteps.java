package ru.aplana.autotest.steps;

import ru.aplana.autotest.Page;
import ru.aplana.autotest.pages.*;
import ru.yandex.qatools.allure.annotations.Step;

import static ru.aplana.autotest.Page.setCurrentPage;

/**
 * Created by AMalysheva on 21.09.2016.
 */
public class MainSteps {


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
        setCurrentPage(new ElectronicsPage());
    }

    @Step("переход на страницу\"Наушники\"")
    public void goToHeadphonesPage() {
        ElectronicsPage page = (ElectronicsPage) Page.getCurrentPage();
        page.goToHeadphonesPage();
        setCurrentPage(new HeadphonesPage());
    }




    @Step("переход на страницу \"Расширенный поиск\"")//понять как составлять шаги
    public void AdvancedSearchPage() {
        HeadphonesPage page = (HeadphonesPage) Page.getCurrentPage();
        page.goToAdvancedSearchPage();
        setCurrentPage(new AdvancedSearchPage());
    }


}

