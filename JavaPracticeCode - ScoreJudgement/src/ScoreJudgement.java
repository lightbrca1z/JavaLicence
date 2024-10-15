
public class ScoreJudgement {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		/*
		* Score 100 - 90 : A
		* Score 89 - 80 : B
		* Score 79 - 70 : C
		* Score 69 - 60 : D
		* Score 59 - 50 : E
		*/
		
		int score = 75;
		
		switch(score / 10) {
		case 10 :
		case 9 :
			System.out.println("A評価");
			break;
		case 8:
			System.out.println("B評価");
			break;
		case 7:
			System.out.println("C評価");
			break;
		case 6:
			System.out.println("D評価");
			break;
		default :
			System.out.println("E評価");
		}
	}

}
