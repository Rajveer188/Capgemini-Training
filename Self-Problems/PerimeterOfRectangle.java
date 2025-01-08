import java.util.Scanner;

public class PerimeterOfRectangle {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter length of rectangle: ");
        double length = scan.nextDouble();
        System.out.println("Enter breadth of rectangle: ");
        double breadth = scan.nextDouble();
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }
}
