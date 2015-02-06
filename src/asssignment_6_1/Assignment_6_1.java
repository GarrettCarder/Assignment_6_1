    package assignment_6_1;
    import java.util.Scanner;
    import java.util.Arrays;
    public class Assignment_6_1 {

        public static void main(String[] args) {
            //Create a Scanner
            Scanner input = new Scanner(System.in);
            //Create int & string []
            String[][]firstAndLastNames = new String[36][2];
                int[]heightOfPerson = new int[36];
            
            //Gather list of names and heights
            for(int i=0; i<heightOfPerson.length; i++)
            {
                //Get first name
                System.out.println("Enter Your First Name " + "Passenger #" + i+1 + ": ");
                firstAndLastNames[1][i] = input.next();
                
                //Get last name
                System.out.println("Enter Your Last Name " + "Passenger #" + i+1 + ": ");
                firstAndLastNames[2][i] = input.next();
                
                //Get height in inches
                System.out.println("Enter your height (Iches) " + "Passenger #" + i+1 + ": ");
                heightOfPerson[i] = input.nextInt();
                
                if(firstAndLastNames[36][2] != null){
                System.out.println(Arrays.deepToString(firstAndLastNames));
                break;}
            }
        }
    }
