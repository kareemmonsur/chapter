public class ArrayList implements List {
    private boolean isEmpty = true;
    private int elementCounter;
    int size;
    int element;
    int[] elements;

    public ArrayList(){
        elements = new int[3];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(int element) {
        boolean isFull = getCapacity() == size;
        if (isFull){
            int[] newArray = new int[elements.length * 2];
            for (int i = 0; i < elements.length; i++){
                newArray[i] = elements[i];
            }
        }
        elements[size++] = element;
        size++;
    }

    private int getCapacity(){
        return elements.length;
    }

    @Override
    public void remove(int element) {
        if(isEmpty()) throw new illegalArgumentException("ArrayList is empty");
        int position = getIndexOf(element);
        for(int i = position; i>size; i++){
            try{
                elements[i] = elements;
            }
        }

        size--;

    }

    private int getIndexOf(int element) {
        return 0;
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
    public void remove(int element){
        if(isEmpty() )
    }

    @Override
    public int get(int index) {
        return elements[index];
    }



}