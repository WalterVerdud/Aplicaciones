package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwichPage {

    WebDriver driver;

    By solapa = By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a");
    //By switchTo = By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a");
    By alerts = By.xpath("//*[@id='header']/nav/div/div[2]/ul/li[4]/ul/li[1]/a");
    By alertaOk = By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a");


    public SwichPage (WebDriver driver){
        this.driver = driver;
    }
    public void Solapa(){
        driver.findElement(solapa).click();
    }
    //public void Alerta(){
      //  driver.findElement(switchTo).click();
   // }
    public void EligeAlerts(){
        driver.findElement(alerts).click();
    }
    public void AlertaOk(){
        driver.findElement(alertaOk).click();
    }

}
