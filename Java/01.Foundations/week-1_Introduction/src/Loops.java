public class Loops {
    public static void main(String[] args) {
        int a = 0;
        while (a < 10) {
            System.out.println(a); // Prints the numbers from 0 to 9
            a += 1;
        }

        for (int i = 0; i < 1000000000; i++) {
            System.out.println(i); // Prints the numbers from 0 to 1000000000 -1
        }
    }
}
