public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;
   private int test;

// constructors
//precondtion: _zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
  public Barcode(String zip) {
    if (zip.length() != 5){
      throw new RuntimeException();
    }else{
      try{
        test = Integer.parseInt(zip);
      }
      catch (NumberFormatException e){
        throw new RuntimeException();
      }
    }
  }
// postcondition: Creates a copy of a bar code.
  public Barcode clone(){}


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){}

//postcondition: format zip + check digit + Barcode
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"
  public String toString(){}


// postcondition: compares the zip + checkdigit, in numerical order.
  public int compareTo(Barcode other){}

}
