import java.util.Scanner;
class PowerCalculation {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter base: ");
        double base = scan.nextDouble();
        System.out.println("Enter exponent: ");
        double exponent = scan.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
    }
    
}
