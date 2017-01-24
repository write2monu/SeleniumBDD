package selenium.myProject.com;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class FirstClassTest
{

   @org.testng.annotations.Test
   public void searchTest() throws ScriptException{


      FirstClass obj = new FirstClass();
      obj.initializeApp();
      obj.searchAnyItem("JQuery");
  }

   @org.testng.annotations.Test
   public void openSubMenuTest() throws ScriptException{


      FirstClass obj = new FirstClass();
      obj.initializeApp();

      ScriptEngineManager factory = new ScriptEngineManager();
      ScriptEngine engine = factory.getEngineByName("JavaScript");
     // String alertMsg ="alert('Hello');";
  //    String msg = "document.getElementById('msg').innerHTML = 'jQuery';";
      //engine.eval(msg);

    //  obj.someJavaScript();
      //document.getElementById("msg").innerHTML = "";
      obj.clickOnSupportMenu();
      obj.clickOnTryJquerySubMenu();
      //obj.openTryJQuerySubMenu();
      //obj.elementNotVisibleException();
    // obj.closeDriver();
  }
}
