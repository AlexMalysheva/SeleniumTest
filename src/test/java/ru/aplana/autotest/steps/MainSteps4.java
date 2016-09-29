package ru.aplana.autotest.steps;

import ru.aplana.autotest.Page;
import ru.aplana.autotest.pages.ElectronicsPage;
import ru.aplana.autotest.pages.HomePage;
import ru.aplana.autotest.pages.NewsPage;
import ru.yandex.qatools.allure.annotations.Step;

import static ru.aplana.autotest.Page.setCurrentPage;

/**
 * Created by AMalysheva on 27.09.2016.
 */
public class MainSteps4 {
    @Step("переход на страницу \"Новости\"")
    public void goToNewsPage() {
        HomePage homePage = (HomePage) Page.getCurrentPage();
        homePage.goToNewsPage();
        setCurrentPage(new NewsPage());
    }
    @Step("переход на страницу \"Экономика\"")
    public void goToEconomicPage(){
    NewsPage page = (NewsPage) Page.getCurrentPage();
    page.goToEconomicPage();
    setCurrentPage(new ElectronicsPage());

}




}

