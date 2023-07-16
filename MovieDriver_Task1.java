/* Class: CMSC203 CRN 40539
 Program: Lab1
 Instructor: Professor Tanveer
 Summary of Description: Lab1
 Due Date: 07/17/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Student’s Name: Michael Lee
*/
import java.util.Scanner;

public class MovieDriver_Task1 {
    public static void main(String[] args) {
        Movie movie = new Movie();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the movie name:");
        String movieName = sc.nextLine();
        movie.setTitle(movieName);

        System.out.println("Enter the movie's rating:");
        String movieRating = sc.nextLine();
        movie.setRating(movieRating);

        System.out.println("Enter the number of tickets sold at unnamed theater:");
        int ticketsSold = sc.nextInt();
        movie.setSoldTickets(ticketsSold);

        System.out.println(movie);
        sc.close();
    }
}