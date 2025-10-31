package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18{
	// コンストラクタでフィールドを初期化
	 public KatoIchiro_Chapter18(String familyName,  String address) {
		 super(familyName,"一郎",address);
	    }
    
    // 抽象メソッドの実装
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }

}
