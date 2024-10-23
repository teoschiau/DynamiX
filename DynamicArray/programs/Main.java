package programs;

import util.DAIterator;
import util.DynamicArray;
import util.Iterator;
import util.SimpleCollection;



public class Main {
    public static void main(String[] args) {
        SimpleCollection array = new DynamicArray();
        DAIterator it = new DAIterator();


        if(args.length == 0) {
            System.out.println("Provide arguments!");
        }else{
            int i;
            for(i=0;i< args.length;i++){
                array.add(args[i]);
            }

            while(it.hasNext(array.getSize())){
                System.out.println(it.next(array));
            }
            while(!array.isEmpty()){
                System.out.println(array.get(0));
                array.remove(0);
            }

        }

    }
}