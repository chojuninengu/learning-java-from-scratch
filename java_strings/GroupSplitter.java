
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupSplitter {

    public static List<String> splitIntoGroups(String input, int n) {
        if (input == null || n <= 0) {
            return new ArrayList<>();
        }

        String[] groups = input.split("(?<=\\G.{" + n + "})");
        return Arrays.asList(groups);
    }

    public static void main(String[] args) {
        System.out.println(splitIntoGroups("abcdefghij", 3)); // [abc, def, ghi, j]
        System.out.println(splitIntoGroups("1234567890", 2)); // [12, 34, 56, 78, 90]
    }
}
