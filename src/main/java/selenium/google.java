package selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class google {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElementByXPath("//textarea[@jsname='yZiJbe']").sendKeys();


    }
}
