package com.choucair.formacion.steps;

import cucumber.api.java.ast.Cuando;
import net.thucydides.core.annotations.Steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPrincipal {

    @Steps(shared = true)

    @FindBy (className = "login")
    private WebElement btnSignIn;

    @FindBy (xpath = "//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[contains(text(),\"T-shirts\")]")
    private WebElement etiquetaTshirts;

    @Cuando("^(.*) comienza a realizar una compra de una camiseta: (.*)$")
    public void IrCategoriaTshirts(){
        etiquetaTshirts.click();
    }
    public void IrSignIn(){
        btnSignIn.click();
    }

    public WebPrincipal(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
