package src;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.BindException;
import java.net.Socket; //ネットワーク関連のパッケージを利用する
import java.util.Scanner;

public class TanabataClient {

    public static void main(String arg[]) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("ポートを入力してください(0707など) → ");
            int port = scanner.nextInt();
            System.out.println("localhostの" + port + "番ポートに接続を要求します");
            Socket socket = new Socket("localhost", port);
            System.out.println("接続されました");

            System.out.println("短冊に願い事を書きましょう。");
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            System.out.println("願い事を入力してください(例:織姫と彦星が無事に会えますように。) ↓");
            String wishJ = scanner.next();
            System.out.println("すみません、やっぱり英語かローマ字で入力してください。空白なしでお願いします。(例:meetOrihimeAndHikoboshi) ↓");
            String wishE = scanner.next();
            scanner.close();

            Tanzaku Tanzaku = new Tanzaku();
            Tanzaku.setWishJ(wishJ);
            Tanzaku.setWishE(wishE);

            oos.writeObject(Tanzaku);
            oos.flush();

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            Tanzaku okaeshiPresent = (Tanzaku) ois.readObject();

            String replayMsg = okaeshiPresent.getWishJ();
            System.out.println("サーバからのメッセージは\n" + replayMsg);
            String replayContent = okaeshiPresent.getWishE();
            System.out.println(replayContent + "\nでは、願い事が無事に叶いますように。星に願いを☆");

            ois.close();
            oos.close();
            socket.close();

        } // エラーが発生したらエラーメッセージを表示してプログラムを終了する
        catch (BindException be) {
            be.printStackTrace();
            System.err.println("ポート番号が不正か、サーバが起動していません");
            System.err.println("サーバが起動しているか確認してください");
            System.err.println("別のポート番号を指定してください(6000など)");
        } catch (Exception e) {
            System.err.println("エラーが発生したのでプログラムを終了します");
            throw new RuntimeException(e);
        }
    }
}
