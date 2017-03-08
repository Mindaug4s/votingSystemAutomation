package website.voting.system.administrator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DistrictCandidates extends AdministratorPage {

	private WebDriver driver;

	@FindBy(xpath = "//div[@style = 'cursor: pointer;']")
	private List<WebElement> districtsList;

	public DistrictCandidates(WebDriver driver) {

		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
		navigateToDistrictCandidates();
	}

	public Integer districtCount() {
		return districtsList.size();
	}

	public WebElement getDistrictByName(String districtName) {

		return driver.findElement(By.id("district-title-" + districtName));

	}
}
