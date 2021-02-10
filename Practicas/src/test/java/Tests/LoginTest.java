package Tests;

import Page.BasePage;
import Page.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest extends BasePage {

    @BeforeTest
    public void setUp() {
        openBrowser();

    }

    @Test
    public void login(){
        LoginPage loginPage = new LoginPage(driver);

        loginPage.btnIngresar();

        



    }

    @AfterTest
    public void cerrar() {
        closeBrowser();

    }


}
