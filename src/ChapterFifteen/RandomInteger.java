package ChapterFifteen;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class RandomInteger {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        System.out.println("Random numbers on straight lines:");
        randomNumbers.ints(10, 1, 7).forEach(System.out::println);
        String numbers= randomNumbers.ints(10,1,7)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.printf("%nRandom numbers one line: %s%n", numbers);

    }
}
