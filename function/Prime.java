import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int first = input.nextInt();
        System.out.println(prime(first));
        
    }
    public static String prime(int num1){
        int i=2;
        while(i<num1){
            if(num1%i==0){
                return "Not prime" ;
            }
            i++;
        }
        return "Yes it is Prime";
        
    }
}