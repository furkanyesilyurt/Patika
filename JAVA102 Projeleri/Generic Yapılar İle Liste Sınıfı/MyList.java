import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList <T>{

    public int size;
    public int capacity;

    private T[] array;

    public MyList(){
        this.array = (T[]) new Object[10];
    }
    
    public MyList(int capacity){
        this.array = (T[]) new Object[capacity];
    }

    public int size(){
        return size;
    }
    public int getCapacity(){
        return array.length;
    }
    public void add(T data){
        if(size == array.length){
            int newSize = array.length * 2;
            array = Arrays.copyOf(array,newSize);
        }
        array[size++] = data;
    }

    public T get(int index){
        if(index >= size || index < 0){
            return null;
        }
        return (T) array[index];
    }

    public T remove(int index){
        if(index >= size || index < 0){
            return null;
        }
        Object item = array[index];
        int numberElements = array.length - (index +1);
        System.arraycopy(array, index +1, array, index, numberElements);
        size--;
        return (T) item;
    }
    public T set(int index , T data){
        if(index >= size || index < 0){
            return null;
        }
        array[index] = data;
        return (T) array[index];
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            if(array[i]!=null) {
                sb.append(array[i].toString());
            }
            if (i < size - 1) {
                if(array[i]!=null) {
                    sb.append(",");
                }
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public int indexOf(T data){
        for (int i = 0; i < size ; i++) {
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T data){
        for (int i = size-1; i >= 0 ; i--) { //
            if(data == array[i]){
                return i;
            }
        }
        return -1;
    }
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public T[] toArray(){
        Object array2 = Arrays.copyOf(array,size);
        return (T[]) array2;
    }
    public void clear(){
        Arrays.fill(array,null);
    }
    public MyList<T> subList(int start,int finish){
        if (start >= size || start < 0 || finish >= size || finish < 0) {
            System.out.println("Error invalid input !");
            return null;
        }
        MyList<T> subList = new MyList<>(finish - start);
        for (int i = start; i <= finish; i++) {
            subList.add((T) array[i]);
        }
        return subList;
    }
    public boolean contains(T data){
        for (int i = 0; i < size; i++) {
            if(array[i] == data){
                return true;
            }
        }
        return false;
    }
}
