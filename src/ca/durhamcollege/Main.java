/**
 * @Authors: Gabriel Dietrich (100764733) and Fleur Blanckaert (100747083
 * @Date: Nov 21, 2020
 * @Program: OOP3200 - Java Lab 2
 * @Description: This application creates a class called WorkTicket, which represents the client's
 * 				request for IT support.	The class is copied into anew constructor. Later on, the
 * 				application demonstrates the usability of the operators "==", "=", ">>", and "<<".
 */


package ca.durhamcollege;

import java.time.DateTimeException;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // Declarations
        WorkTicket ticket;
        String ticketInput; // Has to be int
        String clientInput;
        LocalDate localDate = LocalDate.now();
        String dayInput; // Has to be LocalDate
        String monthInput;
        String yearInput;
        String descriptionInput;
        boolean isValid = false;


        int MIN_AMOUNT = 1;
        int MAX_DAY = 31;
        int MAX_MONTH = 12;
        int MIN_YEAR = 2000;
        int MAX_YEAR = 2099;
        int i = 0;

        // Output Header
        System.out.println("===============================================");
        System.out.println("\tIT Support Application");
        System.out.println("===============================================\n");

        do
        {
            try
            {
                // Ticker Number
                System.out.print("The Ticket Number is: ");
                ticketInput = keyboard.nextLine(); // ReadInteger

                // Client ID
                do
                {
                    System.out.print("The Client ID is: ");
                    clientInput = keyboard.nextLine();

                    if(clientInput.length() < MIN_AMOUNT)
                    {
                        System.out.println("Client ID must be at least " + MIN_AMOUNT + " character long");
                    }
                }
                while(clientInput.length() < MIN_AMOUNT);


                // Work Ticket Date
                System.out.println(localDate);

                // Day
                System.out.print("The Work Ticket Date is: \nDay: ");
                dayInput = keyboard.nextLine();

                // Month
                System.out.print("Month: ");
                monthInput = keyboard.nextLine();

                // Year
                System.out.print("Year: ");
                yearInput = keyboard.nextLine();


                // Description
                do
                {
                    System.out.print("The Issue Description is: ");
                    descriptionInput = keyboard.nextLine();

                    if(descriptionInput.length() < MIN_AMOUNT)
                    {
                        System.out.println("Description must be at least " + MIN_AMOUNT + " character long");
                    }
                }
                while (descriptionInput.length() < MIN_AMOUNT);

                // Ends loop
                isValid = true;
            }
            catch(IllegalArgumentException illegalArgumentException)
            {

                // How can we have the same exception type but for two different types of errors???
                System.out.println("Error: Invalid entry. Please enter a whole, positive number.");

                System.out.println("Error: Year out of range. Must be between " + MIN_YEAR + " and " +
                        MAX_YEAR);

                isValid = false;
            }
            catch(DateTimeException dateTimeException)
            {
                System.out.println("Error: Invalid date. Days must be entered " +
                        "as integer from 1 to 31.\nMonths must be entered as integer from 1 to 12");

                isValid = false;
            }


        }
        while(!isValid);
    }
}
