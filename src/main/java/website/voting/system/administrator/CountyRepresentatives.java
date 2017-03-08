package website.voting.system.administrator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CountyRepresentatives extends AdministratorPage {

	private WebDriver driver;

	@FindBy(xpath = "//div[contains(@id, 'representative-name-and-surname')]")
	private List<WebElement> countyRepresentativeList;

	@FindBy(xpath = "//button[contains(text(), 'Rodyti visus atstovus')]")
	private WebElement showRepresentativesButton;

	@FindBy(id = "representative-name")
	private WebElement inputRepresentativeNameField;

	@FindBy(id = "representative-surname")
	private WebElement inputRepresentativeSurnameField;

	@FindBy(id = "representative-email")
	private WebElement inputRepresentativeEmailField;

	@FindBy(id = "representative-district")
	private Select selectRepresentativeDistrictField;

	@FindBy(id = "representative-county")
	private Select selectRepresentativeCountyField;

	@FindBy(id = "create-representative-button")
	private WebElement createRepresentativeButton;

	public CountyRepresentatives(WebDriver driver) {

		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		navigateToCountyRepresentatives();
	}

	public Integer getCountyRepresentativeListSize() {
		return countyRepresentativeList.size();
	}

	public WebDriver returnDriver() {
		return driver;
	}

	public WebElement getShowRepresentativesButton() {
		return showRepresentativesButton;
	}

	public WebElement getInputRepresentativeNameField() {
		return inputRepresentativeNameField;
	}

	public WebElement getInputRepresentativeSurnameField() {
		return inputRepresentativeSurnameField;
	}

	public WebElement getInputRepresentativeEmailField() {
		return inputRepresentativeEmailField;
	}

	public Select getSelectRepresentativeDistrictField() {
		return selectRepresentativeDistrictField;

	}

	public Select getSelectRepresentativeCountyField() {
		return selectRepresentativeCountyField;

	}

	public WebElement getCreateRepresentativeButton() {
		return createRepresentativeButton;
	}

	public WebElement getSpecificRepresentativeNameAndSurname(String representativeName, String representativeSurname) {

		return driver.findElement(
				By.id("representative-name-and-surname-" + representativeName + " " + representativeSurname));
	}

	public WebElement getSpecificRepresentativeDistrictAndCountyElement(String representativeName,
			String representativeSurname) {

		return driver.findElement(By.id("representative-location-" + representativeName + " " + representativeSurname));
	}

	public WebElement getSpecificRepresentativeEmailElement(String representativeName, String representativeSurname) {

		return driver.findElement(By.id("representative-email-" + representativeName + " " + representativeSurname));
	}

	public WebElement getSpecificRepresentativeDeleteButton(String representativeName, String representativeSurname) {

		return driver.findElement(By.id("remove-representative-" + representativeName + " " + representativeSurname));
	}
}
