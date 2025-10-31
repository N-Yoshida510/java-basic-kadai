package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18{
	// コンストラクタでフィールドを初期化
	 public KatoHanako_Chapter18(String familyName,  String address) {
		 super(familyName,"花子",address);
	    }

      // 抽象メソッドの実装
    public void eachIntroduce() {
        System.out.println("趣味は読書です");
    }

}
