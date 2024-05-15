package src;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TanabataServer {

    private static final int times = 3;

    private static String serverProcess(String content) {
        StringBuilder sb = new StringBuilder();
        sb.append("☆ミ ");
        for (int i = 0; i < times; i++) {
            sb.append(content);
        }
        sb.append("☆ミ");
        String result = sb.toString();
        return result;
    }

    public static void main(String arg[]) {
        try {
            /* 通信の準備をする */
            Scanner scanner = new Scanner(System.in);
            System.out.print("ポートを入力してください(0707など) → ");
            int port = scanner.nextInt();
            scanner.close();
            System.out.println("localhostの" + port + "番ポートで待機します");
            ServerSocket server = new ServerSocket(port); // ポート番号を指定し、クライアントとの接続の準備を行う

            Socket socket = server.accept(); // クライアントからの接続要求を待ち、
            // 要求があればソケットを取得し接続を行う
            System.out.println("接続しました。相手の入力を待っています......");

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            Tanzaku Tanzaku = (Tanzaku) ois.readObject();// Integerクラスでキャスト。

            String tanzakuJ = Tanzaku.getWishJ();
            System.out.println("願い事（日本語）は" + tanzakuJ);
            String tanzakuE = Tanzaku.getWishE();
            System.out.println("願い事（英語）は" + tanzakuE);

            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            Tanzaku response = new Tanzaku();
            response.setWishJ("こんばんは、天の川（サーバー）です。\n願い事「" + tanzakuE + "」、承りました。\n念のため、流れ星さんにも願いを" + times + "回、唱えておきましょう。もちろん英語で。");
            response.setWishE(serverProcess(tanzakuE));

            oos.writeObject(response);
            oos.flush();

            // close処理

            ois.close();
            oos.close();
            // socketの終了。
            socket.close();
            server.close();

        } // エラーが発生したらエラーメッセージを表示してプログラムを終了する
        catch (BindException be) {
            be.printStackTrace();
            System.out.println("ポート番号が不正、ポートが使用中です");
            System.err.println("別のポート番号を指定してください(6000など)");
        } catch (Exception e) {
            System.err.println("エラーが発生したのでプログラムを終了します");
            throw new RuntimeException(e);
        }
    }
}

