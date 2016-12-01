public class ReferenceBook extends LibraryBook{
  private String collection;

  public ReferenceBook(String author, String title, String isbn, String callNumber, String collection){
    super(author, title, isbn, callNumber);
    this.collection = collection;
  }

  public String getTitle(){
    return super.getTitle();
  }

  public String getAuthor(){
    return super.getAuthor();
  }

  public String getISBN(){
    return super.getISBN();
  }

  public String getCallNumber(){
    return super.getCallNumber();
  }

  public String getCollection(){
    return collection;
  }

  public void setAuthor(String x){
    super.setAuthor(x);
  }

  public void setTitle(String x){
    super.setTitle(x);
  }

  public void setISBN(String x){
    super.setISBN(x);
  }

  public void setCallNumber(String x){
    super.setCallNumber(x);
  }

  public void setCollection(String x){
    collection = x;
  }

  public void checkout(String patron, String due){
    System.out.println("Cannot check out a reference book.");
  }
  public void returned(){
    System.out.println("Reference books cannot be checked out - return impossible");
  }
  public String circulationStatus(){
    return "Non-circulating Reference book.";
  }

  public String toString(){
    return getTitle() + ";" + getAuthor() + ";" + getISBN() + ";" + getCallNumber() + ";" + collection +";"+circulationStatus();
  }
}
