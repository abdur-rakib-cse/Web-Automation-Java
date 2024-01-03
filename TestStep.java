package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import HomePage.Homepage;
import Reports.PageObjectManage;
import utilis.TestContextSetup;



public class TestStep {
    TestContextSetup testContextSetup;
    Homepage homepage;
    PageObjectManage pageObjectManage;

    public TestStep(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        this.homepage = testContextSetup.pageObjectManager.getHomePage();
    }


    @Given("Check that welcome page take loads properly")
    public void checkThatWelcomePageTakeLoadsProperly() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(homepage.shohoz_logo().isDisplayed());
    }

    @Then("Check that shohoz button is appare")
    public void checkThatShohozButtonIsAppare() {
        Assert.assertTrue(homepage.shohoz_logo().isDisplayed());
    }

    @And("Check that Bus Button is appare")
    public void checkThatBusButtonIsAppare() {
        Assert.assertTrue(homepage.Bus_button().isDisplayed());
    }

    @And("Check that Lunch Button is appare")
    public void checkThatLunchButtonIsAppare() {
        Assert.assertTrue(homepage.Launch_Button().isDisplayed());
    }

    @And("Check that Train Button is appare")
    public void checkThatTrainButtonIsAppare() {
        Assert.assertTrue(homepage.Train_Button().isDisplayed());
    }

    @And("Check that Even Button is appare")
    public void checkThatEvenButtonIsAppare() {
        Assert.assertTrue(homepage.Event_Button().isDisplayed());
    }

    @And("Check that Language By default select English")
    public void checkThatLanguageByDefaultSelectEnglish() {
        Assert.assertTrue(homepage.Language().isDisplayed());
    }

    @And("Check that Contact Us Button is appare")
    public void checkThatContactUsButtonIsAppare() {
        Assert.assertTrue(homepage.Contact_us().isDisplayed());
    }

    @When("Click that Bus Button")
    public void clickThatBusButton() throws InterruptedException {
       Thread.sleep(1000);
       homepage.Bus_button().click();
    }

    @Then("Check that From input field is appare")
    public void checkThatFromInputFieldIsAppare() {
        Assert.assertTrue(homepage.Input_field().isDisplayed());
    }

    @And("Check that To input field is should be appare")
    public void checkThatToInputFieldIsShouldBeAppare() {
        Assert.assertTrue(homepage.To_Input_field().isDisplayed());
    }

    @And("Check that Date of Journey input filed is should be appare")
    public void checkThatDateOfJourneyInputFiledIsShouldBeAppare() {
        Assert.assertTrue(homepage.Date_of_Journey_input().isDisplayed());
    }

    @And("Check that Date of Return input field is should be appare")
    public void checkThatDateOfReturnInputFieldIsShouldBeAppare() {
        Assert.assertTrue(homepage.Date_of_Return_input().isDisplayed());
    }

    @And("Check that Search Buses Button should be appare")
    public void checkThatSearchBusesButtonShouldBeAppare() {
        Assert.assertTrue(homepage.Search_Buses_Button().isDisplayed());

    }

    @Given("Check that From input field should be appare")
    public void checkThatFromInputFieldShouldBeAppare() {
        Assert.assertTrue(homepage.Input_field().isDisplayed());
    }

    @When("click the input field write a District  Name")
    public void clickTheInputFieldWriteADistrictName() throws InterruptedException {
        Thread.sleep(1000);
        homepage.Input_field().sendKeys("Dhaka");
    }

    @Then("Check that To input field should be appare")
    public void checkThatToInputFieldShouldBeAppare() {
        Assert.assertTrue(homepage.To_Input_field().isDisplayed());
    }

    @When("Click the To input filed and write another District name")
    public void clickTheToInputFiledAndWriteAnotherDistrictName() throws InterruptedException {
        Thread.sleep(1000);
        homepage.To_Input_field().sendKeys("Joypurhat");
    }

    @Then("Check that Date of journey calander should be appare")
    public void checkThatDateOfJourneyCalanderShouldBeAppare() {
        Assert.assertTrue(homepage.Date_of_Journey_input().isDisplayed());
    }

    @When("click the calander & Select a Date")
    public void clickTheCalanderSelectADate() throws InterruptedException {
        Thread.sleep(1000);
        homepage.Date_of_Journey_input().click();
    }
    @When("click the calander & Selected a Date")
    public void clickTheCalanderSelectADate1() throws InterruptedException {
        Thread.sleep(1000);
        homepage.Selected_Date().click();
    }

    @Then("Check that the Search Buses Button is should be appare")
    public void checkThatTheSearchBusesButtonIsShouldBeAppare() {
        Assert.assertTrue(homepage.Search_Buses_Button().isDisplayed());
    }

    @When("Click the Search Buses")
    public void clickTheSearchBuses() throws InterruptedException {
        Thread.sleep(7000);
        homepage.Search_Buses_Button().click();
    }

    @Given("Check that Departure text should be appare")
    public void checkThatDepartureTextShouldBeAppare() {
        Assert.assertTrue(homepage.Departure_Text().isDisplayed());
    }

    @Then("Check that Return Text should be appare")
    public void checkThatReturnTextShouldBeAppare() {
        Assert.assertTrue(homepage.Return_Text().isDisplayed());
    }

    @And("Check that Prev. Day Button should be appare")
    public void checkThatPrevDayButtonShouldBeAppare() {
        Assert.assertTrue(homepage.pre_Day().isDisplayed());

    }

    @And("Check that Next Day Button SHould Be appare")
    public void checkThatNextDayButtonSHouldBeAppare() {
        Assert.assertTrue(homepage.Next_Day().isDisplayed());

    }

    @And("Check that Add Return Ticket Button shold be appare")
    public void checkThatAddReturnTicketButtonSholdBeAppare() {
        Assert.assertTrue(homepage.Add_Return_Ticket().isDisplayed());
    }

    @And("Check that Modify Search Button Should be appare")
    public void checkThatModifySearchButtonShouldBeAppare() {
        Assert.assertTrue(homepage.Modify_Search_Button().isDisplayed());
    }

    @And("Check that Operator \\(Bus Type) Text is appare")
    public void checkThatOperatorBusTypeTextIsAppare() {
        Assert.assertTrue(homepage.Operator_Bus_Type().isDisplayed());
    }


    @Given("Check that shohoz button shoud be appare on the top")
    public void checkThatShohozButtonShoudBeAppareOnTheTop() {
        Assert.assertTrue(homepage.shohoz_logo().isDisplayed());
    }

    @When("click on it")
    public void clickOnIt() throws InterruptedException {
        Thread.sleep(7000);
        homepage.shohoz_logo().click();

    }

    @Then("check that shohoz button should be appare.")
    public void checkThatShohozButtonShouldBeAppare() {
        Assert.assertTrue(homepage.shohoz_logo().isDisplayed());

    }

    @And("check that Bus button should be appare.")
    public void checkThatBusButtonShouldBeAppare() {
        Assert.assertTrue(homepage.Bus_button().isDisplayed());

    }

    @And("check that Train button should be appare.")
    public void checkThatTrainButtonShouldBeAppare() {
        Assert.assertTrue(homepage.Train_Button().isDisplayed());
    }

    @And("check that Event button should be appare.")
    public void checkThatEventButtonShouldBeAppare() {
        Assert.assertTrue(homepage.Event_Button().isDisplayed());
    }

    @And("check that Language button should be appare.")
    public void checkThatLanguageButtonShouldBeAppare() {
        Assert.assertTrue(homepage.Language().isDisplayed());
    }

    @And("check that Contact Us button should be appare.")
    public void checkThatContactUsButtonShouldBeAppare() {
        Assert.assertTrue(homepage.Contact_us().isDisplayed());
    }


    @And("check that Launch button should be appare.")
    public void checkThatLaunchButtonShouldBeAppare() {
        Assert.assertTrue(homepage.Launch_Button().isDisplayed());
    }

    @When("click on Lanuch button")
    public void clickOnLanuchButton() throws InterruptedException {
        Thread.sleep(1000);
        homepage.Launch_Button().click();
    }

    @Then("Check that View Seats Button is appare")
    public void checkThatViewSeatsButtonIsAppare() {
        Assert.assertTrue(homepage.View_Seats().isDisplayed());
    }

    @When("Click That View seats")
    public void clickThatViewSeats() throws InterruptedException {
        Thread.sleep(7000);
        homepage.View_Seats().click();
    }

    @Then("Check That Chooose your seat\\(s) text is appare")
    public void checkThatChoooseYourSeatSTextIsAppare() {
        Assert.assertTrue(homepage.Choose_your_seats().isDisplayed());
    }

    @And("Check that Available Seats Text is appare")
    public void checkThatAvailableSeatsTextIsAppare() {
        Assert.assertTrue(homepage.Available_seats().isDisplayed());
    }

    @And("Check That Booked Seats is appare")
    public void checkThatBookedSeatsIsAppare() {
        Assert.assertTrue(homepage.Booked_Seats().isDisplayed());
    }

    @And("Check That Selected Seats is appare")
    public void checkThatSelectedSeatsIsAppare() {
        Assert.assertTrue(homepage.Selected_Seats().isDisplayed());
    }

    @And("Check that  Hidden Sit Button is appare")
    public void checkThatAHiddenSitButtonIsAppare() {
        Assert.assertTrue(homepage.Hidden_sits().isDisplayed());
    }

    @When("Click  Sit")
    public void clickASit() throws InterruptedException {
        Thread.sleep(7000);
        homepage.Hidden_sits().click();
    }

    @Then("Check that Total : should be increased")
    public void checkThatTotalShouldBeIncreased() {
        Assert.assertTrue(homepage.Total().isDisplayed());
    }

    @And("Check that Choose Boarding Point Text should be appare")
    public void checkThatChooseBoardingPointTextShouldBeAppare() {
        Assert.assertTrue(homepage.Choose_Boarding_Point().isDisplayed());
    }

    @And("Check that -- Boarding Points -- dropdrown menu should be appare Select an --Boarding Points --")
    public void checkThatBoardingPointsDropdrownMenuShouldBeAppareSelectAnBoardingPoints() {
        Assert.assertTrue(homepage.Boarding_points().isDisplayed());
    }


    @And("Check that Continue Button should be appare and")
    public void checkThatContinueButtonShouldBeAppareAnd() {
        Assert.assertTrue(homepage.Continue_sits().isDisplayed());

    }

    @When("click Continue Button")
    public void clickContinueButton() throws InterruptedException {
        Thread.sleep(1000);
        homepage.Continue_sits().click();
    }
}











