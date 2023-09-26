import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args) {
		String another;	
		Scanner input = new Scanner(System.in);
		Movie movieStats = new Movie();
		
		do
		{
		System.out.println("Enter the name of a movie");
		String title = input.nextLine();
		movieStats.setTitle(title);
		
		System.out.println("Enter the rating of the movie");
		String rating = input.nextLine();
		movieStats.setRating(rating);
		
		System.out.println("Enter the number of tickets sold for this movie");
		int ticketsSold = input.nextInt();
		movieStats.setSoldTickets(ticketsSold);
		
		System.out.println(movieStats.toString());
		
		System.out.println("Do you want to enter another? (y or n)");
		input.nextLine();

		another = input.nextLine();
		}
		while (another.equalsIgnoreCase("y"));
		System.out.println("Goodbye");
		input.close();
	}

}