package ru.aplana.autotest;

import org.openqa.selenium.JavascriptExecutor;

/**
 * Created by AMalysheva on 21.09.2016.
 */
public class Page {
    private static Page curentPage;

    public static Page getCurrentPage(){
        return curentPage;
    }

    public static void setCurrentPage(Page page){
        curentPage = page;
    }
}

