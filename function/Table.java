import java.util.Scanner;
public class Table{
    public static void main(String[] args){
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        table(num);

    }
    public static void table(int num){
        int i=1;
        while (i<=10){
            System.out.println(num +" x "+ i+" = "+ num*i);
            i++;
        }
        
    }
}