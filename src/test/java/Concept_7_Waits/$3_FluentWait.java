package Concept_7_Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.ui.FluentWait;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class $3_FluentWait {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/Waits.html";
            driver.get(filePath);

            System.out.println("Waiting for 10 seconds before starting Fluent Wait...");
            Thread.sleep(5000);  // Optional delay before FluentWait starts

            FluentWait<WebDriver> fluentWait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(20))           // Max wait time
                    .pollingEvery(Duration.ofMillis(500))          // Poll every 0.5 seconds
                    .ignoring(NoSuchElementException.class);

            WebElement fluentButton = fluentWait.until(new Function<WebDriver, WebElement>() {
                public WebElement apply(WebDriver driver) {
                    WebElement btn = driver.findElement(By.id("fluentButton"));
                    if (btn.isDisplayed()) {
                        System.out.println("Fluent Button is visible: " + btn.getText());
                        return btn;
                    } else {
                        System.out.println("Fluent Button not visible yet...");
                        return null;
                    }
                }
            });

            // Click the button once found visible
            fluentButton.click();
            System.out.println("Fluent Button clicked!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
