package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChrome {
	
	public static void main(String [] args) throws InterruptedException{
        //System.setProperty("webdriver.chrome.driver",path of executable file "Chromedriver.exe")
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DEEPTHA.NAIK\\Downloads\\chromedriver_win32.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.nnnow.com");
        System.out.println("Selenium Webdriver Script in Chrome browser | Software Testing Material");
        driver.manage().window().maximize();
        System.out.println("Maxized Screen");
        driver.close();
	}
}
