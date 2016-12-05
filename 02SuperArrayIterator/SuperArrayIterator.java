import java.util.*
public class SuperArrayIterator implements Iterator<String> {
    private SuperArray array;
    private int startingPoint;


    public SuperArrayIterator(SuperArray array){
	this.array = array;
	startingPoint = 0;

    }


}
