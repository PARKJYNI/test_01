package review.practice;

public class Book {
	String title;
	String author;
	int ISBN;

	public Book(String title, String author, int ISBN) 
	{this.title = title;
	 this.author = author;
	 this.ISBN = ISBN;
	 System.out.println("객체 생성!");
	 
	}

	public Book (String title, int ISBN) {
		this(title, "Anonymous", ISBN); 
	//this()로 Book(String title, String author, int ISBN) 생성자를 호출
	System.out.println("생성자가 호출되었음 1");
	}
	
	
	public Book() {
		this(null, null, 0);//this()로 Book(Stiring title, String author, int ISBN) 생성자를 호출
		
	System.out.println("생성자가 호출되었음 2"); }

	public Book (int ISBN) {
		this("coolman","Anonymous", ISBN); 
	//this()로 Book(String title, String author, int ISBN) 생성자를 호출
	System.out.println("생성자가 호출되었음 1");
	}
	
	
	public static void main(String[] args) {
		Book javaBook = new Book("Java Book", "Author Name", 3333);
		Book theBible = new Book("The Bible", 1);
		Book emptyBook = new Book();
		Book testBook = new Book(40);
		
	System.out.println(javaBook.title);
	System.out.println(javaBook.author);
	System.out.println(javaBook.ISBN);
	System.out.println("-------------");	
	System.out.println(theBible.title);
	System.out.println(theBible.author);
	System.out.println(theBible.ISBN);
	System.out.println("-------------");	
	System.out.println(emptyBook.title);
	System.out.println(emptyBook.author);
	System.out.println(emptyBook.ISBN);
	
	System.out.println("-------------");	
	System.out.println(testBook.title);
	System.out.println(testBook.author);
	System.out.println(testBook.ISBN);
	
	
	
	}

	
	
}
