package com.choucair.formacion.pageobjects;

import cucumber.api.java.ast.Cuando;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebCategoryTShirts {

    WebDriver driver;

    @FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
    WebElement FadedShortSleeve;

    @FindBy(css = ".ajax_add_to_cart_button.btn.btn-default")
    WebElement BtnAdicionarCarrito;

    @FindBy (xpath = "//a[@title='Proceed to checkout']")
    WebElement btnCheckout;


    @Cuando("^(.*) realiza la compra de un producto en la categoría (.*)$")
    public void ComprarFadedShortSleeve(){
        Actions action = new Actions(this.driver);
        action.moveToElement(FadedShortSleeve).moveToElement(BtnAdicionarCarrito).click().build().perform();
        btnCheckout.click();
    }

    public WebCategoryTShirts(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
}