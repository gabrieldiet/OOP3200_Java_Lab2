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

public class Main
{

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // Declarations
        WorkTicket ticket;
        String ticketInput; // Has to be int
        String clientInput;
        LocalDate localDate = LocalDate.now();
        String workTicketDate;
        int dayInput; // Has to be LocalDate
        int monthInput;
        int yearInput;
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
                //ticketInput = ReadInteger(1);
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
                System.out.print("The Work Ticket Date is (mm/dd/yyyy): ");
                //workTicketDate = dateInput();
                workTicketDate = keyboard.nextLine();
                System.out.println(localDate);


                System.out.println("The Work Ticket Date is: ");
                do
                {
                    // Day
                    System.out.print("Day: ");
                    dayInput = keyboard.nextInt();

                    if(dayInput < MIN_AMOUNT || dayInput > MAX_DAY)
                    {
                        System.out.println("\nError: Day must be between " + MIN_AMOUNT + " and " + MAX_DAY + "\n");
                    }
                }
                while(dayInput < MIN_AMOUNT || dayInput > MAX_DAY);

                do
                {
                    // Month
                    System.out.print("Month: ");
                    monthInput = keyboard.nextInt();

                    if(monthInput < MIN_AMOUNT || monthInput > MAX_MONTH)
                    {
                        System.out.println("\nError: Day must be between " + MIN_AMOUNT + " and " + MAX_MONTH + "\n");
                    }
                }
                while(monthInput < MIN_AMOUNT || monthInput > MAX_MONTH);

                do
                {
                    // Year
                    System.out.print("Year: ");
                    yearInput = keyboard.nextInt();

                    if(yearInput < MIN_YEAR || yearInput > MAX_YEAR)
                    {
                        System.out.println("\nError: Day must be between " + MIN_YEAR + " and " + MAX_YEAR + "\n");
                    }

                }
                while(yearInput < MIN_YEAR || yearInput > MAX_YEAR);

                // Description
                do
                {
                    System.out.print("The Issue Description is: ");
                    descriptionInput = keyboard.nextLine();

                    if(descriptionInput.length() < MIN_AMOUNT)
                    {
                        System.out.println("\nDescription must be at least " + MIN_AMOUNT + " character long");
                    }
                }
                while (descriptionInput.length() < MIN_AMOUNT);

                //Sets the WorkTicket
                //ticket.SetWorkTicket = (ticketInput, clientInput, workTicketDate, descriptionInput);

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

        // Displays the output
        System.out.println("\nTicket Number\tClient ID\tWork Ticket Date\tIssue Description");
        //System.out.print(ticket.ShowWorkTicket());
        //System.out.print(ticketInput + clientInput + workTicketDate + descriptionInput);



    }
}
