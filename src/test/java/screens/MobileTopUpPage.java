package screens;

import org.openqa.selenium.WebDriver;

public class MobileTopUpPage {
    private static WebDriver driver;
    public String mobileTopUpUrl = "https://next.privat24.ua/mobile";

    public MobileTopUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return "";
    }
}
