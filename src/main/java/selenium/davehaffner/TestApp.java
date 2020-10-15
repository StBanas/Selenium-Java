package selenium.davehaffner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\GitHub_Clone_kodilla_tester\\TestRoot\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
//        Login login = new Login();
    }
}
