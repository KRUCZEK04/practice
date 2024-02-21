import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyArrayList implements List {
    private Object[] array;
    private int size;
    public MyArrayList(){
    this.array =new Object[4] ;
    this.size = 0;
    }
    @Override
    public int size() {
    return size;
    }

    @Override
    public boolean isEmpty() {
        for (int i = 0; i < array.length; i++) {
            if (array[i]!=null){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++) {
           if (array[i] == o){
               return true;
           }

        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        if (size == array.length){
            Object[] newArray = new Object[array.length*2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array=newArray;
        }
        array[size] = o;
        size++;

         return true;

    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o) {
                array[i] = null;
                for (int j = i; j < size-1 ; j++) {
                array[j] = array[j+1];
                }
                array[--size] = null;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i]= null;

        }
        size = 0;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object set(int index, Object element) {
        Object replacedObject = array[index];
        array[index] = element;
        return replacedObject;
    }

    @Override
    public void add(int index, Object element) {
        size++;
        for (int i = index; i < size-1; i++) {
            array[i+1] = array[i];
        }
        array[index] = element;
    }

    @Override
    public Object remove(int index) {
        Object removedObject = array[index];
        array[index] = null;
        for (int i = index; i < size-1 ; i++) {
            array[i] = array[i + 1];
        }
        array[size-1] = null;
        size--;
        return removedObject;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (o == array[i]){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = array.length; i >= 0 ; i--) {
            if (o == array[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
