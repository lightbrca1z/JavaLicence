import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//変数
		System.out.println("計算したい数値1を入力してください: ");
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
        System.out.println("計算したい数値2を入力してください: ");
        int b = sc.nextInt();
		
        System.out.println("計算したい演算子を入力してください(+, -, *, /): ");
        char operator = sc.next().charAt(0);
        
		switch(operator) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			if(b != 0) {
			System.out.println(a/b);
			}else {
				System.out.println("ゼロ除算は出来ません！");
			}
			break;
		default:
			System.out.println("システムエラーです。");
			break;
		}
	}

}
