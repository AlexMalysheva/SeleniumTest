package ru.aplana.autotest.steps;

import ru.aplana.autotest.Page;
import ru.aplana.autotest.pages.*;
import ru.yandex.qatools.allure.annotations.Step;

/**
 * Created by AMalysheva on 26.09.2016.
 */
public class MainSteps2 { @Step("переход на страницу \"Маркет\"")
public void goToMarketPage() {
    HomePage homePage = (HomePage) Page.getCurrentPage();
    homePage.goToMarketPage();
    Page.setCurrentPage(new MarketHomePage());

}

    @Step("переход на страницу \"Электроника\"")
    public void goToElectronicsPage() {
        MarketHomePage page = (MarketHomePage) Page.getCurrentPage();
        page.goToElectronicsPage();
        Page.setCurrentPage(new ElectronicsPage());
    }

    @Step("переход на страницу \"Фотоапараты\"")
    public void goToCameraPage() {
        ElectronicsPage page = (ElectronicsPage) Page.getCurrentPage();
        page.goToCameraPage();
        Page.setCurrentPage(new CameraPage());
    }
    @Step("переход на страницу \"Расширенный поиск\"")//понять как составлять шаги
    public void AdvancedSearchPage() {
        CameraPage page = (CameraPage) Page.getCurrentPage();
        page.goToAdvancedSearchPage();
        Page.setCurrentPage(new AdvancedSearchPage());
    }
}
