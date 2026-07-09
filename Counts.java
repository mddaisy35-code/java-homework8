public class Counts {
    public static void main(String[] args) {

        int number = 987;
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);

    }
}