package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class testama {


    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        driver.manage().window().maximize();
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Cricket Bat");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.linkText("Jaspo Slog Heavy Duty Plastic Cricket Bat,Full Size (34” X 4.5”inches) Premium Bat for All Age Groups – Kids/Boys/Girls/Adults")).click();
        String price = driver.findElement(By.xpath("(//span[@class='a-offscreen'])[1]")).getAttribute("type");
        System.out.println(price);

    }
}
