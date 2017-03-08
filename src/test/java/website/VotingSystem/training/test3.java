package website.VotingSystem.training;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import methods.explicit.waits.ExplicitWaits;
import website.voting.system.administrator.CountyRepresentatives;
import website.voting.system.administrator.DistrictCandidates;
import website.voting.system.administrator.Districts;

public class test3 {

	WebDriver driver = new FirefoxDriver();

	String districtName = "ojeitaipmmmsgsskk";

	@Test
	public void testSomethingNew() throws InterruptedException {

		// driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

		Districts teritoriniaiVienetai = new Districts(driver);

		teritoriniaiVienetai.getInputNewDistrictNameField().sendKeys(districtName);

		teritoriniaiVienetai.getCreateNewDistrictButton().click();

		// ExplicitWaits.waitForJavascript(driver);
		ExplicitWaits.fluentWait(teritoriniaiVienetai.getExistingDistrictByName(districtName), driver);
		int countOfDistricts = teritoriniaiVienetai.districtCount();

		DistrictCandidates apygarduKandidatai = new DistrictCandidates(driver);

		// ExplicitWaits.waitForJavascript(driver);
		int countOfDistricts2 = apygarduKandidatai.districtCount();

		Assert.assertSame(countOfDistricts2, countOfDistricts);

		CountyRepresentatives representatives = new CountyRepresentatives(driver);

		// ExplicitWaits.waitForJavascript(driver);
		System.out.println(representatives.getCountyRepresentativeListSize());
		driver = representatives.returnDriver();

		List<WebElement> someList = new ArrayList<WebElement>();
		// ExplicitWaits.waitForJavascript(driver);
		someList = driver.findElements(By.xpath("//div[@class =	 'list-group-item passive']"));
		// someList = driver.findElements(By.xpath("//span[contains (@id,
		// 'remove-representative')]"));
		// driver.findElement(By.xpath("//span [contains (@id,
		// 'remove-representative-4')]")).click();

		System.out.println(someList.size());
		// System.out.println(representatives.getCountyRepresentativeListSize());

	}

	@After
	public void afterTest() {
		driver.close();
	}
}
