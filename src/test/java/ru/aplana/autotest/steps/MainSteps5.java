package ru.aplana.autotest.steps;

import ru.aplana.autotest.Page;
import ru.aplana.autotest.pages.HomePage;
import ru.aplana.autotest.pages.NewsPage;
import ru.aplana.autotest.pages.TVShowPage;
import ru.yandex.qatools.allure.annotations.Step;

import static ru.aplana.autotest.Page.setCurrentPage;

/**
 * Created by AMalysheva on 27.09.2016.
 */
public class MainSteps5 {
    @Step("переход на страницу \"Телепрограмма\"")
    public void goToTVShowPage() {
        HomePage homePage = (HomePage) Page.getCurrentPage();
        homePage.setTVShow();
        setCurrentPage(new TVShowPage());

    }
    @Step("переход на страницу \"Дата\"")
    public void goToData(){
     TVShowPage page = (TVShowPage) Page.getCurrentPage();
        page.setData();
        page.setShow();
        setCurrentPage(new TVShowPage());

    }




}