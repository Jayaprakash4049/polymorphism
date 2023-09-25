package methodoverloading;

public class Methodoveriding {
	public static void main(String[] args)
    {
      
     
        Parent obj2 = new Child();
        obj2.show();
    }
}
class Parent {
   public void show() { 
    	System.out.println("Parent class()");
    	}
}
 
class Child extends Parent {
    

     public void show()
    {
        System.out.println("Child class()");
    }
}