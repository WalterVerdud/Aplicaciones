package Page;

import Common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    By nombre = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
    By apellido = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
    By imagen = By.xpath("//*[@id=\"imagesrc\"]");
    By mail = By.xpath("//*[@id=\"eid\"]/input");
    By telefono = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input");
    By genero = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input");
    By selecPais = By.id("countries");
    By pais = By.xpath("//*[@id=\"countries\"]/option[12]");
    By selecAño = By.xpath("//*[@id=\"yearbox\"]");
    By año = By.xpath("//*[@id=\"yearbox\"]/option[76]");
    By selecMes = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
    By mes = By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select/option[2]");
    By selecDia = By.xpath("//*[@id=\"daybox\"]");
    By dia = By.xpath("//*[@id=\"daybox\"]/option[19]");
    By password = By.id("firstpassword");
    By confirmPass = By.id("secondpassword");
    By btnSubmit = By.id("submitbtn");

    public RegisterPage(WebDriver driver){
        this.driver = driver;
    }

    public void Nombre() {
        driver.findElement(nombre).sendKeys("Walterios");
    }
    public void Apellido(){
        driver.findElement(apellido).sendKeys("Verdud");
    }
    public void Imagen(){
        driver.findElement(imagen).sendKeys(Constants.ArchivoAdjunto);
    }
    public void Mail(){
        driver.findElement(mail).sendKeys("walter@mail.com");
    }
    public void Telefono(){
        driver.findElement(telefono).sendKeys("1156234623");
    }
    public void Genero(){
        driver.findElement(genero).click();
    }
    public void ElegirPais(){
        driver.findElement(selecPais).click();
    }
    public void Pais(){
        driver.findElement(pais).click();
    }
    public void SeleccionarAnio(){
        driver.findElement(selecAño).click();
    }
    public void Anio(){
        driver.findElement(año).click();
    }
    public void SeleccionarMes(){
        driver.findElement(selecMes).click();
    }
    public void Mes(){
        driver.findElement(mes).click();
    }
    public void SeleccionarDia(){
        driver.findElement(selecDia).click();
    }
    public void Dia(){
        driver.findElement(dia).click();
    }
    public void Pass(){
        driver.findElement(password).sendKeys("Testing01");
    }
    public void ConfirmaPass(){
        driver.findElement(confirmPass).sendKeys("Testing01");
    }
    public void Ingresar(){
        driver.findElement(btnSubmit).click();
    }

}
