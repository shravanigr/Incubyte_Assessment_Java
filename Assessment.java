import java.util.*;

public class Assessment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string numbers");
        String string = sc.nextLine();
        Calculator obj = new Calculator();
        int result = obj.add(string);
        System.out.println(result);
    }
}

class Calculator {
    public int add(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        int sum = 0;
        String[] numbers = input.split("[,\n]");
        int[] ints = new int[numbers.length];
        for (String num : numbers) {
            sum += Integer.parseInt(num);
        }
        return sum;
    }
}
