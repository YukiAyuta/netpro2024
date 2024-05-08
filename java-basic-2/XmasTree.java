public class XmasTree {
    public static void main(String[] args) {
        // int X = Integer.parseInt(args[0]);
        // int Y = Integer.parseInt(args[1]);

        int N = 15;
        for (int j = 0; j < N; j++) {

            for (int i = 0; i <= N - j; i++) {
                System.out.print("`");
            }

            for (int i = 0; i <= j * 2; i++) {
                System.out.print("*");
            }

            for (int i = 0; i <= N - j; i++) {
                System.out.print("`");
            }

            System.out.print("\n");
        }

        for (int j = 0; j < 7; j++) {
            for (int i = 0; i < N; i++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }

    }
}
// https://docs.oracle.com/javase/jp/8/docs/api/java/lang/Integer.html