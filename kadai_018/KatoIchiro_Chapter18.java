package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18{
	// コンストラクタでフィールドを初期化
    public KatoIchiro_Chapter18(String familyName,  String address) {
        this.familyName = familyName;
        this.address = address;
        setGivenName();
    }

    public void setGivenName() {
    	this.givenName="一郎";
    	
    }
    
    // 抽象メソッドの実装
    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }

}
