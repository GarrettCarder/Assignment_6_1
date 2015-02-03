package assignment_6_1;
import java.util.Scanner;
import java.util.Arrays;
public class Assignment_6_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][]firstAndLastNames = new String[35][1];
        int[]heightOfPerson = new int[35];
        for(int i=0; i>35; i++)
        {
            System.out.println("Enter Your First Name " + "Passenger #" + i+1 + ": ");
            firstAndLastNames[i][0] = input.next();
            System.out.println("Enter Your Last Name" + "Passenger #" + i+1 + ": ");
            firstAndLastNames[i][1] = input.next();
            System.out.println("Enter your height (Iches) " + "Passenger #" + i+1 + ": ");
            heightOfPerson[i] = input.nextInt();
            
        }
        System.out.println(firstAndLastNames);
    }
    
}
