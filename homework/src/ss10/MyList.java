package ss10;

import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }

    private void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements,newSize);
    }

    public void add( E e ) {
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }

    public int size(){
        return size;
    }

    public E get(int i){
        if(i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + " ,Size" + i);
        }
        return (E) elements[i];
    }

    public E set(int index, E newElement){
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Index: " + index + " ,Size:; " + size);
        }
        E oldElement = (E) elements[index];
        elements[index] = newElement;
        return oldElement;
    }

    public E remove(int index) {
        if(index < 0 || index >= size()){
            throw new IndexOutOfBoundsException("Index: " + index + " ,Size: " + size);
        }
        E removeElement = (E) elements[index];
        for (int i = 0; i < size(); i++) {
            set(i,get(i+1));
        }
        size--;
        return removeElement;
    }

    public boolean contains(E o){
        for (Object element : elements)
            if ((o == null && element == null) ||
                    (o != null && o.equals(element))){
                return true;
            }
        return false;
    }

    public int IndexOf(E o){
        for (int i = 0; i < size(); i++) {
            E element = get(i);
            if((o == null && element == null) ||
                o != null && o.equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void clear(){
        size = 0;
    }

    public Object clone(){
        try {
            MyList<E> clonedList = (MyList<E>) super.clone();
            return clonedList;
        } catch (CloneNotSupportedException e){
            throw new InternalError(e);
        }
    }
}
