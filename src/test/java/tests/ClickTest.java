package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/page1.html";
            driver.get(filePath);

            WebElement checkbox = driver.findElement(By.id("checkboxInput"));
            checkbox.click();

            System.out.println("Checkbox selected: " + checkbox.isSelected());
            Thread.sleep(2000);
        } finally {
            driver.quit();
        }
    }
}
