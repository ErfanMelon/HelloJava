import lang.stride.*;
import java.util.Scanner;

public class FirstProject
{
    static public void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        Scanner operation = new Scanner(System.in);
       
        System.out.print("Enter your number1: ");
        double num1 = number.nextInt();
       
        System.out.print("Enter your number2: ");
        double num2 = number.nextInt();
       
        System.out.println("1:+ , 2:- , 3:* , 4:/");
        System.out.print("your operation: ");
        int op = operation.nextInt();
         switch(op){
            case 1:
              System.out.println(num1+" + "+num2+" =  " + (num1 + num2));
              break;
           
            case 2:
              System.out.println(num1+" - "+num2+" =  " + (num1-num2));
              break;
           
            case 3:
              System.out.println(num1+" * "+num2+" =  " + (num1 * num2));
              break;
             
            case 4:
              System.out.println(num1+" / "+num2+" =  " + (num1 / num2));
              break;
             
            default:
              System.out.println("error: 0 < op < 5");
         }
    }
}