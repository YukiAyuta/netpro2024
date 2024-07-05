package final_exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class quiz {
    String ans;
    String[] q;
    String[] c;
    List<Integer> targetList = new ArrayList<>(Arrays.asList(0, 1, 2));
    String[] quiz = { "Aは何でしょう？" , "Bはどこでしょう？", "Cは何語でしょう？"};
    String[] correct = { "A", "B", "C" };

    public void setQandCor() {
        Collections.shuffle(targetList);
        for (int i = 0; i < quiz.length; i++) {
            q[i] = quiz[targetList.get(i)];
            c[i] = correct[targetList.get(i)];
        }
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

    // public void setCor(String cor) {
    // this.cor = correct[0];
    // }

    // public void setQuiz(String q) {
    // this.q = quiz[0];
    // }

    // public void matchingAns() {
    // if (ans == cor) {
    // System.out.println("Correct!");
    // } else {
    // System.out.println("Again...");
    // }
    // }

    public String getAns() {
        return ans;
    }

    public String getCor(int n) {
        return c[n];
    }

    public String getQuiz(int n) {
        return q[n];
    }

}
