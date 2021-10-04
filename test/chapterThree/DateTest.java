package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
   @Test
    public void testForMonth(){
        //given
        Date date = new Date(5,7,2021);
        //when
        date.setMonth(7);
        //assert
        assertEquals(7, date.getMonth());
    }
    @Test
    public void testForYear(){
        //given
        Date date = new Date(5,7,2021);
        //when
        date.setYear(2021);
        //assert
        assertEquals(2021, date.getYear());
    }
    @Test
    public void testForDay(){
        //given
        Date date = new Date(5, 7,2021);
        //when
        date.displayDate();
        //assert
        assertEquals(7, date.getDay());
    }

}