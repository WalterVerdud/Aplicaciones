package Tests;

import Page.BasePage;
import Page.LoginPage;
import Page.RegisterPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterTest extends BasePage {

    @BeforeTest
    public void setUp() {
        openBrowser();

    }

    @Test
    public void register() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        RegisterPage registerPage= new RegisterPage(driver);

        loginPage.btnIngresar();
        registerPage.Nombre();
        Thread.sleep(3000);
        registerPage.Apellido();
        Thread.sleep(3000);
        //registerPage.Imagen();
        registerPage.Mail();
        Thread.sleep(3000);
        registerPage.Telefono();
        Thread.sleep(3000);
        registerPage.Genero();
        Thread.sleep(3000);
        registerPage.ElegirPais();
        Thread.sleep(3000);
        registerPage.Pais();
        Thread.sleep(3000);
        registerPage.SeleccionarAnio();
        Thread.sleep(3000);
        registerPage.Anio();
        Thread.sleep(3000);
        registerPage.SeleccionarMes();
        Thread.sleep(3000);
        registerPage.Mes();
        Thread.sleep(3000);
        registerPage.SeleccionarDia();
        Thread.sleep(3000);
        registerPage.Dia();
        Thread.sleep(3000);
        registerPage.Pass();
        Thread.sleep(3000);
        registerPage.ConfirmaPass();
        Thread.sleep(3000);
        registerPage.Ingresar();
        Thread.sleep(6000);






    }


    @AfterTest
    public void cerrar() {
        closeBrowser();

    }



}
