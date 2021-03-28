package pruebas;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import pageobjects.*;

import java.util.concurrent.TimeUnit;

public class BaseTestSuite {
    protected WebDriver firefoxDriver;

    PaginaPrincipal paginaPrincipal;
    PaginaSignIn paginaSignIn;
    PaginaTshirts paginaTshirts;
    PaginaOrder paginaOrder;
    PaginaPayment paginaPayment;

    private void inicializarPaginas(WebDriver driver){
        paginaPrincipal = new PaginaPrincipal(driver);
        paginaSignIn = new PaginaSignIn(driver);
        paginaTshirts = new PaginaTshirts(driver);
        paginaOrder = new PaginaOrder(driver);
        paginaPayment = new PaginaPayment(driver);
    }

    @Before
    public void abrirDriver() {
        //encontrar archivo exe de geckodriver
        System.setProperty("webdriver.gecko.driver", "src\\main\\resources\\geckodriver.exe");

        //creamos opciones sobre nuestro driver
        FirefoxOptions options = new FirefoxOptions();
        options.setCapability("marionette", false);

        //nueva instancia de FirefoxDriver
        firefoxDriver = new FirefoxDriver(options);

        //definimos tiempo de espera hasta que aceptemos un timeout
        firefoxDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        inicializarPaginas(firefoxDriver);
    }

    @After
    public void cerrarDriver() {
        //Cerrar ventana, apagar driver
        firefoxDriver.quit();
    }
}
