import java.util.Scanner;

public class Var3 {
public static void main (String[]args) {
	System.out.println("Start");	
	//키보드와 연결
	Scanner sc = new Scanner(System.in);
	
	int gion = 0;
	double cheon = 0.0;
	String name = null;
	
	//System.out.println();<-자동 완성문= sysout ctrl+space
	System.out.println("현재 온도를 입력하세요");
	gion=sc.nextInt();
	System.out.print("현재 온도는 ");
	System.out.println(gion + "도 입니다");
	
	System.out.println("현재 체온을 입력하세요");	
	cheon=sc.nextDouble();	
	System.out.print("현재 체온은 ");
	System.out.println(cheon + "도 입니다");
	
	System.out.println("이름을 입력하세요");
	name = sc.next();
	System.out.print("당신의 이름은 ");
	System.out.println(name + "입니다");
	System.out.println("Finish");
	
}
}
