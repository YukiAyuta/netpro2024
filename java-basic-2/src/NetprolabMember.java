import java.util.Random;

public class NetprolabMember {
  public static final int years = 15;
  public static final int columns = 3;

  public static void main(String[] args) {
    int[][] members = new int[years][columns];
    Random random = new Random();
    double totalRatio = 1;
    for (int i = 0; i < years; i++) {
      //学生の総数
      members[i][0] = 120 + (random.nextInt(20) - 10);
      //女性の割合(%)
      members[i][1] = i + 20;
      //岩井研の人数
      members[i][2] = 10 + 6 * random.nextInt() - 3;

      // 男性数を求める
      int men = members[i][0] - (int) (members[i][0] * ((float) members[i][1] / 100));
      // 総数から岩井研の人数を取り出す組み合わせ
      long cpsRatio = combination(members[i][0], members[i][2]);
      // 男性の中から岩井研のメンバーを取り出す組み合わせ
      long menRatio = combination(men, members[i][2]);
      // 岩井研の人数に男性しか入らない割合
      totalRatio *= (double) menRatio / cpsRatio;
    }
    System.out.println(totalRatio);
  }

  // Combination　未実装
  public static final long combination(final int n, int r) {
    return 0;
  }
}
