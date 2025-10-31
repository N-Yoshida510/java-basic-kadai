package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		//インスタンス作成
		KatoTaro_Chapter18 kato1 = new KatoTaro_Chapter18("加藤","東京都中野区〇×");
		KatoIchiro_Chapter18 kato2 = new KatoIchiro_Chapter18("加藤", "東京都中野区〇×");
		KatoHanako_Chapter18 kato3 = new KatoHanako_Chapter18("加藤", "東京都中野区〇×");
		
		//setGivenNameメソッド
		kato1.setGivenName("太郎");
		kato2.setGivenName("一郎");
		kato3.setGivenName("花子");
		
		
		//execIntroduceメソッド
		kato1.execIntroduce();
		kato2.execIntroduce();
		kato3.execIntroduce();
	}
}
	
		
