package assignment.Day4;

public class Day4 {
    public static void main(String[] args) {
        int count = 1;
        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
