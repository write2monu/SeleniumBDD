package selenium.myProject.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportWorking
{
   private static  ExtentReports extReports;
   private static ExtentTest tests;

   ExtentReportWorking(){
      extReports = new ExtentReports("ExtentReportWorking.html");
   }

   @Test
   public void extentReportFirstExample(){

      tests = extReports.startTest("Extent Report First Example");
      tests.log(LogStatus.PASS, "First Step", "Step 1....");
      tests.log(LogStatus.PASS, "Second Step", "Step 2....");
      tests.log(LogStatus.PASS, "Third Step", "Step 3....");
      tests.log(LogStatus.PASS, "Fourth Step", "Step 4....");
      tests.log(LogStatus.PASS, "Fifth Step", "Step 5....");
      tests.log(LogStatus.PASS, "Six Step", "Step 6....");
      tests.log(LogStatus.PASS, "Seven Step", "Step 7....");
      tests.log(LogStatus.PASS, "Eight Step", "Step 8....");
      tests.log(LogStatus.PASS, "Ninth Step", "Step 9....");
      tests.log(LogStatus.PASS, "Tenth Step", "Step 10....");

      extReports.endTest(tests);

   //   extReports.flush();

   }

   @Test
   public void extentReportSecondExample(){

      tests = extReports.startTest("Extent Report Second Example");
      tests.log(LogStatus.PASS, "First Step", "Step 1....");
      tests.log(LogStatus.PASS, "Second Step", "Step 2....");
      tests.log(LogStatus.PASS, "Third Step", "Step 3....");
      tests.log(LogStatus.PASS, "Fourth Step", "Step 4....");
      tests.log(LogStatus.PASS, "Fifth Step", "Step 5....");
      tests.log(LogStatus.PASS, "Six Step", "Step 6....");
      tests.log(LogStatus.PASS, "Seven Step", "Step 7....");
      tests.log(LogStatus.PASS, "Eight Step", "Step 8....");
      tests.log(LogStatus.PASS, "Ninth Step", "Step 9....");
      tests.log(LogStatus.FAIL, "Tenth Step", "Step 10....");
      extReports.endTest(tests);
      Assert.fail();
      extReports.flush();

   }



}
