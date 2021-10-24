package chapterThree;

public class Student {
    public static void main(String[] args) {
        LibraryCard student1 = new LibraryCard();
        student1.checkOut(2);
        student1.setOwner("Ade");
        System.out.println(student1.toString());
    }
}
