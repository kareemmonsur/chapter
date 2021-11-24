package ChapterFifteen;

import java.util.stream.IntStream;

public class StreamReduce {
    public static void main(String[] args) {
        System.out.println("Sum is: ", IntStream.rangeClosed(1, 10).sum());

    }
}
