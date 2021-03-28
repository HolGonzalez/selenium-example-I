package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaOrder {

    @FindBy(xpath = "//p//*[contains(text(),'Proceed to checkout')]")
    WebElement botonCheckoutUno;

    @FindBy(xpath = "//button/span[contains(text(),'Proceed to checkout')]")
    WebElement botonCheckoutDos;

    @FindBy(css = "#cgv")
    WebElement checkCondiciones;

    @FindBy(xpath = "//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
    WebElement botonCheckoutTres;

    @FindBy(css = ".cheque")
    WebElement cheque;

    public void ordenCheckout(){
        botonCheckoutUno.click();
        botonCheckoutDos.click();
        checkCondiciones.click();
        botonCheckoutTres.click();
        cheque.click();
    }

    public PaginaOrder(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
