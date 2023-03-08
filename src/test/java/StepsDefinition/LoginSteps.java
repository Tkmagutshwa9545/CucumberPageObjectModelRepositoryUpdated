package StepsDefinition;

import Base.BaseClass;
import Pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps extends BaseClass {

    @Given("^I launch web browser$")
    public void iLaunchWebBrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        System.out.println("I am inside Launch browser");
    }

    @And("^I navigate to home page$")
    public void iNavigateToHomePage() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        System.out.println("I am inside Navigate to home");
    }

    @And("^I click login on account menu$")
    public void iClickLoginOnAccountMenu(){
        loginPage.ClickOnAccountLink();
        System.out.println("I am inside Account Menu");
    }

    @Then("^I click login link$")
    public void iClickLoginLink() {
        loginPage.ClickLoginLink();
        System.out.println("I am inside click Link");
    }
    @When("^I enter (.*) and (.*)$")
    public void iEnterUsernameAndPassword(String uid, String pws) {
        loginPage.EnterEmailAndPassword(uid,pws);
        System.out.println("I am inside username and password");
    }
    @And("^I click login button$")
    public void iClickLoginButton() throws InterruptedException {
        loginPage.ClickLoginButton();
        Thread.sleep(2000);
        System.out.println(" I am inside click button");
    }

    @When("^I search for item$")
    public void iSearchForItem() {
        loginPage.SearchTextBox("MacBook Air");
        loginPage.ClickSearchButton();
        System.out.println("I am inside search for item$");
    }

    @And("I should see the items on the result$")
    public void iShouldSeeTheItemsOnTheResult() {
        loginPage.CheckItemDisplay();
        System.out.println(" I am inside Results");
    }

    @Then("^User logout$")
    public void userLogout() {
        loginPage.ClickOnAccountLink();
        loginPage.LogOut();
        driver.quit();
        System.out.println("I am inside Logout");
    }


}
