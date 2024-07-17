package finalexam.f;

public class ThreadSort {

    public static void main(String[] args) {
				// int の配列を与える
        sortPrint(new int[]{3, 1, 4, 15, 9, 21});
    }

    public static void sortPrint(int[] arr) {
        ItemTh[] items = new ItemTh[arr.length];

        for (int i = 0; i < items.length; i++) {
            arr[i] = items[i];
            items[i] = 0;
        }
        for (int i = 0; i < items.length; i++) {
            items[i] = arr[i];
        }
    }

    static class ItemTh implements Runnable {
        int n;

        ItemTh(int n) {
            // TODO:
        }

        public void run() {
            // TODO: sleep の時間は n * 100ms とする
            System.out.println(n);
        }
    }
}