import java.util.Scanner; 
class KilometersToMiles {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter distance in kilometers: ");
        double kilometers = scan.nextDouble();
        double miles = kilometers * 0.621371;
        System.out.println("Distance in miles: " + miles);
    }
    
}
