package package_javaclass;

public class Myclass 
{
   final int x;
   Myclass()
  {
      x = 10;
     int y = x;
      y++;
      System.out.println(y);
      System.out.println(y++);
   }
public static void main(String[] args) {
    Myclass obj = new Myclass();
  }
}
