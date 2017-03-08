package website.VotingSystem.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import test.data.TestDataProvider;

import java.util.concurrent.TimeUnit;

import org.hamcrest.text.*;
//import org.junit.Assert;

import website.voting.system.administrator.Districts;

public class tryNewStuffOut {

	@Test(priority = 1, dataProvider = "TestDataProvider", dataProviderClass = TestDataProvider.class)
	public void testDistricts(String districtName, String countyName) {
		

		double startTime = System.currentTimeMillis();

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Districts districts = new Districts(driver);

		districts.getAddNewCountytButton().click();
		// districts.getInputNewCountyNameField().sendKeys("lalala");

		// districts.getExistingDistrictByName("Vilnius").click();
		//
		// WebElement element = districts.getExistingCountyByName("Vilnius",
		// "Senamiestis");
		// System.out.println(element.getText());

		districts.getExistingDistrictByName(districtName).click();

		String quantity = districts.getSpecificCountiesQuantityOfCitizenElement(districtName, countyName).getText().trim();
		System.out.println(quantity);

		String address = districts.getSpecificCountiesAddressElement(districtName, countyName).getText();
		System.out.println(address);

		// WebElement deleteButton =
		// districts.getSpecificCountiesDeleteButton("Naujamiesčio", "Vytenio");
		// System.out.println(deleteButton.isDisplayed());
		// deleteButton.click();
		// districts.getCancelDeleteActionButton().click();

		// System.out.println("is displayed:? " +
		// districts.getInputNewDistrictNameField().isDisplayed());

		// ExplicitWaits.fluentWait(districts.getInputNewCountyNameField(),
		// driver);

		// districts.getInputNewDistrictNameField().sendKeys("blablabla2");
		// districts.getCreateDistrictButton().click();

		districts.createNewDistrict("blablabla3");

		// Assert.assertTrue(districts.getWarningMessegeElement().isDisplayed());

		// String a =
		// driver.findElement(By.id("county-voters-count-0")).getText();
		// boolean isIt =
		// IsEqualIgnoringWhiteSpace.equalToIgnoringWhiteSpace(a).matches("3000");
		// System.out.println(isIt);

		// boolean whatIsIt =
		// IsEqualIgnoringWhiteSpace(driver.findElement(By.id("county-voters-count-0")).getText())
		// .matches("3000");
		// System.out.println(IsEqualIgnoringWhiteSpace(
		// driver.findElement(By.id("county-voters-count-0")).getText()).matches(("3000"))));
		// System.out.println(districts.getExistingCountyByName("
		// Senamiestis"));

		driver.close();
		double endTime = System.currentTimeMillis();
		System.out.println("time tests took: " + (endTime - startTime));
	}

}
