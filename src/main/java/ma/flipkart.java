package ma;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.Set;
public class flipkart {
    void b() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //driver.findElement(By.className("_2doB4z")).click();
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        //driver.findElement(By.xpath("//span[@role='button']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("iPhone 14 pro");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("(//div[@class='_3879cV'])[5]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
        Set<String> windows = driver.getWindowHandles();
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
    public static void main(String[] args) throws InterruptedException {
        flipkart ft = new flipkart();
        ft.b();




    }
}
