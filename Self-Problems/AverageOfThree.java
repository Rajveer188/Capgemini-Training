import java.util.Scanner;
class AverageOfThree {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter second number: ");
        double num2 = scan.nextDouble();
        System.out.println("Enter third number: ");
        double num3 = scan.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average of three numbers: " + average);
    }
    
}
