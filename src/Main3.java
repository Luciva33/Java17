import java.io.FileWriter;
import java.io.IOException;

public class Main3 {

	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ

		//try-with-resources文 この書き方で書く

		save();
	}

	public static void save() throws IOException {
//		try (FileWriter fw = new FileWriter("data.txt");) {
//			fw.write("hello!");
//		} catch (Exception e) {
//			System.out.println("何らかの例外が発生しました");
//		}
		
		FileWriter fw = new FileWriter("data.txt");
		
	}

}
