package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class table {
    void c() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\IdeaProjects\\NIT-9PM-June2023//chromedriver.exe");
        ChromeDriver driver= new ChromeDriver();
        System.out.println(System.getProperty("user.dir"));
        String str = System.getProperty("user.dir")+"\\table.html";
        driver.get(str);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        List<WebElement> tablerows = driver.findElements(By.xpath("//table//tr"));
        String columnfirst = "//table//tr[";
        String columnlast = "]//td";
        String Column;
        List<WebElement> tablecolumn ;
        for(int i=1;i<tablerows.size();i++){
            Column=columnfirst + i + columnlast;
            tablecolumn = driver.findElements(By.xpath(Column));
            for(int j= 0;j< tablecolumn.size();j++){
                System.out.println(tablecolumn.get(j).getText()+"\t\t\t");

            }
            System.out.println();
        }
        driver.close();

    }

    public static void main(String[] args) throws InterruptedException {
       table tb = new table();
       tb.c();

    }

}
