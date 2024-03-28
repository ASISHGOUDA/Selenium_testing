import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class App {

 public static void main(String[] args){
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     driver.get("http://www.wikipedia.org");

     //Locators
     //id
//     long start = System.currentTimeMillis();
//     driver.findElement(By.id("js-link-box-en"));
//     long end = System.currentTimeMillis();
//
//     System.out.println("The time needed to run this ID command: " + (end - start));
//
//     //xpath
//      start = System.currentTimeMillis();
//     driver.findElement(By.xpath("//*[@id=\"js-link-box-es\"]/strong"));
//      end = System.currentTimeMillis();
//     System.out.println("The time needed to run this xpath command: " + (end - start));
//
//
//     //cssSelector
//    start = System.currentTimeMillis();
//     driver.findElement(By.cssSelector("#js-link-box-en > strong"));
//      end = System.currentTimeMillis();
//     System.out.println("The time needed to run this cssSelector command: " + (end - start));

     // Getting a Text from the web element:
//     WebElement titleOfWebpage = driver.findElement(By.cssSelector("#www-wikipedia-org > main > div.central-textlogo > h1 > span"));
//     String titleText = titleOfWebpage.getText();
//     String expectedText = "Wikipedi";
//
//     if(titleText.equals(expectedText)) {
//         System.out.println("Test has been passed !");
//     }
//     else {
//         System.out.println("Test failed");
//         driver.close();
//         throw new RuntimeException("this is a exception");
//     }
     //clicking a element on a webpage
//     WebElement EnglishButton =  driver.findElement(By.id("js-link-box-en"));
//        EnglishButton.click();
//        String ExpectedTitle = "Welcome to Wikipedia";
//        WebElement titleEnglishPage = driver.findElement(By.id("Welcome_to_Wikipedia"));
//
//        if(titleEnglishPage.getText().equals(ExpectedTitle)){
//            System.out.println("Test has been passed");
//        }
//        else {
//            System.out.println("Test has been failed");
//        }

     // Sending Text to a webElement

     WebElement searchbox = driver.findElement(By.id("searchInput"));
     String searchstr = "Selenium Webdriver";
     searchbox.sendKeys(searchstr);


     WebElement searchbutton = driver.findElement(By.cssSelector("#search-form > fieldset > button"));
     searchbutton.click();
//     driver.close();
    }

}
