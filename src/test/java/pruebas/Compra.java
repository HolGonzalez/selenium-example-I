package pruebas;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Compra extends BaseTestSuite{

    @Test
    public void hacer_una_compra() {
        //Abrimos una URL
        firefoxDriver.get("http://www.automationpractice.com/index.php");

        //Ir a login
        paginaPrincipal.irASignIn();

        //Ingresar credenciales
        paginaSignIn.identificarse("juantor16@gmail.com","Argentina1");

        //Seleccionamos la pestaña de "T-shirts"
        paginaPrincipal.irCategoriaTshirts();

        //Seleccionar producto a comprar
        paginaTshirts.comprarProducto();

        //Proceso de Checkout
        paginaOrder.ordenCheckout();

        //Confirmar compra
        paginaPayment.confirmar();

        //Validar proceso completado
        Assert.assertTrue(paginaPayment.resultadoOrden("Your order on My Store is complete."));
    }


}