package Concept_5_BrowserNavigations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class $1_BrowserNavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        // Setup ChromeDriver automatically
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // Set page load timeout to 20 seconds
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

        try {
            // Open Google homepage using get()
            driver.get("https://www.google.com");
            System.out.println("Title after get(): " + driver.getTitle());
            Thread.sleep(2000);

            // navigate().to()
            driver.navigate().to("https://www.bing.com");
            System.out.println("Title after navigate().to(): " + driver.getTitle());
            Thread.sleep(2000);

            // Navigate back to Google
            driver.navigate().back();
            System.out.println("Title after navigate().back(): " + driver.getTitle());
            Thread.sleep(2000);

            // navigate().forward()
            driver.navigate().forward();
            System.out.println("Title after navigate().forward(): " + driver.getTitle());
            Thread.sleep(2000);

            // navigate().refresh()
            driver.navigate().refresh();
            System.out.println("Page refreshed.");
            Thread.sleep(2000);

            // Print current URL
            System.out.println("Current URL: " + driver.getCurrentUrl());

            //getPageSource() → fetch the full HTML as a String.

//.length() → get the size of that HTML in characters.
            // Print page source length (to avoid dumping whole source)
            System.out.println("Page source length: " + driver.getPageSource());

        } finally {
            // Close browser
            driver.quit();
        }
    }
}
