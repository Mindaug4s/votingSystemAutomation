package website.voting.system.administrator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Parties extends AdministratorPage {

	WebDriver driver;

	@FindBy(id = "inputCountyName")
	private WebElement inputNewCountyNameField;

	@FindBy(id = "inputFile")
	private WebElement uploadPartyCandidatesButton;

	@FindBy(xpath = "//button[@type = 'submit']")
	private WebElement submitPartyCreationButton;

	public Parties(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		navigateToParties();
	}

	public WebElement getPartijosPavadinimaField() {
		return inputNewCountyNameField;

	}

	public WebElement getUploadButton() {
		return uploadPartyCandidatesButton;

	}

	public WebElement getSukurtiButton() {
		return submitPartyCreationButton;

	}

	public WebElement getPartyByName(String partyName) {

		return driver.findElement(By.id("party-" + partyName));
	}

}
