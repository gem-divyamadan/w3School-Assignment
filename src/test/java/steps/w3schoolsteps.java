package steps;

import locators.Locators;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class w3schoolsteps extends PageObject {

    @Step("Enter Java in search field")
    public void inputJava() {
        $(Locators.inputValue).sendKeys("Java");
    }

    @Step("search with query")
    public void searchQuery() {
        $(Locators.searchButton).click();

    }

    @Step("Enter Exercise in search field")
    public void InputExercise() {
        $(Locators.inputValue).sendKeys("Exercise");
           // $(Locators.searchButton).click();
        }

    @Step("Enter search button")
    public void searchButton() {
        $(Locators.searchButton).click();
    }

    @Step("Enter Python Tutorial in search field")
    public void inputPythonTutorial(){
        $(Locators.inputValue).sendKeys("Python Tutorial");
    }

    }

