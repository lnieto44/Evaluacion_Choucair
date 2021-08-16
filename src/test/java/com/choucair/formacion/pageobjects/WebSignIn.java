package com.choucair.formacion.pageobjects;

import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WebSignIn{

    @FindBy(css = "#email")
    WebElement campoEmail;

    @FindBy(css = "#passwd")
    WebElement campoPassword;

    @FindBy(css = "#SubmitLogin")
    WebElement botonSignIn;

    @Dado("^(.*) registrado ingresa a la pagina (.*)$")
    private void DiligencialCampoEmail(String email){
        campoEmail.sendKeys(email);
    }
    private void DiligencialCampoPassword(String password){
        campoPassword.sendKeys(password);
    }
    private void HacerClickSignIn(){
        botonSignIn.click();
    }

    @Entonces("^(.*) deberia ver los campos diligenciados y seleccionados para realizar la compra (.*)$")
    public void reconocer(String email, String password){
        DiligencialCampoEmail(email);
        DiligencialCampoPassword(password);
        HacerClickSignIn();
    }

    public  WebSignIn (WebDriver driver){
        PageFactory.initElements(driver, this);
    }


}
