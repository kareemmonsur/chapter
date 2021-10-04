import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    public void checkBikeIsTurnOff() {
        //given
        Bike remote = new Bike(false, 10, 1);
        //when
        remote.turnOn(false);
        //assert
        assertFalse(remote.getIsOn());
    }

    @Test
    public void checkBikeIsTurnOn() {
        //given
        Bike remote = new Bike(true, 10, 1);
        //when
        remote.turnOn(true);
        //assert
        assertTrue(remote.getIsOn());
    }

    @Test
    public void checkBikeCanAccelerateAtGearOne() {
        //given
        Bike remote = new Bike(true, 15, 1);
        remote.turnOn(true);
        //when
        remote.setSpeed(15);
        remote.accelerateIncrease(1);
        //assert
        assertEquals(16, remote.getSpeed());
    }

    @Test
    public void checkBikeCanAccelerateAtGearTwo() {
        //given
        Bike remote = new Bike(true, 24, 2);
        remote.turnOn(true);
        //when
        remote.setSpeed(24);
        remote.accelerateIncrease(2);
        //assert
        assertEquals(26, remote.getSpeed());
    }

    @Test
    public void checkBikeCanAccelerateAtGearThree() {
        //given
        Bike remote = new Bike(true, 35, 3);
        remote.turnOn(true);
        //when
        remote.setSpeed(35);
        remote.accelerateIncrease(3);
        //assert
        assertEquals(38, remote.getSpeed());
    }

    @Test
    public void checkBikeCanAccelerateAtGearFour() {
        //given
        Bike remote = new Bike(true, 44, 4);
        remote.turnOn(true);
        //when
        remote.setSpeed(44);
        remote.accelerateIncrease(4);
        //assert
        assertEquals(48, remote.getSpeed());
    }

    @Test
    public void checkBikeCanDecelerateAtGearOne() {
        //given
        Bike remote = new Bike(true, 15, 1);
        remote.turnOn(true);
        //when
        remote.setSpeed(15);
        remote.accelerateDecrease(1);
        //assert
        assertEquals(14, remote.getSpeed());
    }

    @Test
    public void checkBikeCanDecelerateAtGearTwo() {
        //given
        Bike remote = new Bike(true, 24, 2);
        remote.turnOn(true);
        //when
        remote.setSpeed(24);
        remote.accelerateDecrease(2);
        //assert
        assertEquals(22, remote.getSpeed());
    }

    @Test
    public void checkBikeCanDecelerateAtGearThree() {
        //given
        Bike remote = new Bike(true, 35, 3);
        remote.turnOn(true);
        //when
        remote.setSpeed(35);
        remote.accelerateDecrease(3);
        //assert
        assertEquals(32, remote.getSpeed());
    }

    @Test
    public void checkBikeCanDecelerateAtGearFour() {
        //given
        Bike remote = new Bike(true, 44, 4);
        remote.turnOn(true);
        //when
        remote.setSpeed(44);
        remote.accelerateDecrease(4);
        //assert
        assertEquals(40, remote.getSpeed());
    }
}
   