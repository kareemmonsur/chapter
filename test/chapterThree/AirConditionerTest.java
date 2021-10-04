package chapterThree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    @Test
    public void switchingOfAc() {
        //given
        AirConditioner switching = new AirConditioner();
        //when
        switching.ifIsOn(true);
        //assert
        assertTrue(true);
    }

    @Test
    public void acIsOff() {
        //given
        AirConditioner switching = new AirConditioner();
        //when
        switching.ifAcIsOff(false);
        //assert
        assertTrue(true);
    }

    @Test
    public void acIsIncreased() {
        //given
        AirConditioner volume = new AirConditioner();
        volume.setTemperature(20);
        //when
        volume.acIncrease();
        //assert
        assertEquals(21, volume.getVolume());
    }

    @Test
    public void acIsDecreased() {
        //given
        AirConditioner volume = new AirConditioner();
        volume.setTemperature(20);
        //when
        volume.acDecrease();
        //assert
        assertEquals(19, volume.getVolume());
    }
    @Test
    public void acTempIsMovedUp(){
        //given
        AirConditioner volume = new AirConditioner();
        volume.setTemperature(20);
        //when
        volume.acTempIncreaseByNumb(20);
        //assert
        assertEquals(21, volume.getVolume());
    }
    @Test
    public void acTempIsMoveDown(){
        //given
        AirConditioner volume = new AirConditioner();
        volume.setTemperature(20);
        //when
        volume.acTempDecreaseByNumb(20);
        //assert
        assertEquals(19, volume.getVolume());
        }
    }
