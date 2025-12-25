import java.util.*;
import java.util.stream.*;

public class OccurrenceOfElementsInArrayUsingStreamApi {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 2, 3, 3, 3, 4 };

        Map<Integer, Long> countMap = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        n -> n,
                        Collectors.counting()));

        System.out.println(countMap);
    }
}
