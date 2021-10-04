package ChapterSeven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import static ChapterSeven.Direction.*;
import static ChapterSeven.Pen.*;
import static ChapterSeven.PenPosition.*;
import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    Turtle ijapa = new Turtle();
    Pen pen = ijapa.getPen();

    @BeforeEach
    public void startThisBeforeAll(){
        Turtle ijapa = new Turtle();
        Pen pen = ijapa.getPen();
    }

    @Test
    public void testThatTurtleHasAPen() {
        //assert
        assertNotNull(pen);
    }

    @Test
    public void testThatPenIsUpByDefault() {
        //assert
        assertSame(UP, pen.getPosition());
    }

    @Test
    public void testThatPenCanMoveDown() {
        //given
        assertSame(UP, pen.getPosition());
        //when
        ijapa.penDown();
        //assert
        assertSame(DOWN, ijapa.getPen().getPosition());
    }

    @Test
    public void testThatTurtleCanMovePenUp(){
        //given
        ijapa.penDown();
        assertSame(DOWN, ijapa.getPen().getPosition());
        //when
        ijapa.penUp();
        //assert
        assertSame(UP, ijapa.getPen().getPosition());
    }

    @Test
    @DisplayName("Turtle can turn right while facing east")
    public void testThatTurtleCanTurnRight(){
        //given
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        //assert
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

     @Test
     @DisplayName("Turtle can turn right while facing south")
     public void testThatTurtleCanTurnRight2() {
         //given
         ijapa.turnRight();
         assertSame(SOUTH, ijapa.getCurrentDirection());
         //when
         ijapa.turnRight();
         ijapa.turnRight();
         //assert
         assertSame(WEST, ijapa.getCurrentDirection());
     }
    @Test
    @DisplayName("Turtle can turn right while facing west")
    public void testThatTurtleCanTurnRight3() {
        //given
        ijapa.turnRight();
        ijapa.turnRight();
        //assert
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }
    @Test
    @DisplayName("Turtle can turn right while facing west")
    public void testThatTurtleCanTurnRight4() {
        //given
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        //assert
        assertSame(EAST, ijapa.getCurrentDirection());
    }
    // TODO  turtle can turn left
    @Test
    @DisplayName("Turtle can turn right while facing east")
    public void testThatTurtleCanTurnLeft1(){
        //given
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.turnLeft();
        //assert
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn right while facing south")
    public void testThatTurtleCanTurnLeft2() {
        //given
        ijapa.turnLeft();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        //when
        ijapa.turnLeft();
        //assert
        assertSame(WEST, ijapa.getCurrentDirection());
    }
    @Test
    @DisplayName("Turtle can turn right while facing west")
    public void testThatTurtleCanTurnLeft3() {
        //given
        ijapa.turnLeft();
        ijapa.turnLeft();
        //when
        ijapa.turnLeft();
        //assert
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }
    @Test
    @DisplayName("Turtle can turn right while facing west")
    public void testThatTurtleCanTurnLeft4() {
        //given
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        //when
        ijapa.turnLeft();
        //assert
        assertSame(EAST, ijapa.getCurrentDirection());
    }
    //
    @Test
    public void testThatTurtleCanMoveForwardWhileFacingEast() {
        //given
        assertSame(EAST, ijapa.getCurrentDirection());
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
        //when
        ijapa.moveForward(5);
        //assert

     }


}