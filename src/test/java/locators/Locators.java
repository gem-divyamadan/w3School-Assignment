package locators;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Locators {
    public static By logo=By.xpath("//i[@class='fa fa-logo']");

  public static By loginButton=By.id("w3loginbtn");

  public static By loginPageTextVerify=By.xpath("//h1[text()='Log in']");

  public static By inputValue=By.xpath("//input[@type='text']");

  public static By searchButton=By.id("learntocode_searchbtn");

  public static By clickJavaTutorial=By.xpath("//h2[text()='JS Tutorial']");

  public static By clickOnHomeButton=By.xpath("(//a[@title='Home'])[2]");

  public static By verifyBackLandingPage=By.xpath("//h1[text()='Learn to Code']");

  public static By exercisePageOpened=By.id("navbtn_tutorials");

 public static By clickOnHtmlTutorial=By.xpath("//a[text()='HTML Tutorial']");

 public static By verifyHtmlPage=By.xpath("//span[text()=' Tutorial']");

 public static By clickOnNextButton=By.xpath("//a[@class='w3-right w3-btn']");

 public static By verifyNextTopic=By.xpath("//span[text()='Python']");

 public static By clickTryItYourself=By.xpath("(//a[@class='w3-btn w3-margin-bottom'])[2]");



}


