package finalexam.i;

import java.io.*;
import java.net.*;

public class SimpleAddressServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8088)) {
            System.out.println("サーバがポート8088で起動しました。");
            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
                        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)) {

                    String townName = in.readLine();
                    String postalCode;
                    // 必要に応じてこのあたり変更 FIXME
                    // 必要に応じてこのあたり変更 FIXME
                    // 必要に応じてこのあたり変更 FIXME
                    // 必要に応じてこのあたり変更 FIXME
                    // 必要に応じてこのあたり変更 FIXME

                    System.out.println(postalCode);
                } catch (IOException e) {
                    System.err.println("クライアントとの通信中にエラーが発生しました: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.err.println("サーバの起動中にエラーが発生しました: " + e.getMessage());
        }
    }
}
