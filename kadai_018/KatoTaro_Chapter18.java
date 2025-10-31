package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18{
	// コンストラクタでフィールドを初期化
	 public KatoTaro_Chapter18(String familyName,  String address) {
		 super(familyName,"太郎",address);
	    }
    
    // 抽象メソッドの実装
    public void eachIntroduce() {
        System.out.println("Javaが得意です");
    }
}
