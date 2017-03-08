package website.VotingSystem.tests;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@FixMethodOrder(MethodSorters.JVM)
public class TestNewDistrictCreation {
	WebDriver driver = new FirefoxDriver();
	private String partyName = "exampleNameforTesting";

	@Before
	public void prepareForTest() {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	

}
