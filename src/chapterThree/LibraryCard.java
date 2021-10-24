package chapterThree;

public class LibraryCard {
    private String owner;
    private int borrowCount = 0;

    public LibraryCard() {
    }

    public void checkOut(int numberOfBooks) {
        borrowCount = borrowCount + numberOfBooks;
    }

    public int GetBorrowCount() {
        return borrowCount;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "LibraryCard{" +
                "owner='" + owner + '\'' +
                ", borrowCount=" + borrowCount +
                '}';
    }
}
