package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class $12_GetAttributeTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/page1.html";
            driver.get(filePath);

            String valueAttr = driver.findElement(By.id("textInput")).getAttribute("value");
            System.out.println("Value attribute of textInput: " + valueAttr);
            Thread.sleep(2000);
        } finally {
            driver.quit();
        }
    }
}
