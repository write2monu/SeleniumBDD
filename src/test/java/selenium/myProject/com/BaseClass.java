package selenium.myProject.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass implements ITestListener
{

   protected static WebDriver driver;
   protected static ExtentReports reports;
   protected static ExtentTest tests;
   private String testCaseName;

   @BeforeSuite
   public void iniitalizeFramework(){
     // reports=new ExtentReports("results.html",true);
   }

   public void onTestStart(ITestResult arg0)
   {
      System.out.println("This is On Test Start....");
      reports=new ExtentReports("results.html",true);
      System.out.println("On test start....");
     testCaseName =arg0.getMethod().getMethodName();
     System.out.println("Thiss is test ITestResult :: "+arg0.getTestName());
     System.out.println("Thiss is instance ITestResult :: "+arg0.getInstanceName());
     System.out.println("Thiss is name ITestResult :: "+arg0.getName());
     System.out.println("Thiss is attributes ITestResult :: "+arg0.getAttributeNames().toString());
     System.out.println("Thiss is ITestResult :: "+arg0.getMethod().getMethodName());
     tests = reports.startTest(testCaseName);
   }

   public static ExtentTest getLogger(){
      return tests;
   }

   public WebDriver getDriver(){

     driver = new FirefoxDriver();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     return driver;
  }
   public static ExtentReports  getReporter(){
      return reports;
   }


   public void onFinish(ITestContext arg0)
   {

      System.out.println("This is End...");

   }


   public void onStart(ITestContext arg0)
   {
      System.out.println("This is On Start....");
      reports=new ExtentReports("results.html",true);

   }


   public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
   {
      // TODO Auto-generated method stub

   }


   public void onTestFailure(ITestResult arg0)
   {
      // TODO Auto-generated method stub

   }


   public void onTestSkipped(ITestResult arg0)
   {
      // TODO Auto-generated method stub

   }


   public void onTestSuccess(ITestResult arg0)
   {
      reports.endTest(tests);
      reports.flush(); // TODO Auto-generated method stub

   }
}
