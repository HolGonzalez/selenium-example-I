package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaTshirts {

    WebDriver driver;

    @FindBy(xpath = "//img[@title='Faded Short Sleeve T-shirts']")
    WebElement imagenProducto;

    @FindBy(css = ".ajax_add_to_cart_button.btn.btn-default")
    WebElement botonAgregarCarrito;

    @FindBy(xpath = "//span[contains(text(),'Proceed to checkout')]")
    WebElement botonToCheckout;

    public void comprarProducto(){
        Actions action = new Actions(this.driver);
        action.moveToElement(imagenProducto).moveToElement(botonAgregarCarrito).click().build().perform();
        botonToCheckout.click();
    }

    public PaginaTshirts(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
