/**
 * @Authors: Gabriel Dietrich (100764733) and Fleur Blanckaert (100747083
 * @Date: Nov 21, 2020
 * @Program: OOP3200 - Java Lab 2
 * @Description: This application creates a class called WorkTicket, which represents the client's
 * 				request for IT support.	The class is copied into anew constructor. Later on, the
 * 				application demonstrates the usability of the operators "==", "=", ">>", and "<<".
 */

package ca.durhamcollege;

public class WorkTicket
{
    // Private instance variables
    int ticketNumber;
    String clientId;
    int ticketDay;
    int ticketMonth;
    int ticketYear;
    String issueDescription;

    // Public properties


    // Accessors
    public int getTicketNumber() { return ticketNumber;  }
    public String getClientId() { return clientId; }
    public int getTicketDay() { return ticketDay; }
    public int getTicketMonth() { return ticketMonth; }
    public int getTicketYear() { return ticketYear; }
    public String getIssueDescription() { return issueDescription; }

    // Accessor Method
    //public String ShowWorkTicket();

    // Mutators
    public void setTicketNumber(int ticketNumber) { this.ticketNumber = ticketNumber; }
    public void setClientId(String clientId) { this.clientId = clientId; }
    public void setTicketDay(int ticketDay) { this.ticketDay = ticketDay; }
    public void setTicketMonth(int ticketMonth) { this.ticketMonth = ticketMonth; }
    public void setTicketYear(int ticketYear) { this.ticketYear = ticketYear; }
    public void setIssueDescription(String issueDescription) { this.issueDescription = issueDescription; }

    // Mutator Method
    //boolean SetWorkTicket(int number, String id, int day, int month, int year, String description);

    // Default constructor
    //WorkTicket() {ticketNumber(0), clientId(""), ticketDay(1), ticketMonth(1), ticketYear(2000), issueDescription("")};

    // Parameterized constructor
    WorkTicket(int number, String id, int day, int month, int year, String description)
    {
        ticketNumber = number;
        clientId = id;
        ticketDay = day;
        ticketMonth = month;
        ticketYear = year;
        issueDescription = description;
    }


}
