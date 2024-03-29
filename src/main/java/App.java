import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

public class App {

 public static void main(String[] args){
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
     driver.get("https://jqueryui.com/droppable/");


     driver.switchTo().frame(driver.findElement(By.cssSelector("#content > iframe")));

     WebElement draggable = driver.findElement(By.id("draggable"));
     WebElement droppable = driver.findElement(By.id("droppable"));

    Actions dragAndDrop = new Actions(driver);
    dragAndDrop.dragAndDrop(draggable, droppable).build().perform();


    Actions contextClick = new Actions(driver);

    contextClick.contextClick().build().perform();

    Actions actionsObject = new Actions(driver);
    actionsObject.keyDown(Keys.F1);

     //Implicit wait
//     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//     driver.get("https://www.udemy.com/course/core-java-programming-language-tutorial/");

//     //Working with Iframes
//     driver.get("https://www.w3schools.com/html/html_iframe.asp");
//
////     String title = driver.switchTo().frame(0).findElement(By.xpath("//*[@id=\"main\"]/h1")).getText();
////     System.out.println(title);
//        WebElement iframe = driver.findElement(By.cssSelector("#main > div:nth-child(7) > iframe"));
//
//        driver.switchTo().frame(iframe).findElement(By.cssSelector("#subtopnav > a:nth-child(5)")).click();

//     WebElement SignupButton = driver.findElement(By.cssSelector("#udemy > div.ud-main-content-wrapper > div.ud-app-loader.ud-component--header-v6--header.ud-header.ud-app-loaded > div.ud-header.ud-text-sm.desktop-header-module--header--a5wri.desktop-header-module--flex-middle--k0Teb > div:nth-child(9) > a > span"));
//
//     //clicking with JavascriptExecutor
//     ((JavascriptExecutor) driver).executeScript("arguments[0].click();, SignupButton");
//
//     //Setting the timeout
//     ((JavascriptExecutor) driver).executeAsyncScript("window.setTimeout[arguments.length-1], 1000");
//
//     //changing the webpage
//     ((JavascriptExecutor) driver).executeScript("window.location = `https://wikipedia.com`");



     //Explicit wait
//     WebDriverWait wait = new WebDriverWait(driver, 10);
//     wait.until(ExpectedConditions.presenceOfElementLocated(By.id("js-link-box-en")));
//
//    //Fluent wait
//     FluentWait<WebDriver> wait = new FluentWait<>(driver)
//             .withTimeout(Duration.ofSeconds(10))
//             .pollingEvery(Duration.ofSeconds(1))
//             .ignoring(NoSuchElementException.class);
//
//     try {
//         // Wait for the element with the specified ID to be present
//         WebElement element = wait.until(driver -> driver.findElement(By.id("your_element_id")));
//
//         // If the element is found, perform actions on it
//         // For example, you can click on it
//         element.click();
//     } catch (TimeoutException e) {
//         // If the element is not found within 10 seconds, handle the error
//         System.out.println("Element not found within 10 seconds!");
//         e.printStackTrace();
//     } finally {
//         // Quit the driver
//         driver.quit();
//     }

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

//     WebElement searchbox = driver.findElement(By.id("searchInput"));
//     String searchstr = "Selenium Webdriver";
//     searchbox.sendKeys(searchstr);
//
//
//     WebElement searchbutton = driver.findElement(By.cssSelector("#search-form > fieldset > button"));
//     searchbutton.click();


     //System.out.println(driver.findElement(By.xpath("/html/body/table/tbody[1]/tr[2]/td[1]")).getText());
     //System.out.println(driver.findElement(By.xpath("/html/body/table/tbody[1]/tr[1]/th[2]")).getText());

//     List<WebElement> listOfWebElements = driver.findElements(By.xpath("/html/body/table/tbody[1]/tr"));
//
//     for(WebElement element : listOfWebElements){
//         System.out.println(element.());
//     }







//     driver.close();
    }

}
