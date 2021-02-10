package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    By nombre = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public void Nombre() {
        driver.findElement(nombre).sendKeys("Walterios");
    }
}
