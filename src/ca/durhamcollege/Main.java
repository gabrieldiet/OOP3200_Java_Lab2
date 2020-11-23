/**
 * @Authors: Gabriel Dietrich (100764733) and Fleur Blanckaert (100747083)
 * @Date: Nov 21, 2020
 * @Program: OOP3200 - Java Lab 2
 * @Description: This is the main page of the application where we prompt the user
 *               to enter the required information to create a new work ticket
 */

package ca.durhamcollege;
import javax.swing.*;
import java.time.DateTimeException;
import java.util.Scanner;
import java.time.LocalDate;
public class Main
{
    public static void main(String[] args)
    {

        // Declarations
        int ticketInput = 0;
        String clientInput = "";
        int dayInput = 0;
        int monthInput = 0;
        int yearInput = 0;
        String descriptionInput = "";
        boolean isValid = true;
        int i = 1;

        do {
            try {
                WorkTicket ticket = new WorkTicket();
                WorkTicket ticket1 = new WorkTicket();

                //Parameterized constructor
                WorkTicket ticket2 = new WorkTicket(12, "Hello", 12, 12, 2020, "Error");

                //Parameterized constructor with error
                WorkTicket ticket3 = new WorkTicket(12, "Hello", 12, 12, 2020, "Error");

                //Default Constructor
                System.out.println("\nThe Default constructor" + ticket1.toString());
                System.out.println("\nThe Parameterized constructor" + ticket2.toString());

                // Output Header
                System.out.println("\n=====================================");
                System.out.println("\tIT Support Application: Entry " + i );
                System.out.println("=====================================\n");

                Scanner keyboard = new Scanner(System.in);

                //Prompts user to enter ticket ID
                System.out.print("The Ticket Number is: ");
                ticketInput = keyboard.nextInt();
                keyboard.nextLine();

                //Prompts user to enter client id
                do
                {
                    System.out.print("The Client ID is: ");
                    clientInput = keyboard.nextLine();

                    if(clientInput.length() == 0)
                    {
                        System.out.println("Client ID must have at least 1 character. Please try again");
                    }
                }
                while(clientInput.length() == 0);

                //Prompts user to enter ticket day
                System.out.println("The Work Ticket Date is: ");
                System.out.print("Day: ");
                dayInput = keyboard.nextInt();

                //Prompts user to enter ticket month
                System.out.print("Month: ");
                monthInput = keyboard.nextInt();

                //Prompts user to enter ticket year
                System.out.print("Year: ");
                yearInput = keyboard.nextInt();
                keyboard.nextLine();

                //Prompts user to enter ticket description
                do
                {
                    System.out.print("The Issue Description is: ");
                    descriptionInput = keyboard.nextLine();

                    if(descriptionInput.length() == 0)
                    {
                        System.out.println("Description must have at least 1 character. Please try again");
                    }
                }
                while(descriptionInput.length() == 0);


                // Displays the output
                ticket.SetWorkTicket(ticketInput, clientInput, dayInput, monthInput, yearInput, descriptionInput);
                System.out.println(ticket.toString());

            }
            catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Exception occurred: " + illegalArgumentException.getMessage());
                isValid = false;
            }
            catch (DateTimeException dateTimeException) {
                System.out.println("Exception occurred: " + dateTimeException.getMessage());
                isValid = false;
            }
            if(isValid)
            {
                break;
            }else
            {
                i++;
            }

        }
        while(!isValid);
    }
}
