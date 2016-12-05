public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }
  public SuperArray(int capacity){
    data = new String[capacity];
    size = 0;
  }

  public int size(){
    return size;
  }

  public String get(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException();
    }
    return data[index];
  }

  public boolean add(String n){
    if (size >= data.length){
      grow();
    }
    data[size] = n;
    size += 1;
    return true;
  }

  public void clear(){
  size = 0;
  }
  public boolean isEmpty(){
    return size == 0;
  }
  public String set(int index, String value){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundException();
    }
    String i = data[index];
    data[index] = value;
    return i;
  }


  private void grow(){
    String[]temp = new String[data.length * 2];
    for( int i = 0; i < data.length; i++ ){
			temp[i] = data[i];
    }
    data = temp;
  }
  public void add(int index, String element){
    //int[] temp = new int[size + 1];
  //  for (int i = 0; i < index; i++){
      //temp[i] = data[i];
  //  }
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundException();
    }
    for(int i = size + 1; i > index; i--){
      data[i] = data[i - 1];
    }
    data[index] = element;
    size += 1;
  }

  public String remove(int index){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundException();
    }
    String x = data[index];
    String[] temp = new String[size];
    for (int i = 0; i < index; i++) {
      temp[i] = data[i];
    for (int y = size - 1; y >= index; y--){
      temp[y] = data[y + 1];
    }
    }
    data = temp;
    size -= 1;
    return x;
  }
  public int indexOf(String x){
    int count = 0;
    for (int i = 0; i < data.length; i++){
      if (data[i] == x){
        i = data.length;
      }else{
        count++;
      }
    }
    if (count == data.length){
      count = -1;
    }
    return count;
  }

  public int lastIndexOf(String x){
    int count = 0;
    for (int i = size - 1; i > 0; i--){
      if (data[i] == x){
        i = 0;
      }else{
        count++;
      }
    }
    if (count == data.length){
      count = -1;
    }
    return count;
  }


  public String toString(){
    String x = new String("[");
    for (int i = 0; i < size; i++){
      x += data[i] + ",";
    }
    if (x.length() > 1){
      x = x.substring(0, x.length() - 1);
    }
    x += "]";
    return x;
  }

  public String toStringDebug(){
    String x = new String("[");
    for (int i = 0; i < size; i++){
      x += data[i] + " ,";
    }
    for (int y = size; y < data.length; y++){
      x += " _,";
    }
    if (x.length() > 1){
      x = x.substring(0, x.length() - 1);
    }
    x += "]";
    return x;
  }
}
