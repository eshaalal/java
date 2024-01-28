import java.util.Scanner;
public class Info{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you Name");
        String add = input.nextLine();
        System.out.println("Hi! welcome to this new course "+ add);
    }
}