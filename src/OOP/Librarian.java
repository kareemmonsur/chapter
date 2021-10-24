package OOP;

public class Librarian {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Ade");
        student1.setDepartment("Biology");

        LibraryCard card = new LibraryCard();
        card.setOwner(student1);
        card.checkOut(3);

        System.out.println("Library card info: ");
        System.out.println(card.toString());

    }
}
