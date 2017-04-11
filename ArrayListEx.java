import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx 
{
	public static void main(String[] aa)
	{
		ArrayList <Book> bookDetails = new ArrayList <Book> ();
		
		Book b1 = new Book (1,"Core Java", "Tony", "Tata",5);
		Book b2 = new Book (2,"Advanced Java", "John","Bata",5);
		Book b3 = new Book (3,"HTML", "Johnny", "William",5);
		Book b4 = new Book (4,"Visual Basic", "Jack","Philips",5);
		Book b5 = new Book (5,"Hadoop", "Jack","Alex",5);
		Book b6 = new Book (6,"Internet Programming", "Jack","William",5);
		
		bookDetails.add(b1);
		bookDetails.add(b2);
		bookDetails.add(b3);
		bookDetails.add(b4);
		bookDetails.add(b5);
		bookDetails.add(b6);
		
		for (Book b:bookDetails)
		{
		System.out.println("------------------------------");
		System.out.println("Id Is "+b.id);
		System.out.println("Book Name Is "+b.BookName);
		System.out.println("Book Author Is "+b.BookAuthor);
		System.out.println("Book Publisher Is "+b.BookPublisher);
		System.out.println("Quantity Is "+b.qty);
		System.out.println("-------------------------------");
		}
	
	    bookDetails.remove(b6);
		Iterator itr = bookDetails.iterator();
		while (itr.hasNext())
		{
			System.out.println("Book Is "+itr);
		}
	}


		class Book
		{
			int id,qty;
			String BookName, BookAuthor, BookPublisher;
			public Book (int id, String Name, String Author, String Publisher, int qty)
			{
				this.id = id;
				this.BookName = Name;
				this.BookAuthor = Author;
				this.BookPublisher = Publisher;
				this.qty = qty;
				
			}
		}
}


