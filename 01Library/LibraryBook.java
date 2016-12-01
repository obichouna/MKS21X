public abstract class LibraryBook extends Book implements Comparable<LibraryBook>{
    private String callNumber;

    public LibraryBook(String author, String title, String isbn, String callNumber){
      super(author, title, isbn);
      this.callNumber = callNumber;
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

    public String getCallNumber(){
      return callNumber;
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

    public void setCallNumber(String x){
      callNumber = x;
    }

    abstract void checkout(String patron, String due);
    abstract void returned();
    abstract String circulationStatus();

    public int compareTo(String x, String y){
      if (Integer.parseInt(x) > Integer.parseInt(y)){
        return 1;
      }else if(Integer.parseInt(x) < Integer.parseInt(y)){
        return -1;
      }else{
        return 0;
      }
    }

    public String toString(){
      return title + ";" + author + ";" + isbn + ";" + callNumber + ";" +circulationStatus();
    }


}
