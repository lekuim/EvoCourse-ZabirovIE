import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] target = rnd.ints(20, 1, 16).toArray();
        System.out.println(Arrays.toString(target));
        for (int i = 0; i < target.length; ++i) {
            if(target[i] == 0){
                continue;
            }
            int c = 0;
            int t = target[i];
            for(int j = i; j < target.length; ++j){
                if(t == target[j]){
                    c++;
                    target[j] = 0;
                }
            }
            if(c > 1) {
                System.out.printf("Число '%d' встречается %d раза\n", t, c);
            }
        }
    }
}