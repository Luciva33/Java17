import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Scanner scan = new Scanner(System.in);
		Dog dog = load();

		while (true) {
			System.out.println(dog.getName() + "のHP" + dog.getHp());
			System.out.print("どれにする? 1:走る 2:寝る 3:セーブ 4:終了 >");
			int select = new java.util.Scanner(System.in).nextInt();
			switch (select) {
			case 1:
				// 1の時の処理
				System.out.println(dog.getName() + "が走った");
				dog.run();

				break;
			case 2:
				// 2の時の処理

				System.out.println(dog.getName() + "が眠った");
				dog.sleep();

				break;
			case 3:
				// 3の時の処理 ファイルの保存処理
				System.out.println("セーブしました");
				save(dog);
				break;
			case 4:
				System.out.println("アプリを終了します。");
				return;
			default:
				System.out.println("選択肢に無い番号です。");
			}
		}

	}

	public static void save(Dog dog) {
		String path = "save/save.txt";
		
		try(BufferedWriter bw = new BufferedWriter
				(new OutputStreamWriter(new FileOutputStream(path),"UTF-8"))){
			
			//bw.write(dog.getHp());
			bw.write(String.valueOf(dog.getHp())); //int型を文字列に変換しないとchar型になる
			
			
		}catch(IOException e) {
			;   //セミコロン一個で何もしませんよという記述 他の開発者に教えることができる
		}
		
	}
	//ロード
	public static Dog load() {
		String path = "save/save.txt"; //saveフォルダの中のセーブファイル　ファイルの場所指定
		Dog dog = null;
		
		try(BufferedReader br = new BufferedReader
			(new InputStreamReader(new FileInputStream(path),"UTF-8"))){
			int hp = Integer.parseInt(br.readLine());
			dog = new Dog("ぽち",hp);
			
		}catch(IOException e) {
			System.out.println("セーブデータなし");
			
		}
		
		return dog;
	}

}
