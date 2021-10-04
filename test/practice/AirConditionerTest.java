package practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionerTest {
    @Test
    public void acCanTurnOff() {
        //given
        AirConditioner sharp = new AirConditioner();
        //when

        //check
        assertEquals(true, sharp.isOn());

    }

    @Test
    public void acCanTurnOn() {
        //given
        AirConditioner sharp = new AirConditioner();
        //when
        sharp.isOn();
        //check
        assertEquals(true, sharp.isOn());
    }
    @Test
    public void acCanIncrease() {
        //given
        AirConditioner sharp = new AirConditioner();
        //when
        sharp.increaseTemperature();
        //check
        assertEquals(17, sharp.getTemperature());
    }
@Test
    public void acCanDecrease() {
        //given
        AirConditioner sharp = new AirConditioner();
        //when
        sharp.decreaseTemperature();
        //check
        assertEquals(16, sharp.getTemperature());
    }

}
