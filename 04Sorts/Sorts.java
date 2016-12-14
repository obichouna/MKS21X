public class Sorts{
  public static String name(){
    return "09.Bichouna.Othman";
  }
  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int[] data){
    int minimum;
    for (int index = 0; index < data.length - 1, index++){
      int i = index;
      for (int = x + index; x < data.length, x++){
	       if (data[i] > data[x]){
           i = x; // trying to get position "i" to be the smaller number
         }
       }
      minimum = data[i];
      data[i] = data[index];
      data[index] = minimum;
    }
}
