public class Book{
  private String author;
  private String title;
  private String isbn;

  public Book(){
    author = "N/A";
    title = "N/A";
    isbn = "N/A";
  }

  public Book(String author, String title, String isbn){
    this.author = author;
    this.title = title;
    this.isbn = isbn;
  }
}
