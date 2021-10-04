package chapterTen;

public class Forest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Frog();
        animals[1] = new Fish();
        animals[2] = new Bird();
        animals[3] = new Frog();
        animals[4] = new Frog();

        for (Animal animal : animals){
            animal.move();
        }

    }
}
