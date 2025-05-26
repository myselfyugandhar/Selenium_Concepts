package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        try {
            String userDir = System.getProperty("user.dir");
            String filePath = "file:///" + userDir.replace("\\", "/") + "/src/test/resources/HTMLTestFiles/page1.html";
            driver.get(filePath);

            Rectangle rect = driver.findElement(By.id("styledDiv")).getRect();
            System.out.println("Position (x,y): (" + rect.getX() + "," + rect.getY() + ")");
            System.out.println("Size (width,height): (" + rect.getWidth() + "," + rect.getHeight() + ")");
            Thread.sleep(2000);
        } finally {
            driver.quit();
        }
    }
}
