import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayListTest {

    @Test
    public void arrayListCanBeCreatedTest(){
        List myArrayList = new AnArrayListTest();
        assertNotNull(myArrayList);
    }
    @Test
    public void newArrayListIsEmptyTest() {
        List myArrayList = new AnArrayListTest();
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void addEmptyArrayListShouldNotBeEmptyTest() {
        List myArrayList = new AnArrayListTest();
        myArrayList.add(34);
        assertFalse(myArrayList.isEmpty());

    }
    @Test
    public void addXRemoveX() {
        myArrayList.add(34);
        myArraylist.add(22);
        myArrayList.remove(22);
    }


}
