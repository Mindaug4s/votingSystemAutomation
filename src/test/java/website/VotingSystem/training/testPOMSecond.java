//package website.VotingSystem.training;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import website.voting.system.administrator.Parties;
//
//public class testPOMSecond {
//
//	WebDriver driver = new FirefoxDriver();
//	Parties politiniaiVienetai;
//
//	@Before
//	public void setUp() {
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//	}
//
//	@Test
//	public void testPolitiniaiVienetai() throws IOException, InterruptedException {
//
//		politiniaiVienetai = new Parties(driver);
//		politiniaiVienetai.getPartijosPavadinimaField().sendKeys("blablabla");
//
//		politiniaiVienetai.getUploadButton().sendKeys("C:/Users/Mindaug4s/Desktop/district_candidate_list.csv");
//
//		// Runtime.getRuntime().exec("C:/Users/Mindaug4s/Desktop/uploadFile.exe");
//
//		Thread.sleep(1000);
//
//		politiniaiVienetai.getUploadButton().click();
//	}
//
//}
