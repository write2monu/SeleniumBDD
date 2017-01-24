package selenium.myProject.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamBasic
{

   public static void main(String[] args) throws IOException{


      FileInputStream fis = new FileInputStream("Reading.txt");
      FileOutputStream oos = new FileOutputStream("Copy.txt");
      System.out.println("This is file size  :: "+fis.available());
     int content=0;
     int chars=1;
      while((content=fis.read())!=-1){
         oos.write(content);
         System.out.print(" "+chars+":: "+(char)content);
         chars++;
      }

      System.out.println("This is hello ");






   }
}
