package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import locators.Locators;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import steps.w3schoolsteps;

import java.util.ArrayList;
import java.util.List;


public class w3school extends PageObject {
@Steps
w3schoolsteps steps;
Logger logger= LoggerFactory.getLogger("w3school.class");

    @Given("^Open w3school$")
    public void navigateToSite(){
        getDriver().navigate().to("https://www.w3schools.com/");
        waitABit(5000);

        }

        @Then("^Verify that website is opened by taking the web logo or end of page text match$")
    public void isLogoPresent(){
                waitABit(4000);
                Boolean isLogoPresent = $(Locators.logo).isPresent();
                Assert.assertTrue(isLogoPresent);
            }

            @Then("^click on loginButton$")
         public void loginButton(){
        $(Locators.loginButton).click();
            }

            @Then("^verify login page is open$")
            public void verifyLoginPage(){
        Assert.assertTrue(($(Locators.loginPageTextVerify).getText()).equals("Log in"));
        logger.info("Log In");
    }

            @Then("^Input Java in search & click on search result$")
    public void clickOnSearch(){
       steps.inputJava();
       steps.searchQuery();

            }

            @Then("^click on Java Tutorial page$")
    public void clickOnJavaTutorial(){
        $(Locators.clickJavaTutorial).click();
            }

            @Then("^click on Home Button$")
    public void clickOnHomeButton(){
        waitABit(10000);
       $(Locators.clickOnHomeButton).click();
            }

            @Then("^verify back on landing page$")
    public void verifyLandingPage(){
        waitABit(10000);
    Assert.assertTrue(($(Locators.verifyBackLandingPage).getText()).equals("Learn to Code"));
    logger.info("Learn to Code");
            }

            @Then("^Enter string Exercise & click on enter$")
        public void clickOnEnter(){
        waitABit(5000);
        steps.InputExercise();
        steps.searchButton();
            }

            @Then("^verify exercise page is opened$")
    public void verifyExercisePage(){
                Assert.assertTrue(($(Locators.exercisePageOpened).getText()).equals("Tutorials"));
                logger.info("Tutorials");
            }

            @Then("^click on HTML Tutorial$")
    public void clickOnHtmlTut(){
        waitABit(10000);
        $(Locators.clickOnHtmlTutorial).click();
            }

            @Then("^verify page Html Tutorial is open$")
    public void verifyHtmlPage(){
        waitABit(10000);
            Assert.assertTrue(($(Locators.verifyHtmlPage).getText()).equals("Tutorial"));
            logger.info("Tutorial");

            }
        @Then("^Enter string Python Tutorial & click on enter$")
         public void inputPythonTutorial(){
        steps.inputPythonTutorial();
        steps.searchButton();
        }

        @Then("^click on next button$")
    public void clickNextButton(){
        $(Locators.clickOnNextButton).click();
        waitABit(3000);
        }

        @Then("^Verify next topic is opened$")
        public void verifyNextTopic(){
        Assert.assertTrue(($(Locators.verifyNextTopic).getText()).equals("Python"));
        logger.info("Python");
        waitABit(5000);
        }

        @Then("^Click on try it yourself$")
        public void clickTryItYourself(){
        waitABit(10000);
            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            js.executeScript("window.scrollBy(0,500)");
            $(Locators.clickTryItYourself).click();

        }
        @Then("^verify new tab is open$")
    public void verifyNewTab(){
            List<String> browserTabs = new ArrayList<String>(getDriver().getWindowHandles());
            getDriver().switchTo().window(browserTabs .get(1));
            waitABit(10000);
           String pageTitle= getDriver().getTitle();
           Assert.assertEquals("W3Schools Tryit Editor",pageTitle);
            System.out.println("PageTitle verified");
            getDriver().close();
            getDriver().switchTo().window(browserTabs.get(0));
        }


        }



