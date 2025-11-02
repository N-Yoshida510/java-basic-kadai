package kadai_018;

abstract public class Kato_Chapter18 {
    public String familyName;
    public String givenName;
    public String address;

    // 共通コンストラクタ（苗字と住所は全員同じ）
    public Kato_Chapter18() {
        this.familyName = "加藤";
        this.address = "東京都中野区";
    }

    public void commonIntroduce() {
        System.out.println("私の名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
    }

    public abstract void eachIntroduce();

    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}
