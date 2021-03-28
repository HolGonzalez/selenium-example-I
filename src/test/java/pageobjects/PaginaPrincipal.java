package pageobjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaPrincipal {

    @FindBy(className = "login")
    WebElement botonSignIn;

    @FindBy(xpath = "//*[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[contains(text(),\"T-shirts\")]")
    WebElement botonTshirts;

    @FindBy(className = "alert")
    WebElement bannerCompleta;

    public void irASignIn(){
        botonSignIn.click();
    }

    public void irCategoriaTshirts(){
        botonTshirts.click();
    }

    public PaginaPrincipal(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
