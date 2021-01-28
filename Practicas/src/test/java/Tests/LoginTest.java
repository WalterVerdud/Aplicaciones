package Tests;

import Page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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



    }

    @AfterTest
    public void cerrar() throws InterruptedException {
        closeBrowser();

    }


}
