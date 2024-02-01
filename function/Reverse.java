import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Ente rthe number ");
        int num = input.nextInt();
        System.out.print("reverse of number is " + reverse(num));

    }
    public static int reverse(int num){
        int newnum=0;
        while(num>0){
            int digit = num%10;
            newnum = newnum*10 + digit;
            num = num/10;

        }
        return newnum;
    }
}