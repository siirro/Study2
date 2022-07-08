import java.util.Scanner;

public class Var8 {
public static void main (String []args) {
	System.out.println("Start");
	Scanner scanner = new Scanner (System.in);
	
	//암호화 연산식
	//0 ->  0
	//1 ->  1
	//2 ->  2
	//3 ->  3
	//4 ->  10
	//5 ->  11
	//6 ->  12
	//7 ->  13	
	//8 ->  20
	//9 ->  21
	//10 -> 22
		
	int input=0;
	int output=0;
	
	System.out.println("숫자를 입력하세요");
	input = scanner.nextInt();
	output = (input/4*10)+input%4;
	System.out.println("input : "+input);
	System.out.println("output : " + output);
	System.out.println("Finish");
}
}
