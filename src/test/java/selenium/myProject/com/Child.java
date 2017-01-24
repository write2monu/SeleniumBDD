package selenium.myProject.com;

public class Child extends Parent{

   int i=10;
   String className = "Child";

   @Override
   public void print(){
      System.out.println("This is this class name :: "+this.className +" this.i "+ this.i);
      System.out.println("This is super class name :: "+super.className+" super.i "+ super.i);
      System.out.println("This is simple class name :: "+className+" i "+ i);
   }

   public static void main(String[] args){

      System.out.println("--------Parent/Child ---------------");
      Parent p = new Child();
      p.print();
      p.getParent();

      System.out.println("--------Parent ---------------");

      Parent p1 = new Parent();
      p1.print();
      p1.getParent();

      System.out.println("--------Child ---------------");

      Child c = new Child();
      c.print();
      c.getParent();


   }
}


