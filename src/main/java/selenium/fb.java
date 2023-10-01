package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
public class fb {
    void a(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("firstname")).sendKeys("Kriti");
        driver.findElement(By.name("lastname")).sendKeys("Mengji");
        driver.findElement(By.name("reg_email__")).sendKeys("kritimengji@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("Kriti@123");
        Select day = new Select(driver.findElement(By.xpath("//select[@id='day']")));
        Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();

        day.selectByValue("19");
        month.selectByValue("10");
        year.selectByValue("2021");


        driver.close();
    }


    public static void main(String[] args){
        fb f = new fb();
        f.a();



    }
}
