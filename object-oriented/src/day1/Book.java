package day1;
public class Book {
 private int bookId=1;
 private String bookName;
 private String author;
 private double price;
 private static int count=0;
 
 public Book(){
  count++;
  this.bookId=count;
 }
 
 public Book(String bookName,String author,double price){
  this();
  this.bookName=bookName;
  this.author=author;
  this.price=price;
 }

 public void setBookName(String bookName) {
  this.bookName = bookName;
 }

 public void setAuthor(String author) {
  this.author = author;
 }

 public void setPrice(double price) {
  this.price = price;
 }
 public int getId() {
	  return bookId;
	 }

	 public String getBookName() {
	  return bookName;
	 }

	 public String getAuthor() {
	  return author;
	 }

	 public double getPrice() {
	  return price;
	 }

	 public String toString() {
	  return "Bookid=" + bookId + ", bookName=" + bookName + ", author=" + author + ", price=" + price;
	 }
	 
	}