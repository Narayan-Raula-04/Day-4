import java.util.Arrays;

public class RemoveDuplicateNamesfromArrayUsingLamdaExpression {
    public static void main(String[] args) {

        String[] names = { "ram", "shyam", "ram", "mohan", "shyam" };

        String[] uniqueNames = Arrays.stream(names)
                .distinct()
                .toArray(String[]::new);

        System.out.println(Arrays.toString(uniqueNames));
    }
}
