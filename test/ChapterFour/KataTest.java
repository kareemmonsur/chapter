package ChapterFour;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {
    @Test
    public void testFactorialsWork() {
        Kata kata = new Kata();
        assertEquals(120, kata.calculateFactorialOf(6));

    }

    @Test
     public void testTestDrillerFunctions(){
        Kata kata = new Kata();
        int result = kata.calculateCopies(1);
        assertEquals(1500,result);

    }

}