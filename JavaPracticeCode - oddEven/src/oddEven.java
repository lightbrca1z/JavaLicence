
public class oddEven {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int maxTemp = 30;
		int minTemp = 10;
		int currentTemp = 25;
		
		//ロジック
		if(currentTemp > maxTemp) {
			System.out.println("温度が高すぎます");
		}else if (currentTemp < minTemp) {
			System.out.println("温度が低すぎます");
		}else {
			System.out.println("現在の温度は安全範囲です");
		}
		
		if(currentTemp % 2 == 0) {
			System.out.println("温度は偶数：最適温度");
		}else {
			System.out.println("温度は奇数：化学反応が起こります");
		}
	}

}
