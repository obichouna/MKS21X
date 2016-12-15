public class Sorts{
  public static String name(){
    return "09.Bichouna.Othman";
  }
  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){
    int minimum = 0;
    for (int index = 0; index < data.length - 1; index++){
      int i = index;
      for (int x = index; x < data.length; x++){
	       if (data[i] > data[x]){
           i = x; // trying to get position "i" to be the smaller number
         }
       }
      minimum = data[i];
      data[i] = data[index];
      data[index] = minimum;
    }
  }
   


    public static String toString(int[] data){
	String x = "[";
	for (int i = 0; i < data.length; i++){
	    x += data[i] + ", ";
	}
	x = x.substring(0, x.length() - 2);
	x += "]";
	return x;
    }

    public static void main(String[] args){
	int[] test = {3, 6, 1, 4, 10, 2};
	selectionSort(test);
	System.out.println(toString(test));
    }


}
