import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> intTreatedList = new ArrayList<>();

        for (int number : intList) {
            if (number > 0 && number % 2 == 0) {
                intTreatedList.add(number);
            }
        }
        intTreatedList.sort(Comparator.naturalOrder());

        intTreatedList.iterator().forEachRemaining(System.out::println);
    }
}