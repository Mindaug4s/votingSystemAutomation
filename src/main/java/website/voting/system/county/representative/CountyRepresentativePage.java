package website.voting.system.county.representative;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import website.voting.system.HomePage;
import website.voting.system.NavBar;

public class CountyRepresentativePage extends NavBar {
	
	private WebDriver driver;

	public CountyRepresentativePage(WebDriver driver) {

	this.driver = driver;
	PageFactory.initElements(driver, this);
	new HomePage(driver).navigateToCountyRepresentatives();
	
	}

}
