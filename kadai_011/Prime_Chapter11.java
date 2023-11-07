package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		 boolean[] PrimeNumber = new boolean[101];
		 

		for( int i = 1; i < PrimeNumber.length; i++ ) {
			PrimeNumber[i] = true;
		}
			int j = 2;
			while (j < PrimeNumber.length) {
			for (int i = j + 1; i< PrimeNumber.length; i++) {
			if (i % j == 0) {
				PrimeNumber[i] = false;
			continue;
		}
		}
			j +=1;
			}
		for (int i =2; i < j; i++) {
		if(PrimeNumber[i]) {
			System.out.println(i);
		}

	}
	}}


