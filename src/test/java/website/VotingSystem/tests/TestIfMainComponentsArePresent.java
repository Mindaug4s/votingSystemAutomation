package website.VotingSystem.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import website.voting.system.HomePage;
import website.voting.system.administrator.AdministratorPage;

@FixMethodOrder(MethodSorters.JVM)
public class TestIfMainComponentsArePresent {

	WebDriver driver = new FirefoxDriver();
	// private String partyName = "exampleNameforTesting";

	@Before
	public void prepareForTest() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testHomePageElements() {
		HomePage home = new HomePage(driver);

		Assert.assertTrue("Rinkimų rezultatai section is not found", home.getElectionResultsButton().isDisplayed());
		Assert.assertTrue("Apylinkių Atstovams section is not found",
				home.getCountyRepresentativesButton().isDisplayed());
		Assert.assertTrue("Admininstravimas section is not found", home.getAdministratorButton().isDisplayed());
	}

	@Test
	public void testAdministratorElements() {
		//
		AdministratorPage admin = new AdministratorPage(driver);

		Assert.assertTrue("Teritoriniai Vienetai section is not found", admin.getDistricts().isDisplayed());

		Assert.assertTrue("Apygardu Kandidatai section is not found", admin.getDistrictCandidates().isDisplayed());

		Assert.assertTrue("Apylinkiu Atstovai section is not found", admin.getCountyRepresentatives().isDisplayed());

		Assert.assertTrue("Politiniai Vienetai section is not found", admin.getParties().isDisplayed());

		Assert.assertTrue("Apylinkiu Rezultatai section is not found", admin.getDistrictResults().isDisplayed());

		admin.goToHomePage();
	}

	@After
	public void closeBrowser() {
		driver.close();
	}

}
