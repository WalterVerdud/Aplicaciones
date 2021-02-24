package Tests;

import Helpers.Helpers;
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
        Helpers helpers = new Helpers();

        System.out.println(driver.getCurrentUrl());


        loginPage.btnIngresar();
        registerPage.Nombre();
        registerPage.Apellido();
        //registerPage.Imagen();
        registerPage.Mail();
        registerPage.Telefono();
        helpers.sleepSeconds(3);
        registerPage.Genero();
        registerPage.ElegirPais();
        helpers.sleepSeconds(3);
        registerPage.Pais();
        helpers.sleepSeconds(3);
        registerPage.SeleccionarAnio();
        registerPage.Anio();
        registerPage.SeleccionarMes();
        registerPage.Mes();
        registerPage.SeleccionarDia();
        registerPage.Dia();
        registerPage.Pass();
        registerPage.ConfirmaPass();
        registerPage.Ingresar();
        helpers.sleepSeconds(8);
    }

    @AfterTest
    public void cerrar() {
        closeBrowser();

    }


}
