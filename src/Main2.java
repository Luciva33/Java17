import java.io.FileWriter;
import java.io.IOException;

public class Main2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		try {
			FileWriter fw = new FileWriter("data.txt");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace(); //がめんに表示
			System.out.println("エラーが発生しました");
		}
		
	}
	
	public static void print() throws Exception{
		
	}
	
	
}
