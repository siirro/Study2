import java.util.Scanner;

public class Var5 {
public static void main (String [] args) {
	System.out.println("Start");
	Scanner scanner = new Scanner (System.in);
	//입력 받은 수를 저장할 변수
	int num = 0;
	int sum = 0;
	System.out.println("첫번째 숫자 입력");
	num = scanner.nextInt();
	System.out.println(num);
	sum = sum + num;
	System.out.println("두번째 숫자 입력");
	num = scanner.nextInt();
	System.out.println(num);
	sum = sum + num;
	System.out.println("세번째 숫자 입력");
	num = scanner.nextInt();
	System.out.println(num);
	sum = sum + num;
	System.out.println("네번째 숫자 입력");
    num = scanner.nextInt();
    System.out.println(num);
    sum = sum+ num;
    System.out.println("다섯번째 숫자 입력");
	num = scanner.nextInt();
	System.out.println(num);
    sum = sum + num;
	System.out.println(sum);
	System.out.println("Finish");

	
}
}
