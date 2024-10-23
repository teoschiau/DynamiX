package util;

public interface SimpleCollection
{
    boolean isEmpty();
    int getSize();
    void resize();
    void add(Object o);
    Object get(int i);
    void remove(Object o);
    void remove(int i);

}
