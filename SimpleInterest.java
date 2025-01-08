import java.util.Scanner;
class SimpleInterest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter principal amount: ");
        double principal = scan.nextDouble();
        System.out.println("Enter rate of interest: ");
        double rate = scan.nextDouble();
        System.out.println("Enter time period: ");
        double time = scan.nextDouble();
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }
}