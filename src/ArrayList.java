public class ArrayList implements List {
    private boolean isEmpty = true;
    private int elementCounter;
    int size;
    int element;
    int[] elements;

    public ArrayListT(){
        elements = new int[6];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(int element) {
        boolean isFull = getCapacity() == elements.length;
        elements[size++] = element;
        size++;
    }

    private int getCapacity(){
        return elements.length;
    }

    @Override
    public void remove(int element) {
        if(isEmpty()) throw new illegalArgumentException("ArrayList is empty");
        size--;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(int element, int position) {
        elements[position] = element;
    }

    @Override
    public void get(int index) {
        return elements[index];
    }



}