import java.util.Scanner;
class CelsiusToFahrenheit{
  public static void main(String Args[]){
  Scanner scan = new Scanner(System.in);
  System.out.println("Enter temperture in celsius");
  double celsius= scan.nextDouble();
  double fahrenheit = (celsius *9/5)+32;
  System.out.println("The temperature in fahrenheit"+fahrenheit+"F"); 
 }
}
