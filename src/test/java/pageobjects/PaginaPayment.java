package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPayment {

    @FindBy(xpath = "//*[contains(text(),'I confirm my order')]")
    WebElement botonConfirmar;

    @FindBy(css = ".alert")
    WebElement bannerCompleta;

    public void confirmar(){
        botonConfirmar.click();
    }

    public boolean resultadoOrden(String mensaje){
        System.out.println(mensaje);
        System.out.println(bannerCompleta.getText());
        return mensaje.equals(bannerCompleta.getText());
    }

    public PaginaPayment(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
