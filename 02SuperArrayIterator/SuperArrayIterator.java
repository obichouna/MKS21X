import java.util.*
public class SuperArrayIterator implements Iterator<String> {
    private SuperArray array;
    private int startingPoint;


    public SuperArrayIterator(SuperArray array){
	this.array = array;
	startingPoint = 0;

    }

    public boolean hasNext(){
	return startingPoint < array.size();


    }

    public String next(){
	if (!hasNext()){
	    throw new NoSuchElementException();
	}
	else{
	    startingPoint++;
	    return array.get(startingPoint + 1);
	}

    }

    public void remove(){
	throw new UnsupportedOperationException();
    }

}
