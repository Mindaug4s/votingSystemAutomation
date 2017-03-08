package website.voting.system.administrator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import website.voting.system.HomePage;
import website.voting.system.NavBar;

public class AdministratorPage extends NavBar{

	// @FindBy(id = "teritoriniaiVienetai")
	// private WebElement teritoriniaiVienetai;
	//
	// @FindBy(id = "apygarduKandidatai")
	// private WebElement apygarduKandidatai;
	//
	// @FindBy(id = "apylinkiuAtstovai")
	// private WebElement apylinkiuAtstovai;
	//
	// @FindBy(id = "politiniaiVienetai")
	// private WebElement politiniaiVienetai;
	//
	// @FindBy(id = "ApylinkiuRezultatai")
	// private WebElement apylinkiuRezultatai;

	@FindBy(id = "location1")
	private WebElement districts;

	@FindBy(id = "location2")
	private WebElement districtCandidates;

	@FindBy(id = "location3")
	private WebElement countyRepresentatives;

	@FindBy(id = "location4")
	private WebElement parties;

	@FindBy(id = "location5")
	private WebElement districtResults;

	public AdministratorPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		new HomePage(driver).navigateToAdministration();
	}

	void navigateToDistricts() {

		districts.click();
	}

	void navigateToDistrictCandidates() {

		districtCandidates.click();
	}

	void navigateToCountyRepresentatives() {

		countyRepresentatives.click();

	}

	void navigateToParties() {

		parties.click();
	}

	void navigateToDistrictResults() {

		districtResults.click();

	}

	public WebElement getDistricts() {
		return districts;
	}

	public WebElement getDistrictCandidates() {
		return districtCandidates;

	}

	public WebElement getCountyRepresentatives() {
		return countyRepresentatives;

	}

	public WebElement getParties() {
		return parties;

	}

	public WebElement getDistrictResults() {
		return districtResults;

	}
}
