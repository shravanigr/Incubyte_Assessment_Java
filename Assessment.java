import java.util.*;
import java.util.regex.Pattern;

public class Assessment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string numbers");
        String input = sc.nextLine();
        Calculator obj = new Calculator();
        try {
            System.out.println(obj.add(input));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Calculator {
    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        String delimiter = "[,\n]";
        if (input.startsWith("//")) {
            int delimiterEndIndex = input.indexOf("\n");
            delimiter = Pattern.quote(input.substring(2, delimiterEndIndex));
            input = input.substring(delimiterEndIndex + 1);
        }
        String[] numbers = input.split(delimiter);
        List<Integer> negatives = new ArrayList<>();
        int sum = 0;

        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num < 0) {
                negatives.add(num);
            } else {
                sum += num;
            }
        }
        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negative numbers not allowed: " + negatives);
        }

        return sum;
    }
}
