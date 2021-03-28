package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaginaSignIn {

    @FindBy(css = "#email")
    WebElement campoEmail;

    @FindBy(css = "#passwd")
    WebElement campoPassword;

    @FindBy(css = "#SubmitLogin")
    WebElement botonSignIn;

    private void llenarCampoEmail(String email){
        campoEmail.sendKeys(email);
    }

    private void llenarCampoPassword(String password){
        campoPassword.sendKeys(password);
    }

    private void hacerClickSignIn(){
        botonSignIn.click();
    }

    public void identificarse(String email, String password){
        try{
            llenarCampoEmail(email);
            Thread.sleep(1000);

            llenarCampoPassword(password);
            Thread.sleep(1000);

            hacerClickSignIn();
            Thread.sleep(1000);
        }catch (Exception e){

        }
    }

    public PaginaSignIn(WebDriver driver){
        PageFactory.initElements(driver, this);
    }
}
