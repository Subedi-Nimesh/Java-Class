package assignment.Day3;

public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers between 1 - 100 are: \n");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
