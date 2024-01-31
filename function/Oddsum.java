import java.util.Scanner;
public class Oddsum{
    public static void main(String[] args){
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = oddSum(num);
        System.out.println("sum of odd number till " + num + " is equal to " + sum );

    }
    public static int oddSum(int num){
        int i = 1, sum=0;
        while(i<=num){
            if(i%2!=0){
                sum=sum+i;
            }
            i++;
        }
        return sum;
        
    }
}
