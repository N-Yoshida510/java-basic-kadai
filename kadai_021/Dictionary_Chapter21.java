package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	//フィールド
	HashMap<String, String> humanMap = new HashMap<String, String>();
	 
	//コンストラクタ
	public Dictionary_Chapter21() {
		humanMap.put("apple", "りんご");
		humanMap.put("peach", "桃");
		humanMap.put("banana", "バナナ");
		humanMap.put("lemon", "レモン");
		humanMap.put("pear", "梨");
		humanMap.put("kiwi", "キウィ");
		humanMap.put("strawberry", "いちご");
		humanMap.put("grape", "ぶどう");
		humanMap.put("muscat", "マスカット");
		humanMap.put("cherry", "さくらんぼ");
	}
	
     // 繰り返し処理
	public void fruit(String word) {
        if (humanMap.containsKey(word)) {
            System.out.println(word + " の意味は" + humanMap.get(word) );
        } else {
            System.out.println(word + " は辞書に存在しません。");
        }
	}
}
	