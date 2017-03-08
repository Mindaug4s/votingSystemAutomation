package website.voting.system.administrator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class DistrictResults extends AdministratorPage {

	private WebDriver driver;
	

	public DistrictResults(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		navigateToDistrictResults();

	}

}
