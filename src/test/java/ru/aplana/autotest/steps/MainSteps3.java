package ru.aplana.autotest.steps;

import ru.aplana.autotest.Page;
import ru.aplana.autotest.pages.*;
import ru.yandex.qatools.allure.annotations.Step;

import static ru.aplana.autotest.Page.setCurrentPage;

/**
 * Created by AMalysheva on 27.09.2016.
 */
public class MainSteps3 {
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
    @Step("переход на страницу \"Телескопы\"")
    public void goToTelescopesPage(){
        ElectronicsPage page = (ElectronicsPage) Page.getCurrentPage();
        page.goToTelescopesPage();
        Page.setCurrentPage(new TelescopesPage());
    }
    @Step("переход на страницу \"Расширенный поиск\"")
    public void AdvancedSearchPage() {
       TelescopesPage page = (TelescopesPage) Page.getCurrentPage();
        page.goToAdvancedSearchPage();
        Page.setCurrentPage(new AdvancedSearchPage());
    }



}
