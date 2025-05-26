package Concept_7_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class $2_ExplicitWait {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/Waits.html";
            driver.get(filePath);

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            System.out.println("Waiting explicitly for Imp/Exp Button to be present in 30 secs...");
            WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("impExpButton")));
            System.out.println("Button appeared before 30 seconds!");
            Thread.sleep(2000);

        } catch (Exception e) {
            System.out.println("Explicit wait failed: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
