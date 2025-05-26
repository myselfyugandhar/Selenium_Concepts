package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysClearTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/page1.html";
            driver.get(filePath);

            WebElement textInput = driver.findElement(By.id("textInput"));
            Thread.sleep(2000);

            // Clear existing text
            textInput.clear();

            // Send keys
            textInput.sendKeys("Selenium Automation Test");

            System.out.println("Text input value: " + textInput.getAttribute("value"));
            Thread.sleep(2000);
        } finally {
            driver.quit();
        }
    }
}
