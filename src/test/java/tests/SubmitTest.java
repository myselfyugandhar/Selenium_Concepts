package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/page1.html";
            driver.get(filePath);
            Thread.sleep(2000);
            WebElement submitBtn = driver.findElement(By.id("submitButton"));
            submitBtn.click();
           
            System.out.println("Submit button clicked.");
            Thread.sleep(5000);
        } finally {
            driver.quit();
        }
    }
}
