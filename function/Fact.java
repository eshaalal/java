import java.util.Scanner;
public class Fact{
    public static void main(String[] args){
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println("factorial of given number = "+ factorial(num));

    }
    public static long factorial(int num){
        int i = 1;
        long facto=1;
        while(i<=num){
            facto=facto*i;
            i++;
        }
        return facto;
        
    }
}