package com.choucair.formacion.definition;

import org.junit.Assert;
import org.junit.Test;

public class Comprar extends BaseTest{

    @Test
    public void hacer_una_compra() {

        //Crear elementos Web
        webPrincipal.IrSignIn();
        webSignIn.reconocer( "patinho200391@hotmail.com", "Memo1069735144");
        webPrincipal.IrCategoriaTshirts();
        webCategoriaTshirts.ComprarFadedShortSleeve();
        webSummary.hacerClickCheckout();
        webAddress.HacerClickCheckout();
        webShipping.terminarCompra();
        webPayment.PagarConCheque();
        webPayment.ConfirmarOrden();
        Assert.assertTrue(webPayment.ResultadoOrden("Your order on My Store is complete."));
    }


}