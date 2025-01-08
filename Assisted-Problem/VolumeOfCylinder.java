import java.util.Scanner;
class VolumeOfCylinder{
   public static void main(String args[]){
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter the radius : ");
     double radius = scan.nextDouble();
     System.out.println("ENTER THE HEIGHT : ");
     double height = scan.nextDouble();
     double volume = 3.14*radius*radius*height;
     System.out.println("Volume of cylinder : "+volume);
     scan.close();
   }
}
