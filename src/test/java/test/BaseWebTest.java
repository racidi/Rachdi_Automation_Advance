package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseWebTest {

    public ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

    public ThreadLocal<WebDriverWait> explicitWait = new ThreadLocal<WebDriverWait>();

    @BeforeMethod
    public void openBrowser(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        driver.set(new ChromeDriver(options));
        driver.get().manage().window().maximize();
        driver.get().get("https://makemytrip.com");
        explicitWait.set(new WebDriverWait(driver.get(), Duration.ofSeconds(60)));
    }

    @AfterMethod
    public void closeBrowser(){
        driver.get().quit();
    }
}
