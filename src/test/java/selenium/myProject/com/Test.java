package selenium.myProject.com;

import org.openqa.selenium.By;

public class Test
{
   By supportMenu = By.xpath("//a[text(),'Support']");

   @org.testng.annotations.Test
   public void printWorld(){

      System.out.println("This is print world... ");
   }
}
