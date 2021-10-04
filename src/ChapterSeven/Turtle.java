package ChapterSeven;

import static ChapterSeven.Direction.*;


public class Turtle {
    private Pen pen= new Pen();
    private Position currentPosition = new Position(0,0);
    private Direction currentDirection = EAST;
    private PenPosition penPosition;


    public Pen getPen() {
        return pen;
    }

    public void penDown(){
        pen.setPositionTo(PenPosition.DOWN);

    }

    public void penUp() {
        pen.setPositionTo(PenPosition.UP);
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public Direction getCurrentDirection(){

        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == NORTH) changeCurrentDirectionTo(EAST);
       else if(currentDirection == WEST) changeCurrentDirectionTo(NORTH);
      else if(currentDirection == SOUTH) changeCurrentDirectionTo(WEST);
      else if(currentDirection == EAST) changeCurrentDirectionTo(SOUTH);
    }

    public void turnLeft() {
        if (currentDirection == NORTH) changeCurrentDirectionTo(EAST);
       else if(currentDirection == WEST) changeCurrentDirectionTo(NORTH);
       else if(currentDirection == SOUTH) changeCurrentDirectionTo(WEST);
       else if(currentDirection == EAST) changeCurrentDirectionTo(SOUTH);
    }


    private void changeCurrentDirectionTo(Direction newDirection) {
        this.currentDirection = newDirection;
    }

    public void moveForward(int steps) {
        if (currentDirection == EAST) {
            currentDirection.setColumnPosition(currentPosition.getColumnPosition() + steps - 1);
        }
        if (currentDirection == SOUTH) {
            currentDirection.setColumnPosition(currentPosition.getColumnPosition() + steps - 1);
        }
        if (currentDirection == WEST) {
            currentDirection.setColumnPosition(currentPosition.getColumnPosition() + steps - 1);
        }
        if (currentDirection == NORTH) {
            currentDirection.setColumnPosition(currentPosition.getColumnPosition() + steps - 1);
        }
    }

    private void increaseColumnPositionBy(int steps){
    }

    public void writeOn(SketchPad sketchPad, int numberOfSteps){
        if(this.pen.getPosition() == penPosition.DOWN){
            if(this.currentDirection == EAST){
                int[][] floor = sketchPad.getFloor();
                for (int i =0; i<numberOfSteps; i++){
                    floor[currentPosition.getRowPosition()][currentPosition.getColumnPosition() + i] = 1;
                }
            }
    }

     moveForward(numberOfSteps);
    }
}

