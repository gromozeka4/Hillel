package MobileTopUp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import screens.MobileTopUpPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class MobileTopUpTest {
    private WebDriver driver;
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://next.privat24.ua/mobile");
    }

    @After
    public void tearDown(){
        driver.close();
    }

    @Test
        public void checkNavigationFromLandingPage(){
        MobileTopUpPage mobileTopUpPage = new MobileTopUpPage(driver);
        driver.findElement(By.xpath("//input[@data-qa-node='phone-number']"));
        driver.findElement(By.xpath("//button[@data-qa-node='phone-code']"));
    }
}
