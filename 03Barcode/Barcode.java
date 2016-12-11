public class Barcode implements Comparable<Barcode>{
// instance variables
   private String _zip;
   private int _checkDigit;
   private int zipInt; // the zip in int form
   private int zipCheck; // the zip in int form with the check digit
   private String fullZip; // String of the zip + checkDigit

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
    _checkDigit = sum % 10;
    zipCheck = zipInt + _checkDigit;
    fullZip = zip + _checkDigit;
  }

// postcondition: computes and returns the check sum for _zip
  private static int checkSum(int zip){
    int sum = 0;
        while (zip > 0) {
            sum = sum + zip % 10;
            zip = zip / 10;
        }
    return sum;
  }

//postcondition: format zip + check digit + Barcode
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"
  public String toString(){
      String barcode = new String("|");
      String[] ary = new String[6];
      for (int i = 0; i < fullZip.length(); i++){
        ary[i] = fullZip.charAt(i) + "";
      }
      for (int x = 0; x < ary.length; x++){
        switch (Integer.parseInt(ary[x])){
          case 0: barcode = barcode + "||:::";
                  break;
          case 1: barcode = barcode + ":::||";
                  break;
          case 2: barcode = barcode + "::|:|";
                  break;
          case 3: barcode = barcode + "::||:";
                  break;
          case 4: barcode = barcode + ":|:|:";
                  break;
          case 5: barcode = barcode + ":||::";
                  break;
          case 6: barcode = barcode + ":||::";
                  break;
          case 7: barcode = barcode + "|:::|";
                  break;
          case 8: barcode = barcode + "|::|:";
                  break;
          case 9: barcode = barcode + "|:|::";
                  break;
        }
      }
      barcode = barcode + "|";
  }


// postcondition: compares the zip + checkdigit, in numerical order.
  public int compareTo(Barcode other){
      return zipCheck.compareTo(other.zipCheck);
  }
}
