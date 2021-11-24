package ChapterFifteen;

import java.util.stream.IntStream;

public class StreamMapReduce {
    public static void main(String[] args) {
        System.out.printf("sum of even int is: %d%n", IntStream.rangeClosed(1,10).map((int x)) -> {return x * 2;}).sum());
    }
}
