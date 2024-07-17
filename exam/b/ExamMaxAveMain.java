package finalexam.b;

public class ExamMaxAveMain {
    public static void main(String[] args) {
    }

    ExamScores examScores = new ExamScores();for(
    int i = 0;i<=3000;i++)
    {
        examScores.setExamId(i);
        examScores.setMathScore((int) Math.random() * 100);
        examScores.setEngScore((int) Math.random() * 100);
        examScores.setPhysicsScore((int) Math.random() * 100);

        System.out.println(examScores.getExamId()+"の平均点は"+examScores.getAverageScore()+"であり、数学の点数は" + examScores.getMathScore() + "であるので、");
        if(examScores.isPass()){
        System.out.println("合格です。");
    }else{
        System.out.println("不合格です。");
    }
}
}
