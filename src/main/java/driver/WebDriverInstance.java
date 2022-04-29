package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class WebDriverInstance {
    public static RemoteWebDriver initialize(Boolean isRunningOnHub) {
        RemoteWebDriver webDriver = null;
        URL URL_ADDRESS;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox", "--disable-dev-shm-usage", "--incognito", "--start-maximized", "window-size=1920,1080");
        options.setHeadless(true);
        WebDriverManager.chromedriver().setup();

        if (isRunningOnHub) {
            try {
                URL_ADDRESS = new URL(System.getProperty("urlHub", "http://172.20.0.2:4444/wd/hub"));
                webDriver = new RemoteWebDriver(URL_ADDRESS, options);
            } catch (Exception e) {
                System.out.println("Error : " + e);
            }
        } else {
            webDriver = new ChromeDriver(options);
        }
        assert webDriver != null;
        webDriver.get("http://z29vzcbmaw5kaw5nigzvcib5b3u.prospace.io/");
        return webDriver;
    }
}
