public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;
   private int zipInt;

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
        zipInt = Integer.parseInt(zip);
      }
      catch (NumberFormatException e){
        throw new RuntimeException();
      }
    }
    _zip = zip;
    int sum = 0;
        while (zipInt > 0) {
            sum = sum + zipInt % 10;
            zipInt = zipInt / 10;
        }
    _checkDigit = sum;
  }

// postcondition: Creates a copy of a bar code.
  public Barcode clone(){}


// postcondition: computes and returns the check sum for _zip
  private int checkSum(){
    return _zip + Integer.toString(_checkDigit);
  }

//postcondition: format zip + check digit + Barcode
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"
  public String toString(){}


// postcondition: compares the zip + checkdigit, in numerical order.
  public int compareTo(Barcode other){}

}
