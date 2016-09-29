package ru.aplana.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.aplana.autotest.Page;
import ru.aplana.autotest.tests.BaseTest;

public class ElectronicsPage extends Page {

	public ElectronicsPage() {
		PageFactory.initElements(BaseTest.getDriver(), this);
	}



	@FindBy(linkText = "Наушники")
	public WebElement headphones;

	public void goToHeadphonesPage() {

	    headphones.click();
	}
    @FindBy(linkText= "Цифровые фотоаппараты")
	public  WebElement camera;
	public void goToCameraPage() {
		camera.click();
	}


	@FindBy(linkText = "Телескопы")
    public  WebElement telescopes;
    public  void  goToTelescopesPage(){
        telescopes.click();
    }
    @FindBy(xpath = "//a[contains(text(),'Телевизоры')])[2]")
    public WebElement tv;

    public void goToTVPage(){
        tv.click();
    }
    }

