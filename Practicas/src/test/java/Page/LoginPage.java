package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;


    By btnIngresar = By.id("enterimg");
    /*
    By sigIn = By.id("btn2");
    By email = By.xpath("/html/body/div/div/div[2]/input");
    By pass = By.xpath("/html/body/div/div/div[3]/input");
    By enter = By.id("enterbtn");
     */

    public LoginPage(WebDriver driver){

        this.driver = driver;
    }

    public void btnIngresar(){

        driver.findElement(btnIngresar).click();
    }






}
