package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicPlayerTest {
    @Test
    void testIfMusicPlayerIsOff(){
        //given
        MusicPlayer mp = new MusicPlayer(false,"samsung", 28, 10);
        //when
        mp.setOff(true);
        //check
        assertTrue(mp.getIsOn());
    }
    @Test
    void testIfMusicPlayerIsOn() {
        //given
        MusicPlayer mp = new MusicPlayer(true, "samsung", 28, 10);
        //when
        mp.setOff(false);
        //check
        assertFalse(mp.getIsOn());
    }
    @Test
    void testProductName(){
        //given
        MusicPlayer mp = new MusicPlayer(true, "samsung", 28, 10);
        mp.setOff(false);
        //when
        mp.setProductName("samsung");
        //check
        assertEquals("samsung",mp.getProductName());
    }
    @Test
    void testChannel(){
        //given
        MusicPlayer mp = new MusicPlayer(true, "samsung", 28, 10);
        mp.setOff(false);
        //when
        mp.setChannel(28);
        //check
        assertEquals(28, mp.getChannel());
    }
    @Test
    void testIncreaseChannel(){
        //given
        MusicPlayer mp = new MusicPlayer(true, "samsung", 28, 10);
        mp.setOff(false);
        //when
        mp.setIncreaseChannel(28);
        //check
        assertEquals(29, mp.getChannel());
    }
    @Test
    void testDecreaseChannel() {
        //given
        MusicPlayer mp = new MusicPlayer(true, "samsung", 28, 10);
        mp.setOff(false);
        //when
        mp.setDecreaseChannel(28);
        //check
        assertEquals(27,mp.getChannel());
    }
    @Test
    void testIncreaseVolume(){
        //given
        MusicPlayer mp = new MusicPlayer(true, "samsung", 28, 10);
        mp.setOff(false);
        //when
        mp.setIncreaseVolume(10);
        //check
        assertEquals(11, mp.getIncreaseVolume());
    }
    @Test
    void testDecreaseVolume() {
        //given
        MusicPlayer mp = new MusicPlayer(true, "samsung", 28, 10);
        mp.setOff(false);
        //when
        mp.setDecreaseVolume(10);
        //check
        assertEquals(9, mp.getDecreaseVolume());
    }
}
