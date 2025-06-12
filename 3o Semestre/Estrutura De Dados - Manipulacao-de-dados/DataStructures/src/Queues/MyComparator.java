package Queues;

import java.util.Comparator;

public class MyComparator<T> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
//        if (o1 instanceof String){
//        }
        return ((Comparable<T>)o1).compareTo(o2);
    }
}
