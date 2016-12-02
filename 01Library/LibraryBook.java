public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;

    public LibraryBook(String author, String title, String isbn, String callNumber){
      super(author, title, isbn);
      this.callNumber = callNumber;
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
      return callNumber;
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
      callNumber = x;
    }

    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();

    public int compareTo(LibraryBook x){
      return getCallNumber().compareTo(x.getCallNumber());
    }

    public String toString(){
      return super.getTitle() + ";" + super.getAuthor() + ";" + super.getISBN() + ";" + callNumber + ";" +circulationStatus();
    }


}
