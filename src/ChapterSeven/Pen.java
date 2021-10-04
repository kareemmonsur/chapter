package ChapterSeven;

public class Pen {
    private PenPosition penPosition = PenPosition.UP;

    public PenPosition getPosition(){
        return penPosition;
    }

    public void setPositionTo(PenPosition currentPosition) {
       penPosition = currentPosition;
    }



}
