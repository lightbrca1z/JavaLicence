import java.util.Scanner;

public class DateDayJudgement {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		System.out.println("年を入力してください: ");
		int year = sc.nextInt();
		System.out.println("月を入力してください: ");
		int month = sc.nextInt();
		
		//31 30 28
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println(year+"年"+month+"月は31日です");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println(year+"年"+month+"月は30日です");
			break;
		case 2:
			if((year % 4 == 0 && year % 100 != 0) || 0 == year % 400) {
				System.out.println(year+"年"+month+"月は29日です");
				break;
			}else {
				System.out.println(year+"年"+month+"月は28日です");
			}
		default:
			System.out.println("無効な月です");
		}
		
//		System.out.println(year);
//		System.out.println(month);
	}

}
