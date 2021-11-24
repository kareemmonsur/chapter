package ChapterFifteen;

import java.util.stream.IntStream;

public class StreamFilterMapReduce {
    public static void main(String[] args) {
        System.out.printf("Sum of triples of the even ints from 2 to 10: %d%n",
                IntStream.rangeClosed(1, 10)
                        .filter(x -> x% 2 == 0)
                        .map(x -> x * 3).sum());
    }
}
