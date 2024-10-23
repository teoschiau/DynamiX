package util;

public class DynamicArray implements SimpleCollection {

    private int capacity;
    private int size;
    private Object[] array;

    public DynamicArray() {
        this.capacity = 50;
        this.size = 0;
        array = new Object[capacity];
    }
    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public void resize(){
        capacity *= 2;
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public void add(Object o){
        if(size == capacity){
            resize();
        }
        array[size] = o;
        size++;
    }

    @Override
    public Object get(int index){
        return array[index];
    }

    @Override
    public void remove(int index){
        int i;
        for(i=index;i<size-1;i++){
            array[i] = array[i+1];
        }
        size--;
    }
    @Override
    public void remove(Object o){
        int i, index=0;
        for(i=0;i<size;i++){
            if(array[i].equals(o)){}
                index=i;
        }
        for(i=index;i<size-1;i++){
            array[i] = array[i+1];
        }
        size--;
    }

    public Iterator iterator(){
        return new Iterator() {
            private int index = 0;

            public boolean hasNext(){
                return index < size;
            }
            public Object next(){
                return array[index++];
            }
        };
    }

}
