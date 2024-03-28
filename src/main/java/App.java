import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class App {

 public static void main(String[] args){
     WebDriver driver = new ChromeDriver();
     System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("http://www.wikipedia.org");

     //Locators
     //id
     long start = System.currentTimeMillis();
     driver.findElement(By.id("js-link-box-en"));
     long end = System.currentTimeMillis();

     System.out.println("The time needed to run this ID command: " + (end - start));

     //xpath
      start = System.currentTimeMillis();
     driver.findElement(By.xpath("//*[@id=\"js-link-box-es\"]/strong"));
      end = System.currentTimeMillis();
     System.out.println("The time needed to run this xpath command: " + (end - start));


     //cssSelector
    start = System.currentTimeMillis();
     driver.findElement(By.cssSelector("#js-link-box-en > strong"));
      end = System.currentTimeMillis();
     System.out.println("The time needed to run this cssSelector command: " + (end - start));


    }

}
