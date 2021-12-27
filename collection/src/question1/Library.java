package question1;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> bookList = new  ArrayList<Book>();

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	public void addBook(Book bobj) {
		bookList.add(bobj);
	}
	public boolean isEmpty() {
		return bookList.isEmpty();	
	}
	public ArrayList<Book> viewAllBooks(){
		return bookList;
		
	}
	public ArrayList<Book> viewBooksByAuthor(String author ){
		ArrayList<Book> arr=new ArrayList<>();
		int flag=0;
		for(Book book:bookList) {
			if(book.getAuthor().equals(author)) {
				flag++;
			}
		}
		if(flag==0) {
			System.out.println("The list is empty");
		}else 
			return arr;
	
		return null;
		
	}
	public int countnoofbook(String bname) {
		int count=0;
		for(int i=0;i<bookList.size();i++) {
			if(bookList.get(i).getBookName().contentEquals(bname)) {
				count++;
			}
		}
		return count;
		
	}
}
