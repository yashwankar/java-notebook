interface Portable{
    public void carry();
}
interface GPU{
       public void run();
}
class GamingLaptop {
   public void gameplay(){
        System.out.println("Playing Games");
    }
}
class GLaptop extends GamingLaptop implements Portable, GPU{
public  void carry()
 {
     System.out.println("Carrying the laptop");
      }
public void run()
 {
     System.out.println("Running the Gaming laptop");
    }
}
public class Inter1 {
   public static void main(String args[]) {
    //   Laptop lenovo = new Laptop();
    //   lenovo.carry(); 
      GLaptop lenovog = new GLaptop();
      lenovog.run();
      lenovog.gameplay();
   }
}