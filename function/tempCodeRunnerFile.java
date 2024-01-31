import java.util.Scanner;
public class Lcm{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int first = input.nextInt();
        System.out.println("Enter the second number : ");
        int second = input.nextInt();
        System.out.println("LCM of given numbers is:" +leastMultiple(first,second));
        
    }
    public static int leastMultiple(int num1, int num2){
        int i=1;
        while(true){
            if((num1*i)%num2==0){
                return num1*i;
            }
            i++;
        }
        
    }
}