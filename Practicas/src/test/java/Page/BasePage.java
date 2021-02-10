package Page;

import Common.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BasePage {

    public WebDriver driver;

    public void openBrowser(){

        System.setProperty("webdriver.chrome.driver", Constants.ChromeDriver);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(Constants.Web_URL);

    }

    public void closeBrowser() {
        //driver.close();  para cerrar la pagina
        driver.quit();

    }

}
