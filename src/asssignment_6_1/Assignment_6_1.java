package asssignment_6_1;
import java.util.Scanner;
public class Assignment_6_1 {
    public static String[][] Names(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first and last names of the 36 passengers on the flight: ");
        
        String[] [] flightManifest = new String [2] [36];
        for(int i=0; i<36; i++)
        {
            System.out.println("Enter Your Name: ");
            String name1 = input.next();
            String name2 = input.next();
            flightManifest[name1][name2] = input.next();
        }
        
            return flightManifestInput;
    }
    
}

