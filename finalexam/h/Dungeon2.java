package finalexam.h;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dungeon2 {
    static String stage = """
            ########################################
            #           #                          #
            #        #  ###        #               #
            #        #       #     #               #
            ########################################
            """;

    public static void main(String[] args) throws IOException {
        int playerX = 3;
        int playerY = 2;
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            for (int y = 0; y < stage.split("\n").length; y++) {
                for (int x = 0; x < stage.split("\n")[0].length(); x++) {
                    if (playerX == x && playerY == y) {
                        System.out.print("@");
                    } else {
                        System.out.print(stageCharAt(x, y));
                    }
                }
                System.out.println();
            }
            System.out.println("wasd で移動. qで終了");
            final String inputtedString = reader.readLine();
            // 入力された文字 (inputtedString) に応じて, playerX, playerY の値を増減させたり, 壁との当たり判定をしたり,
            // プログラムを終了させたりする
        }
    }

    /**
     * 指定した座標にあるステージの文字を返す
     */
    static char stageCharAt(final int x, final int y) {
        return stage.split("\n")[y].charAt(x);
    }

    /**
     * 指定した座標に壁があるかどうか
     */
    static boolean isWall(final int x, final int y) {
        return stageCharAt(x, y) == '#';
    }
}