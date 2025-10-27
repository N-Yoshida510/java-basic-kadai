package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		  // インスタンスを作成
        Dictionary_Chapter21 dict = new Dictionary_Chapter21();

        // 英単語を配列にセット
        String[] wordsToCheck = {"apple", "banana", "grape", "orange"};

        // メソッドを呼び出す
        for (String word : wordsToCheck) {
            dict.fruit(word); 
        }

	}

}
