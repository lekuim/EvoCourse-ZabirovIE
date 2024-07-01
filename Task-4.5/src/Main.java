import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(getArithmeticProgressionSum(10000000, 1000000000));
    }

    private static long getArithmeticProgressionSum(int a, int b) {
        return IntStream.range(a, b).asLongStream().sum();
    }
}