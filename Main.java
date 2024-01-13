import java.util.*;

public class Main {
    public static void main(String[]args){
        Scanner input1 = new Scanner(System.in);
        int [] numbers = new int[3];
        System.out.println("Enter first number");
        int num1 = input1.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter second number");
        int num2 = input2.nextInt();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter third number");
        int num3 = input3.nextInt();

        if(num1 == num2 && num2 == num3){
            System.out.println("All Numbers are Equal");
        }
        else if(num1 > num2 && num1 > num3){
            System.out.println(num1+"Largest");
        }
        else if (num2 > num1 && num2 > num3 ){
                System.out.println(num2+"Largest");
        }
        else if (num3 > num1 && num3 > num2){
            System.out.println(num3+"Largest");
        }
        else
        System.out.println("error");
        
    }
}
