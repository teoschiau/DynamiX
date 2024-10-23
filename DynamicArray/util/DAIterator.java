package util;

public class DAIterator{

    private int index = 0;
    public boolean hasNext(int size){
        return index< size;
    }
    public Object next(SimpleCollection array){
        return array.get(index++);
    }
}
