package website.VotingSystem.training;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import website.voting.system.administrator.AdministratorPage;
import website.voting.system.county.representative.CountyRepresentativePage;
import website.voting.system.result.page.ElectionResultsPage;

public class testingStuff {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		WebDriver driver2 = new FirefoxDriver();
		WebDriver driver3 = new FirefoxDriver();

		AdministratorPage admin = new AdministratorPage(driver);
		ElectionResultsPage election = new ElectionResultsPage(driver2);
		CountyRepresentativePage representative = new CountyRepresentativePage(driver3);
		
		driver.close();
		driver2.close();
		driver3.close();
	}
}
