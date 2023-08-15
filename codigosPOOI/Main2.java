public class Main2 {
    public static void main(String[] args) {
        int[] v = new int[10];
        for(int i = 0; i < 10; i++) {
            v[i] = i * 100;
        }
        for(int i:v) {
            System.out.printf("%d ", i);
        }
    }
}
