package selenium.davehaffner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class Login {
    private WebDriver driver;
    By usernameLocator = By.id("username");
    By passwordLocator = By.id("password");
    By loginFormLocator = By.id("login");
    By successMessageLocator = By.cssSelector(".flash.success");
    By failureMessageLocator = By.cssSelector(".flash.error");

    public Login(WebDriver driver) {
        this.driver = driver;
        driver.get("http://the-internet.herokuapp.com/login");
        assertTrue("The login form is not present", driver.findElement(loginFormLocator).isDisplayed());
    }
    public void with(String username, String password) {
        driver.findElement(usernameLocator).sendKeys(username);
        driver.findElement(passwordLocator).sendKeys(password);
        driver.findElement(loginFormLocator).submit();
        driver.get("https://www.google.com");
    }

    public Boolean successMessagePresent() {return driver.findElement(successMessageLocator).isDisplayed();}
    public Boolean failureMessagePresent() {return driver.findElement(failureMessageLocator).isDisplayed();}

    public static void main(String[] args) {
            try {
                System.setProperty("webdriver.chrome.driver", "D:\\GitHub_Clone_kodilla_tester\\TestRoot\\chromedriver.exe");

//                Login login = new Login( );
//                login.with("username", "password");

            } catch (Exception e) {
                e.printStackTrace();
            }


        }

}

