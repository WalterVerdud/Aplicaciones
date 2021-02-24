package Tests;

import Helpers.Helpers;
import Page.BasePage;
import Page.LoginPage;
import Page.RegisterPage;
import Page.SwichPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwitchTest extends BasePage {

    @BeforeTest
    public void setUp() {
        openBrowser();

    }

    @Test
    public void register() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        SwichPage swichPage = new SwichPage(driver);
        Helpers helpers = new Helpers();

        System.out.println(driver.getCurrentUrl());

        loginPage.btnIngresar();
        swichPage.Solapa();
        helpers.sleepSeconds(5);
        //swichPage.Alerta();
        helpers.sleepSeconds(5);
        swichPage.EligeAlerts();
        swichPage.AlertaOk();
        helpers.sleepSeconds(6);
        driver.switchTo().alert().accept();



    }



    @AfterTest
    public void cerrar() {
        closeBrowser();

    }
}
