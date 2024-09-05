import java.util.*;  
public class Assessment {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string of comma-separated numbers");
        String str= sc.nextLine(); 
        int sum = 0;
        String[] numbers = str.split(",");
        int[] ints = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            ints[i] = Integer.parseInt(numbers[i]);
            // System.out.println(ints[i]);
            sum = sum + ints[i];
        }
        System.out.println(sum);
    }
}
