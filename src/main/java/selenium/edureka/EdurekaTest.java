package selenium.edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EdurekaTest {

    private WebDriver driver;
    JavascriptExecutor jse;

    public void invokeBrowser() {
        try {
            System.setProperty("webdriver.chrome.driver", "D:\\GitHub_Clone_kodilla_tester\\TestRoot\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

            driver.get("http://www.edureka.co");
            searchElement();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
    public void  searchElement() {
        try {
            driver.findElement(By.id("search-inp1")).sendKeys("Java");
            Thread.sleep(3000);
            driver.findElement(By.id("search-button-bottom")).click();
            jse = (JavascriptExecutor)driver;
            jse.executeScript("scroll(0,800)");
            driver.findElement(By.xpath("//label[contains(text(), 'Weekend')]")).click();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        }
        public void exit() {
            driver.quit();
    }


    public static void main(String[] args) {
        EdurekaTest edurekaTest = new EdurekaTest();
        edurekaTest.invokeBrowser();
        edurekaTest.exit();
        


    }
}
