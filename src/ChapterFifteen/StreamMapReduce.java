package ChapterFifteen;

import java.util.stream.IntStream;

public class StreamMapReduce {
    public static void main(String[] args) {
        System.out.printf("sum of even ints from 2 through 20 is: %d%n", IntStream.rangeClosed(1,10)
                .map((int x) -> {return x * 2;}).sum());
    }
}
