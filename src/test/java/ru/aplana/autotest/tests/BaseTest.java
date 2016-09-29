package ru.aplana.autotest.tests;



import java.io.IOException;
import java.lang.annotation.Annotation;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

import junit.framework.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.aplana.autotest.Page;
import ru.aplana.autotest.pages.HomePage;
import ru.yandex.qatools.allure.annotations.Attachment;
import ru.yandex.qatools.properties.annotations.Resource;

import static ru.yandex.qatools.properties.annotations.Resource.*;


public class BaseTest {
    protected static WebDriver driver;
    static String baseUrl;

    @BeforeClass
    public static void setUp() throws Exception {
        String workingDir = System.getProperty("user.dir");
        System.setProperty("webdriver.gecko.driver", workingDir + "\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "https://yandex.ru/";
        driver.get(baseUrl);
        Page.setCurrentPage(new HomePage());
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }


    public static WebDriver getDriver() {
        return driver;
    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.close();

    }


}






