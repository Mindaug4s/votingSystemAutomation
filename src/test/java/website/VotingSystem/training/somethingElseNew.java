package website.VotingSystem.training;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import website.voting.system.administrator.Districts;

public class somethingElseNew {

	@Test
	public void testDistricts() throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		Districts districts = new Districts(driver);

		// districts.createNewDistrict("lialialia");
		districts.createNewDistrictAndCounty("somenameuhuhuhumaaa", "ulialia", "1256", "zirmunu");

		driver.close();
	}
}
