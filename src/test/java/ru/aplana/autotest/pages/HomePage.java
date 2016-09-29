package ru.aplana.autotest.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ru.aplana.autotest.Page;
import ru.aplana.autotest.tests.BaseTest;

public class HomePage extends Page{
	
	public HomePage() {
		PageFactory.initElements(BaseTest.getDriver(), this);	
	}
	
	@FindBy(linkText="Маркет")
	public WebElement market;
	
	public void goToMarketPage() {
		market.click();

	 }

	@FindBy(linkText = "Новости")
	public  WebElement poster;
	 public  void goToNewsPage(){
	 	poster.click();
	 }
	 @FindBy(linkText = "Телепрограмма")
	public WebElement tvprog;

	public void setTvprog() {
		tvprog.click();
	}
	@FindBy(xpath = "//div[2]/div/div/div/div/div/h1/a")
	public WebElement TVShow;
	public void setTVShow(){
		TVShow.click();
	}
	 @FindBy(xpath = "//div[3]/div[2]/div/div/div/div/div/h1/a")
	public WebElement poster2;
	public void goToPosterPage(){
	poster2.click();
	}



}

