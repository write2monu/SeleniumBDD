package selenium.myProject.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FirstClass extends BaseClass
{

   private WebDriver driver;
   private ExtentReports reports;
   private ExtentTest tests;
   private By searchBox = By.xpath("//input[@name='s'][@type='text']");
   private By supportMenu = By.xpath("//a[text()='Support']");
   private By tryJquerySubMenu = By.xpath("//a[text()='Try jQuery']");

 FirstClass(){
     driver=getDriver();
  }

  public void initializeApp(){
   driver.get("https://www.jqueryui.com/");
   getLogger().log(LogStatus.PASS, "Initializing base URL", "Opening JQuery Application");

   }
  public void searchAnyItem(String value){
    driver.findElement(searchBox).sendKeys(value);
    getLogger().log(LogStatus.PASS, "Searching ... ", "Searching given "+value);
  }

  public void clickOnSupportMenu(){
     driver.findElement(supportMenu).click();
     getLogger().log(LogStatus.PASS, "Opening Menu... ", "Support Menu is opened");
   }

  public void clickOnTryJquerySubMenu(){
     driver.findElement(tryJquerySubMenu).click();
     getLogger().log(LogStatus.PASS, "Opening Sub-Menu... ", "JQuery Sub-Menu is opened");
   }
public void elementNotVisibleException(){

   driver.findElement(tryJquerySubMenu).click();
   getLogger().log(LogStatus.FAIL, "Opening Sub-Menu... ", "Element Not visible exception..");
}

  public void openTryJQuerySubMenu(){

     Actions act = new Actions(driver);
     act.moveToElement(driver.findElement(supportMenu)).moveToElement(driver.findElement(tryJquerySubMenu)).click().build().perform();
  }


  public void getAllLinkOnJQueryPage(){

     driver.findElement(tryJquerySubMenu).click();
     getLogger().log(LogStatus.FAIL, "Opening Sub-Menu... ", "Element Not visible exception..");
     }


  public void closeDriver(){

     driver.close();
  }

  public void javaScriptExecutorFun(){

   //  ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    WebElement ele= driver.findElement(By.tagName("section"));
  String msg = (String) ((JavascriptExecutor) driver).executeScript(" return document.getElementById('banner-secondary').innerHTML;");
 System.out.println("this msg :: "+msg);

 String msgTitle = (String)((JavascriptExecutor) driver).executeScript(" return document.title;");
 System.out.println("this msg :: "+msgTitle);

  ((JavascriptExecutor) driver).executeScript("window.location='http://WWW.google.com';");

  ((JavascriptExecutor) driver).executeScript("top.window.close();");

 Boolean value = (Boolean) ((JavascriptExecutor) driver).executeScript(" return window.closed;");
 System.out.println("this msg :: "+value);


  }
public void someJavaScript(){

   JavascriptExecutor js = (JavascriptExecutor)driver;

   js.executeScript("alert('JQuery Alert!');");

   driver.switchTo().alert().accept();

   js.executeScript("alert('New Alert!');");

   driver.switchTo().alert().dismiss();

   driver.close();

   driver.get("https://www.jqueryui.com/");

}

}

