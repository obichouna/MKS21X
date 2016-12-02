public class CirculatingBook extends LibraryBook{
  private String currentHolder;
  private String dueDate;

  public CirculatingBook(String author, String title, String isbn, String callNumber){
    super(author, title, isbn, callNumber);
    currentHolder = null;
    dueDate = null;
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

  public String getPatron(){
    return currentHolder;
  }

  public String getDate(){
    return dueDate;
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

  public void setPatron(String x){
    currentHolder = x;
  }

  public void setDate(String x){
    dueDate = x;
  }


  public void checkout(String patron, String due){
    currentHolder = patron;
    dueDate = due;
  }
  public void returned(){
    currentHolder = null;
    dueDate = null;
  }
  public String circulationStatus(){
    if (currentHolder == null && dueDate == null){
      return "Book is available.";
    }else{
      return "Current holder: " +currentHolder + " Due Date: " + dueDate;
    }
  }

  public String toString(){
    return getTitle() + ";" + getAuthor() + ";" + getISBN() + ";" + getCallNumber() + ";" +circulationStatus();
  }


}
