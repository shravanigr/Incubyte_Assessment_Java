import java.util.*;

public class Assessment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string of comma-separated numbers");
        String string = sc.nextLine();
        Calculator obj = new Calculator();
        int result = obj.add(string);
        System.out.println(result);
    }
}

class Calculator {
    public int add(String input) {
        int sum = 0;
        String[] numbers = input.split(",");
        int[] ints = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            ints[i] = Integer.parseInt(numbers[i]);
            sum = sum + ints[i];
        }
        return sum;
    }
}
