package OOP;

public class LibraryCard {
        private Student owner;
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
            return owner.getName();
        }

        public void setOwner(Student owner) {
            this.owner = owner;
        }

        @Override
        public String toString() {
            return "owner name: " + owner + "\n" + "Borrow count: " + borrowCount;
        }
}
