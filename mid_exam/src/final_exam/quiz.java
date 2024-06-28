package final_exam;

public class quiz {
    String ans;
    String cor;
    String[] correct = { "A" };
    String[] quiz = { "Aは何でしょう？" };

    public void qanda() {
        int n = (int) Math.random();
        System.out.println(quiz[n]);
        cor = correct[n];
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    public void matchingAns() {
        if (ans == cor) {
            System.out.println("Correct!");
        } else {
            System.out.println("Again...");
        }
    }

    public String getAns() {
        return ans;
    }

    public String getCor() {
        return cor;
    }

}
