package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/page1.html";
            driver.get(filePath);

            boolean isSelected = driver.findElement(By.id("radio2")).isSelected();
            System.out.println("Is radio button 2 selected? " + isSelected);
            Thread.sleep(2000);
        } finally {
            driver.quit();
        }
    }
}
