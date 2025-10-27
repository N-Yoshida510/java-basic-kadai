package kadai_018;

abstract public class Kato_Chapter18 {
	  // フィールド 
    public String familyName;  
    public String givenName;   
    public String address;     

    //  共通の紹介 
    public void commonIntroduce() {
        System.out.println("私の名前は" + familyName  + givenName + "です");
        System.out.println("住所は" + address + "です");
    }

    //  個別の紹介
    public abstract void eachIntroduce();

    // 実行
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }

}
