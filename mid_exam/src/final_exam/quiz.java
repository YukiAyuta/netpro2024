package final_exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class quiz {
    private static List<Integer> targetList = new ArrayList<>(Arrays.asList(0, 1, 2));
    private static String[] quiz = { "Aは何でしょう？", "Bはどこでしょう？", "Cは何語でしょう？" };
    private static String[] correct = { "A", "B", "C" };
    private static int quizIdx = 0;

    public static void setQandCor() {
        Collections.shuffle(targetList);
    }

    public static void moveToNextQuiz() {
        quizIdx++;
    }

    public static String getCor() {
        return correct[targetList.get(quizIdx)];
    }

    public static String getQuiz() {
        return quiz[targetList.get(quizIdx)];
    }

}
