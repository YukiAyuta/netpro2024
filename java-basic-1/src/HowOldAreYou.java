// C言語では、#include に相当する
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HowOldAreYou {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			// BufferedReader というのは、データ読み込みのクラス(型)
			// クラスの変数を作るには、new を使う。

			// readLine() は、入出力エラーの可能性がある。エラー処理がないとコンパイルできない。
			//  Java では、 try{ XXXXXXXX }  catch(エラーの型 変数) { XXXXXXXXXXXXXXXXXX} と書く
		try {
			System.out.println("何歳ですか?");
			String line = reader.readLine();
			int age = Integer.parseInt(line);
			System.out.println("あなたは" + age + "歳ですね。");
			System.out.println("あなたは2030年に、" + (age + 6) + "歳ですね。");
			if(0 <= age && age <= 5){
				System.out.println("あなたが生まれた元号は、令和ですね。");
			}else if(5 < age && age <= 35){
				System.out.println("あなたが生まれた元号は、平成ですね。");
			}else if(35 < age && age <= 98){
				System.out.println("あなたが生まれた元号は、昭和ですね。");
			}else if(98 < age && age <= 112){
				System.out.println("あなたが生まれた元号は、大正ですね。");
			}else if(112 < age && age <= 120){
				System.out.println("あなたが生まれた元号は、明治ですね。");
			}else if(120 < age || age < 0){
				System.out.println("再入力してください。");
				line = reader.readLine();
				age = Integer.parseInt(line);
			}
		
		}
		
		catch(IOException e) {
			System.out.println(e);
		}


	}
}

//  課題    キーボードから数字を打ち込む
//  その結果、 あなたは、???歳ですね、と画面に表示させる。
//  その後、あなたは10年後、????歳ですね、と画面に表示させる。

