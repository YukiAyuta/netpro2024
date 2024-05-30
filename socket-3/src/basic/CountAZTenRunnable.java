package src.basic;

// Runnable インターフェースを実装することで、このクラスのインスタンスはスレッドとして実行可能になります。
public class CountAZTenRunnable implements Runnable {

    // main メソッドはプログラムのエントリーポイントです。
    public static void main(String[] args) {
        // 2つの文字を初期化します。
        char c1 = 97; // ASCII値 97 は 'a' です
        char c2 = (char) (c1 + 1); // c1 に 1 を足すと ASCII値 98 になり、'b' になります

        // 初期化した文字をコンソールに出力します。
        System.out.println(c1); // 出力: a
        System.out.println(c2); // 出力: b

        // CountAZTenRunnable クラスのインスタンスを作成します。
        CountAZTenRunnable ct1 = new CountAZTenRunnable(); // CountTenBクラスのインスタンスとして
        CountAZTenRunnable ct2 = new CountAZTenRunnable(); // CountTenBクラスのインスタンスとして

        ct1.setChar(c1);
        ct2.setChar(c2);

        // ct を実行する新しいスレッドを作成します。
        Thread th1 = new Thread(ct1, "th-1");// th-1はスレッド名
        Thread th2 = new Thread(ct2, "th-2");

        // スレッドを開始します。これにより、CountAZTenRunnable の run メソッドが呼び出されます。
        th1.start();
        th2.start();

        // この try-catch ブロックは、0 から 9 までの値を 500 ミリ秒間隔で出力するループを実行します。
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("main:i=" + i);

                // メインスレッドを 500 ミリ秒間一時停止します。
                Thread.sleep(500); // ミリ秒単位のスリープ時間
            }
        } catch (InterruptedException e) {
            // スレッドが中断された場合は、例外を出力します。
            System.err.println(e);
        }
    }

    // run メソッドは、新しいスレッドが実行するコードを含みます。
    public void run() {
        // この try-catch ブロックは、0 から 9 までの値を 1000 ミリ秒間隔で出力するループを実行します。
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("runnable thread:i=" + i);

                // スレッドを 1000 ミリ秒間一時停止します。
                Thread.sleep(1000); // ミリ秒単位のスリープ時間
            }
        } catch (InterruptedException e) {
            // スレッドが中断された場合は、例外を出力します。
            System.err.println(e);
        }
    }
}
