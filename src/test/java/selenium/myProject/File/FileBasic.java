package selenium.myProject.File;

import java.io.File;
import java.io.IOException;

public class FileBasic
{

   public static void main(String[] args) throws IOException{

      File projectPath = new File(".");
      File newFile = new File(projectPath.getCanonicalPath()+File.separator+"abc.text");
     // newFile.mkdirs();
      System.out.println("File exists before Creating :: "+newFile.exists());
      newFile.createNewFile();
      System.out.println("File exists after Creating :: "+newFile.exists());
      newFile.delete();
      System.out.println("File exists after delete :: "+newFile.exists());
      System.out.println("This is my simple path :: "+newFile.getPath());
      System.out.println("This is my absolute path :: "+newFile.getAbsolutePath());
      System.out.println("This is my connical path :: "+newFile.getCanonicalPath());
   }
}
