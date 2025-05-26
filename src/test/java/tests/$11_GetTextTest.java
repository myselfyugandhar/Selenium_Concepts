package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class $11_GetTextTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/page1.html";
            driver.get(filePath);

            String divText = driver.findElement(By.id("styledDiv")).getText();
            System.out.println("Text of styledDiv: " + divText);
            Thread.sleep(2000);
        } finally {
            driver.quit();
        }
    }
}
