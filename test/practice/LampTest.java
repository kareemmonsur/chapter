package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LampTest {
    @Test
    public void testThatLampIsOff() {
        //given
        Lamp lg = new Lamp();
        //when
        lg.setOff(true);
        //check
        assertTrue(lg.getIsOn());
    }

    @Test
    public void testThatLampIsOn() {
        //given
        Lamp lg = new Lamp();
        //when
        lg.setOff(false);
        //check
        assertFalse(lg.getIsOn());

    }

    @Test
    public void testLampCanIncreaseVol() {
        //given
        Lamp lg = new Lamp();
        //when
        lg.setIncreaseVol(50);
        //check
        assertEquals(60, lg.getBrightness());

    }

    @Test
    public void testLampCanDecreaseVol() {
        //given
        Lamp lg = new Lamp();
        //when
        lg.setDecreaseVol(50);
        //check
        assertEquals(40, lg.getBrightness());
    }

    @Test
    public void brightnessCannotIncreaseAbove100(){
        // given
        Lamp lg = new Lamp();
        //when
        lg.setIncreaseVol(90);
        // check
        assertEquals(100, lg.getBrightness());
    }

    @Test
    public void brightnessCannotIncreasebelow10(){
        // given
        Lamp lg = new Lamp();
        //when
        lg.setDecreaseVol(0);
        // check
        assertEquals(0, lg.getBrightness());
    }

}


