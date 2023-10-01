package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class flipkart {
    void a(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//span[@role='button']")).click();
        driver.findElement(By.name("q")).sendKeys("iPhone 14 pro");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("(//div[@class='_4rR01T'])[9]")).click();
        driver.close();

        // Switching Selenium to next tabe.
        Set<String > Windows = driver.getWindowHandles();
        Iterator<String> it= Windows.iterator();
        while (it.hasNext()){
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.switchTo().window(it.next());
        }


        //Scroilling down to d xptha which is given.

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        JavascriptExecutor j = (JavascriptExecutor)driver;
        WebElement w = driver.findElement(By.xpath("(//span[@class='_1rcQuH'])[1]"));
        j.executeScript("arguments[0].scrollIntoView(true)", w);
        driver.findElementById("pincodeInputId").sendKeys("585105");
        driver.findElement(By.xpath("//span[@class='_2P_LDn']")).click();
        driver.close();

        //selecting 512GB RAM .

       // driver.findElement(By.xpath("(//a[@class='_1fGeJ5'])[2]")).click();
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
        driver.findElement(By.xpath("(//button[@class='_23FHuj'])[2]")).click();

        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();

        driver.close();

    }

    public static void main(String[] args){
        flipkart fk = new flipkart();
        fk.a();

    }
}
