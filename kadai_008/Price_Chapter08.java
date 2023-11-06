/**
 * 
 */
package kadai_008;

/**年代と、サービスの使用料金を表す変数を宣言し、初期化します。変数名は、ローワーキャメルケースで記述します。

年代を表す変数は、int型の「userAge」としましょう。サービスの使用料金を表す変数は、int型の「serviceCost」としましょう。
 * 
 */
public class Price_Chapter08 {

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int userAge =  30;
		
		
		int serviceCost= switch (userAge) {
		case 10 -> 1000;
		case 20 -> 2000;
		case 30,40 ->  3000;
		case 50,60,70 -> 4000;
		case 80 -> 5000;
		
		default ->
			500;
		};
		
		System.out.println(userAge+"代の料金は"+serviceCost+"円");
		}

}
