package com.choucair.formacion.pageobjects;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebPayment {

    @FindBy(css = ".cheque")
    WebElement btnPagarConCheque;

    @FindBy(css = "button.btn.btn-default.button-medium")
    WebElement btnConfirmarOrden;

    @FindBy(className = "alert")
    WebElement bannerOrdenCompleta;

    public boolean ResultadoOrden(String mensaje){
        System.out.println(mensaje);
        System.out.println(bannerOrdenCompleta.getText());
        return mensaje.equals(bannerOrdenCompleta.getText());
    }

    @Step("#el usuario paga con cheque")
    public void PagarConCheque (){
        btnPagarConCheque.click();
    }

    @Step("#el usuario confirma la orden")
    public void ConfirmarOrden (){
        btnConfirmarOrden.click();
    }

    public WebPayment (WebDriver driver){
        PageFactory.initElements(driver,this);
    }


}
