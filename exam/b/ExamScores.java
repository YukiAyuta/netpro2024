package finalexam.b;

public class ExamScores {
    public static void main(String[] args) {
    }

    private int examId;
    private int mathScore;
    private int engScore;
    private int physicsScore;

    public void setExamId(int examId) {
        this.examId = examId;
    }

    public int getExamId() {
        return examId;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setEngScore(int engScore) {
        this.engScore = engScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public void setPhysicsScore(int physicsScore) {
        this.physicsScore = physicsScore;
    }

    public int getPhysicsScore() {
        return physicsScore;
    }

    public float getAverageScore() {
        return (getMathScore() + getEngScore() + getPhysicsScore()) / 3;
    }

    public boolean isPass() {
        return (getAverageScore() >= 85) || getMathScore() == 100;
    }
}
