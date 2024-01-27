import java.util.Scanner;
public class Sum2{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter 2 numbers you want to find sum of: ");
        int num1= input.nextInt();
        int num2= input.nextInt();
        int sum=num1+num2;
        System.out.print("The sum is : "+sum);
    }
}