/**
 * @Authors: Gabriel Dietrich (100764733) and Fleur Blanckaert (100747083
 * @Date: Nov 21, 2020
 * @Program: OOP3200 - Java Lab 2
 * @Description: This application creates a class called WorkTicket, which represents the client's
 * 				request for IT support.	The class is copied into anew constructor. Later on, the
 * 				application demonstrates the usability of the operators "==", "=", ">>", and "<<".
 */

package ca.durhamcollege;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WorkTicket
{

    // Private instance variables
    private int ticketNumber;
    private String clientId;
    private LocalDate ticketDate;
    //private int ticketDay;
    //private int ticketMonth;
    //private int ticketYear;
    private String issueDescription;

    // Public properties
    // Accessors
    public int getTicketNumber() { return ticketNumber;  }
    public String getClientId() { return clientId; }
    public LocalDate getTicketDate() { return ticketDate; }
    //public int getTicketDay() { return ticketDay; }
    //public int getTicketMonth() { return ticketMonth; }
    //public int getTicketYear() { return ticketYear; }
    public String getIssueDescription() { return issueDescription; }

    // Accessor Method
    public String ShowWorkTicket()
    {
        return null;
    }

    // Mutators
    public void setTicketNumber(int ticketNumber) { this.ticketNumber = ticketNumber; }
    public void setClientId(String clientId) { this.clientId = clientId; }
    public void setTicketDate(LocalDate ticketDate) {this.ticketDate = ticketDate; }
    //public void setTicketDay(int ticketDay) { this.ticketDay = ticketDay; }
    //public void setTicketMonth(int ticketMonth) { this.ticketMonth = ticketMonth; }
    //public void setTicketYear(int ticketYear) { this.ticketYear = ticketYear; }
    public void setIssueDescription(String issueDescription) { this.issueDescription = issueDescription; }

    // Mutator Method
    boolean SetWorkTicket(int number, String id, LocalDate date, String description)
    {
        return true;
    };

    // Default constructor
    public WorkTicket()
    {
        ticketNumber = 0;
        clientId = null;
        ticketDate = null;
        issueDescription = null;
    }

    // Parameterized constructor
    WorkTicket(int number, String id, LocalDate date, String description)
    {
        ticketNumber = number;
        clientId = id;
        ticketDate = date;
        //ticketDay = day;
        //ticketMonth = month;
        //ticketYear = year;
        issueDescription = description;
    }

    // Returns string that shows object's attributes
    String ticketString = Integer.toString(ticketNumber);
    @Override
    public String toString() { return ticketString + " " + clientId + " " + ticketDate + " " +
            issueDescription;};

    // Function that reads integer values
    public int ReadInteger(final int MIN, final int MAX)
    {
        double validNumber = 0.0;

        if(validNumber > (int)validNumber)
        {
            throw new IllegalArgumentException("Invalid Input. Please enter a whole, positive number\n");
        }

        return (int)validNumber;
    }

    // Method to take in date. Accepts string and converts to LocalDate
    //https://stackoverflow.com/questions/42522744/taking-input-using-localdate
    public static LocalDate dateInput(String userInput)
    {
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("mm/dd/yyyy");
        LocalDate ticketDate = LocalDate.parse(userInput, dateFormat);

        System.out.println(ticketDate);
        return ticketDate;
    }

}
