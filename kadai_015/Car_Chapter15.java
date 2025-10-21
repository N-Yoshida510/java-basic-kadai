package kadai_015;

public class Car_Chapter15 {
	//フィールド
	private int gear  =1;
	private int speed =10;

//メソッド
public void changeGear(int afterGear) {
	System.out.println("ギア"+gear+"から"+afterGear+"に切り替えました");
   }
public void run(int aftergear) {
	if(aftergear == 1) {
		speed = 10;
	} else if (aftergear == 2) {
		speed=20;
	} else if (aftergear == 3) {
		speed=30;
	}else if (aftergear == 4) {
		speed=40;
	}else if (aftergear == 5) {
		speed=50;
	}else {
		speed=10;
	}
	System.out.println("速度は時速"+speed+"kmです");
}

}

