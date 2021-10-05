public class AnArrayListTest implements List {
    private boolean isEmpty = true;
    private int elementCounter;

    @Override
    public boolean isEmpty() {
        return elementCounter == 0;
    }

    @Override
    public void add(int element) {
        elementCounter++;

    }

    @Override
    public void remove(int element) {
        elementCounter--;

    }
}
