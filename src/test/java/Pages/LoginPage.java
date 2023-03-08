package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver _driver;

    public LoginPage(WebDriver driver){
        this._driver = driver;
        PageFactory.initElements(_driver,this);
    }

    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[2]")
    WebElement accountLink;
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
    WebElement loginLink;

    @FindBy(id = "input-email")
    WebElement email;
    @FindBy(id = "input-password")
    WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginButton;


    @FindBy(name = "search")
    WebElement searchBox;
    @FindBy(xpath = "//*[@id=\"search\"]/span/button")
    WebElement clickSearchBtn;

    @FindBy(xpath = "//*[@id=\"content\"]/div[3]/div/div/div[1]/a/img")
    WebElement displayItem;


    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a")
    WebElement clickLogoutLink;
    @FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
    WebElement clickLogout;

    public void ClickOnAccountLink(){
        accountLink.click();
    }
    public void ClickLoginLink(){
        loginLink.click();
    }
    public void EnterEmailAndPassword(String uid, String pass){
        email.sendKeys(uid);
        password.sendKeys(pass);
    }
    public void ClickLoginButton(){
        loginButton.click();
    }


    public void SearchTextBox(String searchItem){
        searchBox.sendKeys(searchItem);
    }
    public void ClickSearchButton(){
        clickSearchBtn.click();
    }
    public void CheckItemDisplay(){
        Assert.assertTrue(displayItem.isDisplayed());
    }


    public void ClickAccDropDown(){
        clickLogoutLink.click();
    }
    public void LogOut(){
        clickLogout.click();
    }

}
