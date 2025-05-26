package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/page1.html";
            driver.get(filePath);

            boolean isDisplayed = driver.findElement(By.id("textInput")).isDisplayed();
            System.out.println("Is text input displayed? " + isDisplayed);
            Thread.sleep(2000);
        } finally {
            driver.quit();
        }
    }
}
