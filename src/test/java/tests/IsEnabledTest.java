package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/page1.html";
            driver.get(filePath);

            boolean isEnabled = driver.findElement(By.id("submitButton")).isEnabled();
            System.out.println("Is submit button enabled? " + isEnabled);
            Thread.sleep(2000);
        } finally {
            driver.quit();
        }
    }
}
