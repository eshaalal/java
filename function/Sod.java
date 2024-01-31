import java.util.Scanner;
public class Sod{
    public static void main(String[] args){
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        System.out.println(sumofDigit(num));
        
    }
    public static int sumofDigit(int num){
        int sum=0;
        while (num>0){
            sum=sum+ num%10;
            num /=10;
        }
        return sum;
        
    }
}