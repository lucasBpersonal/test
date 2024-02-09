import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    public static String avoidDuplicatesInString(String input) {

        if (input == null || input.isEmpty()) {
            return input;
        }

        return input.chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(LinkedHashSet::new),
                        set -> set.stream()))
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
    }
}
