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
            String[][]seatingChartDiagram = new String[9][4];
            int[][]seatRequest = new int [36][2];
            
            //Gather list of names and heights
            for(int i=0; i<heightOfPerson.length; i++)
            {
                
                //Get first name
                System.out.println("Enter Your First Name: ");
                firstAndLastNames[i][0] = input.next();
                
                //Get last name
                System.out.println("Enter Your Last Name: ");
                firstAndLastNames[i][1] = input.next();
                
                //Get height in inches
                System.out.println("Enter your height (Iches) : ");
                heightOfPerson[i] = input.nextInt();
                
                //Is there a seat request or not
                System.out.println("Do you want to request a seat ?");
                String ifSeatRequest = input.next();
                
                //Get seat request
                if(ifSeatRequest.equals("Yes") || ifSeatRequest.equals("yes"))
                {
                    System.out.println("Enter the seat row you want: ");
                    seatRequest[i][0] = input.nextInt();
                    System.out.println("Enter the seat number you want in that row: ");
                    seatRequest[i][1] = input.nextInt();
                }
                else
                {
                    //set the request colum for that person to 0 for no request
                    seatRequest[i][0] = 0;
                    seatRequest[i][1] = 0;
                }
                //Prints passenger manifest when list is full
                if(firstAndLastNames[35][1] != null){
                System.out.println("All Seats are Filled");
                break;}
            }
        }
    }
