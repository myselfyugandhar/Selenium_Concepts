package Concept_3_SeleniumGrid;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class CrossBrowsers_ParallelExecution {

	//1. Launch the selenium grid server from the terminal(E:\Softwares>java -jar selenium-server-4.32.0.jar hub)
	//2. Connect to the node(E:\Softwares>java -jar selenium-server-4.32.0.jar node --hub http://192.168.0.105:4444)
	//3. Check the hosts in UI(http://localhost:4444/ui/)
	
    public static void main(String[] args) {
        String[] browsers = {"chrome", "firefox", "MicrosoftEdge"};
        String hubURL = "http://localhost:4444/wd/hub";  // Change if needed

        for (String browser : browsers) {
            Thread thread = new Thread(() -> {
                WebDriver driver = null;
                try {
                    DesiredCapabilities capabilities = new DesiredCapabilities();
                    capabilities.setPlatform(Platform.WINDOWS);
                    capabilities.setBrowserName(browser);
                    driver = new RemoteWebDriver(new URL(hubURL), capabilities);

                    driver.get("https://www.google.com");
                    System.out.println("Browser: " + browser + " | Title: " + driver.getTitle());
                    
                    Thread.sleep(5000);

                } catch (Exception e) {
                    System.out.println("Error on " + browser + ": " + e.getMessage());
                } finally {
                    if (driver != null) {
                        driver.quit();
                    }
                }
            });
            thread.start();
        }
    }
}

