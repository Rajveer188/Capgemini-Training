import java.util.Scanner;
class AreaOfcircle{
  public static void main(String[] args){
   Scanner scan = new Scanner(System.in);
   System.out.println("enter the radius");
   double radius = scan.nextDouble();
   double circle = 3.14 * radius * radius;
   System.out.println("area of circle : "+circle);
   
  }
}
