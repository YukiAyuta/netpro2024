package finalexam.a;

public class PrimeTwinMain {
    public static void main(String[] args) {
    }for(

    int i = 3;i<=40000;i++)
    {
        int sum = 0;
        for (int j = 1; j <= i; j++) {
            if (i % j == 0) {
                sum += 1;
            }
        }
        if (sum == 2) {
            System.out.println(i);
        }
    }
}
