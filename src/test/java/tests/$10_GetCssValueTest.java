package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class $10_GetCssValueTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/page1.html";
            driver.get(filePath);

            String fontSize = driver.findElement(By.id("styledDiv")).getCssValue("font-size");
            System.out.println("Font size of styledDiv: " + fontSize);
            Thread.sleep(2000);
        } finally {
            driver.quit();
        }
    }
}
