import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//Scanner s = new Scanner(System.in);
		int[] nums = {3,1,5};
		System.out.print("入力>>");
		int index = new Scanner(System.in).nextInt();
		
		//例外が発生したときに実行する処理
		
		try {
			System.out.println(nums[index]);
			
			//例外が発生したら、catchブロックに移行する
		}catch(ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace(); //プログラムが止まらずにSystem.out.println("存在しないインデックス");実行処理できる
			System.out.println("存在しないインデックス");
		}catch(InputMismatchException e) {
			System.out.println("入力は整数でお願いします");
			
		}finally {
			System.out.println("終了");
		
		}
		
		//finallyはtry,catchどっちを通っても、実行する
		
	}

}
