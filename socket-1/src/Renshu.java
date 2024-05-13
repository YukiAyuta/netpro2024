package src;

class Renshu {

    // xを2倍にして返す関数
    public int doubleValue(int x) {
        return x * 2;
    }

    // ここに続きを実装していく。

    public int sumUpToN(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public int sumFromPtoQ(int p, int q) {
        int sum = 0;
        for (int i = p; i <= q; i++) {
            sum += i;
        }
        if (p > q) {
            return -1;
        } else {
            return sum;
        }
    }

    public int sumFromArrayIndex(int[] a, int index) {
        int sum = 0;
        for (int i = index; i < a.length; i++) {
            sum += a[i];
        }
        if (index < 0 || index >= a.length) {
            return -1;
        } else {
            return sum;
        }
    }

    public int selectMaxValue(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    public int selectMaxIndex(int[] a) {
        int max = a[0];
        int indexmax = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                indexmax = i;
            }
        }
        return indexmax;
    }

    public int selectMinValue(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    public int selectMinIndex(int[] a) {
        int min = a[0];
        int indexmin = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                indexmin = i;
            }
        }
        return indexmin;
    }

    void swapArrayElements(int[] p, int i, int j) {
        int n = 0;
        n = p[i];
        p[i] = p[j];
        p[j] = n;
    }

    boolean swapTwoArrays(int[] a, int[] b) {
        boolean ans = true;
        if (a.length != b.length) {
            ans = false;
        } else {
            int n = 0;
            for (int i = 0; i < a.length; i++) {
                n = a[i];
                a[i] = b[i];
                b[i] = n;
            }
        }
        return ans;
    }
}