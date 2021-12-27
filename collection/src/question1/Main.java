package question1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	Library l=new Library();
	int choice=0;
	while(choice!=5) {
		System.out.println("1.Add Book");
		System.out.println("2.Display all book details"); 
		   System.out.println("3.Search Book by author "); 
		   System.out.println("4.Count number of books - by book name"); 
		   System.out.println("5.Exit"); 
		   System.out.println("Enter your choice:");
		   choice=sc.nextInt();
		   if(choice==1) {
			   Book b1=new Book();
			   System.out.println();
		   }
		}
	}
}
