package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRCTC {
    public static void main (String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.irctc.co.in/nget/train-search");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElementByXPath("//input[@aria-controls='pr_id_1_list']").sendKeys("Kalaburagi");
       // driver.findElementByXPath("//input[@aria-autocomplete='list']").sendKeys("Hyderabad");
        driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("Hyderabad");
        driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).click();
        driver.findElement(By.xpath("(//a[@draggable='false'])[2]")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

      //  Select date = new Select(driver.);

        Thread.sleep(5000);

       // driver.close();

    }

}
