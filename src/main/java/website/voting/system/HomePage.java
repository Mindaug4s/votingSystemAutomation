package website.voting.system;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends NavBar {

	@FindBy(id = "buttonElectionResults")
	private WebElement electionResultsButton;

	@FindBy(id = "buttonCountyRepresentatives")
	private WebElement countyRepresentativesButton;

	@FindBy(id = "buttonAdministration")
	private WebElement administratorButton;

	public HomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		driver.get("http://localhost:9000");

	}

	public void navigateToElectionResults() {

		electionResultsButton.click();
	}

	public void navigateToCountyRepresentatives() {

		countyRepresentativesButton.click();
	}

	public void navigateToAdministration() {

		administratorButton.click();
	}

	public WebElement getElectionResultsButton() {
		return electionResultsButton;
	}

	public WebElement getCountyRepresentativesButton() {
		return countyRepresentativesButton;
	}

	public WebElement getAdministratorButton() {
		return administratorButton;
	}

}
