package Lesson5;

import java.util.ArrayList;
import java.util.List;

public class BookList {

	private List<Book> listBook = new ArrayList<>();
  
	public BookList() {
		listBook.add(new Book(0, "Первая книга", "Первый автор", "Первое издательство", 2019, 100, 200, "Жесткий"));
		listBook.add(new Book(1, "Вторая книга", "Второй автор", "Второе издательство", 2018, 300, 200.50, "Жесткий"));
		listBook.add(new Book(2, "Третья книга", "Третий автор", "Третье издательство", 2017, 150, 350.80, "Мягкий"));
		listBook.add(
				new Book(3, "Четвертая книга", "Третий автор", "Третье издательство", 2015, 500, 350.80, "Мягкий"));
		listBook.add(new Book(4, "Пятая книга", "Первый автор", "Второе издательство", 2015, 150, 50, "Жесткий"));
	}

	public void printBook(int id) {
		System.out.println(listBook.get(id));
	}
	

	public void addBook(int id, String name, String author, String publisher, int year, int pages, double price,
			String typeOfBinding) {
		listBook.add(new Book(id, name, author, publisher, year, pages, price, typeOfBinding));
	}
	

	public void findAuthor(String author) {
		System.out.print("Спсок книг заданного автора " + author + ":");
		for (Book book : listBook) {
			if (author.equals(book.getAuthor())) {
				System.out.println(author);
			}
		}
	}
	

	public void findPublisher(String publisher) {
		for (Book book : listBook) {
			if (publisher.equals(book.getPublisher())) {
				System.out.print("Список книг выпущенных " + publisher + " издательством: ");
				System.out.print(book.getName() + ", ");
			}
		}
		System.out.println();
	}

	
	public void findYear(int year) {
		System.out.print("Спсок книг выпущенных после " + year + " года: ");
		for (Book book : listBook) {
			if (year < book.getYear()) {
				System.out.print(book.getName() + ", ");
			}
		}
	}



}