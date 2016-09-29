package ru.aplana.autotest.steps;

import ru.aplana.autotest.Page;
import ru.aplana.autotest.pages.HomePage;
import ru.aplana.autotest.pages.PosterPage;
import ru.aplana.autotest.pages.TVShowPage;
import ru.yandex.qatools.allure.annotations.Step;

import static ru.aplana.autotest.Page.setCurrentPage;

/**
 * Created by AMalysheva on 28.09.2016.
 */
public class MainSteps7 {
    @Step("переход на страницу \"Телепрограмма\"")
    public void goToTVShowPage() {
        HomePage homePage = (HomePage) Page.getCurrentPage();
        homePage.setTVShow();
        setCurrentPage(new TVShowPage());

    }

    @Step("переход на страницу \"Канал Культура\"")
  public void goToCulture(){
        TVShowPage page = (TVShowPage) Page.getCurrentPage();
        page.setData();
        page.setCultura();
        setCurrentPage(new PosterPage());
    }
}