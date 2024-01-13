import java.util.*;

public class Main {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int [] numbers = new int[3];
        for(int x = 1; x<3;x++){
            System.out.println("Enter number"+(x+1)+ ": ");
            numbers[x] = input.nextInt();
        }
        if(numbers[0] == numbers[1] && numbers[1] == numbers[2]){
            System.out.println("All Numbers are Equal");
        }
        else if(numbers[0] > numbers[1] && numbers[0] > numbers[2]){
            System.out.println(numbers+" is the largest Largest");
        }
        else
        System.out.println("error");
        
    }
}
