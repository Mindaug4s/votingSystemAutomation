package website.voting.system.administrator;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.hamcrest.text.*;

public class Districts extends AdministratorPage {

	WebDriver driver;

	@FindBy(id = "unit-header")
	private List<WebElement> districtsList;

	@FindBy(xpath = "//p[contains(@id, 'county-title')]")
	private List<WebElement> countyList;

	@FindBy(xpath = "//span[contains(text(), 'sąrašas')]")
	private WebElement districtsListHeaderElement;

	@FindBy(id = "input-district-name")
	private WebElement inputNewDistrictNameField;

	@FindBy(id = "add-new-county-button")
	private WebElement addNewCountytButton;

	@FindBy(id = "input-county-name")
	private WebElement inputNewCountyNameField;

	@FindBy(id = "input-county-voters")
	private WebElement inputQuantityOfCitizenInNewCounty;

	@FindBy(id = "input-county-address")
	private WebElement inputNewCountyAddress;

	@FindBy(id = "create-county-button")
	private WebElement createNewCountyButton;

	@FindBy(id = "cancel-county-creation-button")
	private WebElement cancelCountyCreationButton;

	@FindBy(id = "create-district-button")
	private WebElement createNewDistrictButton;

	@FindBy(id = "remove-county-button")
	private WebElement deleteDistrictButton;

	@FindBy(className = "remove-units-element confirmation-buttons")
	private WebElement editDistrictButton;

	public Districts(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		navigateToDistricts();
	}

	public WebElement getCountyListHeaderElement() {
		return districtsListHeaderElement;
	}

	public Integer districtCount() {
		return districtsList.size();
	}

	public WebElement getInputNewDistrictNameField() {
		return inputNewDistrictNameField;
	}

	public WebElement getAddNewCountytButton() {
		return addNewCountytButton;
	}

	public WebElement getInputNewCountyNameField() {
		return inputNewCountyNameField;
	}

	public WebElement getInputQuantityOfCitizenInNewCountyField() {
		return inputQuantityOfCitizenInNewCounty;
	}

	public WebElement getNewCountyAddressField() {
		return inputNewCountyAddress;
	}

	public WebElement getCreateNewCountyButton() {
		return createNewCountyButton;
	}

	public WebElement getCancelCountyCreationButton() {
		return cancelCountyCreationButton;
	}

	public WebElement getCreateNewDistrictButton() {
		return createNewDistrictButton;
	}

	private void assureThatfDistrictFieldIsCollapsed(String districtName) {

		// List<WebElement> countyList = new ArrayList<>();
		//
		// countyList = getExistingDistrictByName(districtName)
		// .findElements(By.xpath("//p[contains(@id, 'county-title')]"));

		if (countyList.isEmpty()) {

			getExistingDistrictByName(districtName).click();
		}

	}

	public WebElement getExistingDistrictByName(String districtName) {
		return driver.findElement(By.id("district-" + districtName));
	}

	public WebElement getExistingCountyByName(String districtName, String countyName) {
		assureThatfDistrictFieldIsCollapsed(districtName);
		return driver.findElement(By.id("county-title-" + countyName));
	}

	public WebElement getSpecificCountiesQuantityOfCitizenElement(String districtName, String countyName) {

		assureThatfDistrictFieldIsCollapsed(districtName);
		return driver.findElement(By.id("county-voters-count-" + countyName));

	}

	public WebElement getSpecificCountiesAddressElement(String districtName, String countyName) {

		assureThatfDistrictFieldIsCollapsed(districtName);
		return driver.findElement(By.id("county-address-" + countyName));

	}

	public WebElement getSpecificCountiesEditButton(String districtName, String countyName) {

		assureThatfDistrictFieldIsCollapsed(districtName);
		return driver.findElement(By.id("edit-county-button-" + countyName));

	}

	public WebElement getSpecificCountiesDeleteButton(String districtName, String countyName) {

		assureThatfDistrictFieldIsCollapsed(districtName);
		return driver.findElement(By.id("remove-county-button-" + countyName));

	}

	public WebElement getSpecificDistrictDeleteButton(String districtName) {

		assureThatfDistrictFieldIsCollapsed(districtName);

		return deleteDistrictButton;
	}

	public WebElement getSpecificDistrictEditButton(String districtName) {

		assureThatfDistrictFieldIsCollapsed(districtName);
		return editDistrictButton;
	}

	public void createNewDistrict(String districName) {

		getInputNewDistrictNameField().clear();

		getInputNewDistrictNameField().sendKeys(districName);

		getCreateNewDistrictButton().click();

	}

	public void createNewDistrictAndCounty(String districtName, String countyName, String quantityOfVoters,
			String address) {

		getInputNewDistrictNameField().clear();

		getInputNewDistrictNameField().sendKeys(districtName);

		getAddNewCountytButton().click();

		getInputNewCountyNameField().sendKeys(countyName);

		getInputQuantityOfCitizenInNewCountyField().sendKeys(quantityOfVoters);

		getNewCountyAddressField().sendKeys(address);

		getCreateNewCountyButton().click();

		getCreateNewDistrictButton().click();

	}

	public void deleteSpecificDistrict(String districtName) {

		getSpecificDistrictDeleteButton(districtName).click();

	}

}
