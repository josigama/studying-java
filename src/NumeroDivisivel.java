
public class NumeroDivisivel {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 100; i++) {
            if (i > 50 && i < 60 ) {
                continue;
            }
            System.out.println(i);
        }
    }
}
