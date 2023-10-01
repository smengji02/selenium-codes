package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
public class flipkart {
    @BeforeMethod(enabled = false)
    public void a() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
        @Test
                void b(){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.get("http://www.flipkart.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//span[@role='button']")).click();
            driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iPhone 14 pro");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            driver.findElement(By.xpath("(//div[@class='_3879cV'])[5]")).click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
            String window = driver.getWindowHandle();
            // System.out.println(window);
            Set<String> windows = driver.getWindowHandles();
            // System.out.println(windows);
            Iterator<String> it = windows.iterator();
            while(it.hasNext()){
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.switchTo().window(it.next());
                //System.out.println(driver.getTitle());
            }
                driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
                driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
                driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8722448811");
                driver.findElement(By.xpath("//button[@type='submit']")).click();
        }
        @AfterMethod(enabled = false)
                 void c(){
            ChromeDriver driver = new ChromeDriver();
            driver.close();
        }
}
