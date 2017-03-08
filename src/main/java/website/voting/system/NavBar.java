package website.voting.system;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class NavBar {

	@FindBy(id = "homeButton")
	private WebElement homeButton;

	@FindBy(xpath = "//div[contains(text(), 'RESPUBLIKOS')]")
	private WebElement webPageName;

	@FindBy(linkText = "Lankytojas")
	private WebElement userButton;

	@FindBy(linkText = "Atsijungti")
	private WebElement logoutButton;

	@FindBy(xpath = "//button[@class = 'btn btn-danger' and contains(text(), 'Patvirtinti')]")
	private WebElement confirmDeleteActionButton;

	@FindBy(xpath = "//button[@class = 'btn btn-default' and contains(text(), 'Atšaukti')]")
	private WebElement cancelDeleteActionButton;

	@FindBy(xpath = "//div[contains(@class, 'alert alert-danger')]")
	private WebElement warningMessageElement;

	public void goToHomePage() {
		homeButton.click();
	}

	public WebElement getHomePageButton() {
		return homeButton;
	}

	public WebElement getWebPageNameElement() {
		return webPageName;
	}

	public WebElement getUserButton() {
		return userButton;
	}

	public WebElement getLogoutButton() {
		return logoutButton;
	}

	public void logoutUser() {
		try {
			logoutButton.click();

		} catch (Exception e) {
			userButton.click();
			logoutButton.click();
			// } finally {
			// logoutButton.click();
		}

	}

	public WebElement getConfirmDeleteActionButton() {
		return confirmDeleteActionButton;
	}

	public WebElement getCancelDeleteActionButton() {
		return cancelDeleteActionButton;
	}

	public WebElement getWarningMessegeElement() {
		return warningMessageElement;
	}
}
