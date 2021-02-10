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
    public void register(){
        LoginPage loginPage = new LoginPage(driver);
        RegisterPage registerPage= new RegisterPage(driver);

        loginPage.btnIngresar();
        registerPage.Nombre();



    }


    @AfterTest
    public void cerrar() {
        closeBrowser();

    }



}
