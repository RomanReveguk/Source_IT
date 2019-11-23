package HW5;

import Lesson5.BookList;

public class BookRunn {

	public static void main(String[] args) {

		BookList obj =new BookList();
		obj.printBook(0);
		
		obj.findAuthor("Второй автор");
		obj.findPublisher("Первое издательство");
		obj.findYear(2015);
	}
  
}
