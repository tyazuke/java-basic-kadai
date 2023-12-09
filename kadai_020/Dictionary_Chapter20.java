package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	public void historyItem(String[] word) {
		HashMap<String, String> dictionalyMap = new HashMap<String,String>();
	 
		dictionalyMap.put("apple","りんご");
		dictionalyMap.put("peach","桃");
		dictionalyMap.put("banana","バナナ");
		dictionalyMap.put("lemon","レモン");
		dictionalyMap.put("pear","梨");
		dictionalyMap.put("kiwi","キウィ");
		dictionalyMap.put("strawberry","いちご");
		dictionalyMap.put("grape","ぶどう");
		dictionalyMap.put("muscat","マスカット");
		dictionalyMap.put("cherry","さくらんぼ");
	
		String result = "";
		for(int i = 0; i< word.length; i++) {
			result = dictionalyMap.get(word[i]);
			if(result != null) {
				System.out.println(word[i]+"の意味は"+result+"です");
			}  else {
				System.out.println(word[i]+"は辞書に存在しません");
			}
		}
	}
}
