package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		// インスタンスを作成する
        Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
        
        //  自分のじゃんけんの手
        String myHand = jyanken.getMyChoice();
        
        // 対戦相手のじゃんけんの手
        String cpuHand = jyanken.getRandom();
        
        // じゃんけんの結果
        jyanken.playGame(myHand, cpuHand);

	}

}
