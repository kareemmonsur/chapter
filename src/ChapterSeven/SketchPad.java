package ChapterSeven;

public class SketchPad {
    int[][] floor;
    public SketchPad (int floorRow, int floorColumn) {
        floor = new int[floorRow][floorColumn];
    }

    public int[][] getFloor() {
        return floor;
    }
}
