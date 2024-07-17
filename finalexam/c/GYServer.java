package finalexam.c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

// （令和ー明治 2024-1989を対応すること　元号は元年（１年）優先　月は考慮しない）
//以下のコードの修正１－３を中心に治すこと　クライアントの修正は必要ないが修正してもよい。
//サーバのみ提出すること。（クライアントを修正してひとはその点明記してクライアントも提出）

public class GYServer {
    public static void main(String[] args) {
        int portNumber = 12345;

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            System.out.println("Server started on port " + portNumber);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket);

                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

            }
        } catch (IOException e) {
            System.err.println("Server error: " + e.getMessage());
        }
    }

    private static String convertToEra(int year) {
        String era = "元号範囲外";
        int gyear = 1889;

        // 修正点2 15行程度
        // （令和ー明治 2024-1989を対応すること 元号は元年（１年）優先 月は考慮しない）
        // 修正点2 15行程度
        // 修正点2 15行程度
        // 修正点2 15行程度

        return era + gyear;
    }

    private static class ClientHandler extends Thread {
        private Socket socket;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try (
                    BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    PrintWriter output = new PrintWriter(socket.getOutputStream(), true);) {
                String clientMessage;
                while ((clientMessage = input.readLine()) != null) {
                    if (clientMessage.equalsIgnoreCase("quit")) {
                        break;
                    }
// Enter a year (yyyy), or 'quit' to exit: 1911
// Server response: 明治44
// Enter a year (yyyy), or 'quit' to exit: 1912
// Server response: 大正1
// Enter a year (yyyy), or 'quit' to exit: 1925
// Server response: 大正14
// Enter a year (yyyy), or 'quit' to exit: 1926
// Server response: 昭和1
// Enter a year (yyyy), or 'quit' to exit: 1988
// Server response: 昭和63
// Enter a year (yyyy), or 'quit' to exit: 1989
// Server response: 平成1
// Enter a year (yyyy), or 'quit' to exit: 2018
// Server response: 平成30
// Enter a year (yyyy), or 'quit' to exit: 2019
// Server response: 令和1
// Enter a year (yyyy), or 'quit' to exit: 2024
// Server response: 令和6
                }
            } catch (IOException e) {
                System.err.println("ClientHandler error: " + e.getMessage());
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    System.err.println("Error closing socket: " + e.getMessage());
                }
            }
        }
    }
}
