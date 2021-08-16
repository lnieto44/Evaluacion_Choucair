package com.choucair.formacion.definition;

import com.choucair.formacion.pageobjects.*;
import com.choucair.formacion.steps.WebPrincipal;
import cucumber.api.java.es.Dado;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver chromeDriver;

    WebPrincipal webPrincipal;
    WebSignIn webSignIn;
    WebCategoryTShirts webCategoriaTshirts;
    WebPayment webPayment;
    WebShipping webShipping;
    WebSummary webSummary;
    WebAddress webAddress;

    @Dado("^Que (.*)  ingrese a  automationpractice$")
    private void comenzarPaginas(WebDriver driver){
        webPrincipal = new WebPrincipal(driver);
        webSignIn = new WebSignIn(driver);
        webCategoriaTshirts = new WebCategoryTShirts(driver);
        webPayment = new WebPayment(driver);
        webShipping = new WebShipping(driver);
        webSummary = new WebSummary(driver);
        webAddress = new WebAddress(driver);
    }

    @Before
    public void abrirDriver() {
        //encontrar archivo exe de chromedriver
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver_ver_92.exe");

        //creamos opciones sobre nuestro driver
        ChromeOptions options = new ChromeOptions();

        //nueva instancia de ChromeDriver
        chromeDriver = new ChromeDriver(options);

        //definimos tiempo de espera hasta que aceptemos un timeout
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        comenzarPaginas(chromeDriver);

        //Abrimos una URL
        chromeDriver.get("http://www.automationpractice.com/index.php");
    }
    @After
    public void cerrarDriver() {
        //Cerrar ventana, apagar driver
        chromeDriver.quit();
    }
}
