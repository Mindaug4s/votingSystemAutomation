package website.VotingSystem.training;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import website.voting.system.NavBar;
import website.voting.system.administrator.AdministratorPage;
import website.voting.system.administrator.Districts;
import website.voting.system.administrator.Parties;


@FixMethodOrder(MethodSorters.JVM)
public class TestPOM {

	WebDriver driver = new FirefoxDriver();
	AdministratorPage adminPage;
	Districts teritoriniaiVienetai;
	Parties politiniaiVienetai;
	private String partyName = "blablabla";
	NavBar commonElements;

	@Before
	public void setUp() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void testAdministratorArea() {
		//
		adminPage = new AdministratorPage(driver);
		
		Assert.assertTrue("Teritoriniai Vienetai section is not found",
				adminPage.getDistricts().isDisplayed());

		Assert.assertTrue("Apygardu Kandidatai section is not found", adminPage.getDistrictCandidates().isDisplayed());

		Assert.assertTrue("Apylinkiu Atstovai section is not found", adminPage.getCountyRepresentatives().isDisplayed());

		Assert.assertTrue("Politiniai Vienetai section is not found", adminPage.getParties().isDisplayed());

		Assert.assertTrue("Apylinkiu Rezultatai section is not found",
				adminPage.getDistrictResults().isDisplayed());

		adminPage.goToHomePage();
	}

	@Test
	public void testTeritoriniaiVienetai() {

		teritoriniaiVienetai = new Districts(driver);

		Assert.assertTrue(teritoriniaiVienetai.getCountyListHeaderElement().isDisplayed());
	}

	@Test
	public void testPolitiniaiVienetai() {

		politiniaiVienetai = new Parties(driver);

		politiniaiVienetai.getPartijosPavadinimaField().sendKeys(partyName);

		politiniaiVienetai.getUploadButton().sendKeys("file:///C:/Users/Mindaug4s/Desktop/csv/party_list_34.csv");

		politiniaiVienetai.getSukurtiButton().click();
	}

	@Test
	public void testDeleteFunction() {
		politiniaiVienetai = new Parties(driver);
		politiniaiVienetai.getPartyByName(partyName).click();
	}

	@After
	public void closeBrowser() {
		driver.close();
	}
}
