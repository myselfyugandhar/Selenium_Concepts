package Concept_7_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class $1_ImplicitWaitFail {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/Waits.html";

            driver.get(filePath);

            // Implicit wait set to 10 seconds
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            System.out.println("Trying to find Imp/Exp Button Button in 10 secs...");
            WebElement button = driver.findElement(By.id("impExpButton"));
            System.out.println("Button found: " + button.isDisplayed());

        } catch (Exception e) {
            System.out.println("Button NOT found within 10 seconds");
        } finally {
            driver.quit();
        }
    }
}
