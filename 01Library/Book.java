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

    public String getTitle(){
	return title;
    }

    public String getAuthor(){
	return author;
    }

    public String getISBN(){
	return isbn;
    }

    public void setAuthor(String x){
	author = x; 
    }
    
    public void setTitle(String x){
	title = x;
    }
    
    public void setISBN(String x){
	isbn = x;
    }

    public String toString(){
	return "" + title + ";" + author + ";" + isbn;
    }
 }
