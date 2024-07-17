package finalexam.j;

public class SumCalculator implements Runnable {
    private int threadNumber;

    public SumCalculator(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < 50; i++) {
            sum += i;
        }
        System.out.println("スレッド " + threadNumber + " の計算結果: " + sum);
    }

    public static void main(String[] args) {
        Thread[] threads = new Thread[10];

        System.out.println("すべてのスレッドが終了しました。");
    }
}
