package finalexam.i;

import java.io.*;
import java.net.*;

public class SenjuAddressClient {
    public static void main(String[] args) {
        String townName = "千住曙町"; // ここを必要に応じて変更 FIXME

        try (Socket socket = new Socket("localhost", 8088);
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {
            // ここを必要に応じてこのあたり変更 FIXME
            // ここを必要に応じてこのあたり変更 FIXME
            // ここを必要に応じてこのあたり変更 FIXME
            // ここを必要に応じてこのあたり変更 FIXME
            // ここを必要に応じてこのあたり変更 FIXME

            System.out.println(townName);
        } catch (IOException e) {
            System.err.println("サーバとの通信中にエラーが発生しました: " + e.getMessage());
        }
    }
}
