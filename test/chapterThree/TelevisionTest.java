package chapterThree;

import org.junit.jupiter.api.Test;
import practice.Lamp;

import static org.junit.jupiter.api.Assertions.*;

class TelevisionTest {
    @Test
    void testIfTelevisionIsOff(){
        //given
        Television tv = new Television(false,"samsung", 28, 10);
        //when
        tv.setOff(true);
        //check
        assertTrue(tv.getIsOn());
    }
    @Test
    void testIfTelevisionIsOn() {
        //given
        Television tv = new Television(true, "samsung", 28, 10);
        //when
        tv.setOff(false);
        //check
        assertFalse(tv.getIsOn());
    }
    @Test
    void testProductName(){
        //given
        Television tv = new Television(true, "samsung", 28, 10);
        tv.setOff(false);
        //when
        tv.setProductName("samsung");
        //check
        assertEquals("samsung",tv.getProductName());
    }
    @Test
    void testChannel(){
       //given
        Television tv = new Television(true, "samsung", 28, 10);
        tv.setOff(false);
        //when
        tv.setChannel(28);
        //check
        assertEquals(28, tv.getChannel());
    }
    @Test
    void testIncreaseChannel(){
        //given
        Television tv = new Television(true, "samsung", 28, 10);
        tv.setOff(false);
        //when
        tv.setIncreaseChannel(28);
        //check
        assertEquals(29, tv.getChannel());
    }
    @Test
    void testDecreaseChannel() {
        //given
        Television tv = new Television(true, "samsung", 28, 10);
        tv.setOff(false);
        //when
        tv.setDecreaseChannel(28);
        //check
        assertEquals(27, tv.getChannel());
    }
    @Test
    void testIncreaseVolume(){
        //given
        Television tv = new Television(true, "samsung", 28, 10);
        tv.setOff(false);
        //when
        tv.setIncreaseVolume(10);
        //check
        assertEquals(11, tv.getIncreaseVolume());
    }
    @Test
    void testDecreaseVolume() {
        //given
        Television tv = new Television(true, "samsung", 28, 10);
        tv.setOff(false);
        //when
        tv.setDecreaseVolume(10);
        //check
        assertEquals(9, tv.getDecreaseVolume());
    }
}