import java.util.Scanner;
public class Sum{
    public static void main(String[] args){
        int first= readNumber();
        int second= readNumber();
        int sum = first+second;
        System.out.println("sum = "+sum);
    }
    public static int readNumber(){
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the number");
        int num = input.nextInt();
        return num;
    }
}