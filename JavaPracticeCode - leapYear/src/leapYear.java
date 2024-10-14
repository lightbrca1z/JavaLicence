import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("計算したい年を入力してください: ");
		
		Scanner sc = new Scanner(System.in);
		int thisYear = sc.nextInt();
		int yearAfterNext = thisYear + 1;
		int ThreeYearFromNow = yearAfterNext + 1;
		
		if(0 == thisYear % 4 && 0 != thisYear % 100 || 0 == thisYear % 400) {
			System.out.println("うるう年");
			System.out.println("次のうるう年は: " + (thisYear + 4));
		}else {
			System.out.println("平年");
		}
		
		if(0 == yearAfterNext % 4 && 0 !=  yearAfterNext % 100 || 0 ==  yearAfterNext % 400) {
			System.out.println("次のうるう年は: " + (yearAfterNext));
		}
		if(0 == ThreeYearFromNow % 4 && 0 != ThreeYearFromNow % 100 || 0 == ThreeYearFromNow % 400) {
			System.out.println("次のうるう年は: " + (ThreeYearFromNow));
		}
		else if(0 == (ThreeYearFromNow+1) % 4 && 0 != (ThreeYearFromNow+1) % 100 || 0 == (ThreeYearFromNow+1) % 400) {
			System.out.println("次のうるう年は: " + (ThreeYearFromNow+1));
	}
	}
}
