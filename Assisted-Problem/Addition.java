import java.util.Scanner;
class Addition{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter first number");
       int num1 = scan.nextInt();
       System.out.println("Enter second number");
       int num2 = scan.nextInt();
       
       int result = num1+num2;
       System.out.println("Result is "+ result);
    }
}

