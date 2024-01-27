import java.util.Scanner;
public class Swap{
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the first num");
        int num = input.nextInt();
        System.out.println("Enter the second num");
        int num2=input.nextInt();
        int x =num;
        num =num2;
        num2 =x;
        System.out.println("numbers after swapping:\nValue of 1st num = "+num+" \nValue of 2nd num = "+num2);

    }
}