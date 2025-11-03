package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	//自分のじゃんけんの手を入力
	public static String getMyChoice() {
		Scanner myChoice = new Scanner(System.in);
		String hand;
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			hand = myChoice.nextLine();
			
			if(myHand(hand)) {
				return hand;
			}else {
				System.out.println("もう一度じゃんけんの手を選んでください。");
			}
		}
	}
	
     public static boolean myHand(String hand) {
	     return hand.equals("r")||hand.equals("s")||hand.equals("p");
}

     public static String getRandom() {
    	    String[] randomHand = {"r", "s", "p"};
    	    double randomValue = Math.random() * 3;   
    	    int index = (int) Math.floor(randomValue);

    	    return randomHand[index];
    	}
     public static void playGame(String myHand, String cpuHand) {
    	 HashMap<String,String>handMap = new HashMap<String, String>();
    	 
    	 handMap.put("r","グー" );
    	 handMap.put("s","チョキ");
    	 handMap.put("p", "パー");
    	 
    	 System.out.println("自分の手は"+handMap.get(myHand)+",対戦相手の手は"+handMap.get(cpuHand));
		
    	 if(myHand.equals(cpuHand)) {
    		 System.out.println("あいこです");
    	 }else if (
    		        (myHand.equals("r") && cpuHand.equals("s")) ||
    		        (myHand.equals("s") && cpuHand.equals("p")) ||
    		        (myHand.equals("p") && cpuHand.equals("r"))
    		    ) {
    		        System.out.println("自分の勝ちです");
    		    } else {
    		        System.out.println("自分の負けです");
    		    }
	}
}
