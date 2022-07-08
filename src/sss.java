import java.util.Scanner;

public class sss {
public static void main (String []args) {
	Scanner scanner = new Scanner (System.in);
	System.out.println("Start");
	
	int input = 0;
	int output = 0;
	
	System.out.println("숫자를 입력하세요");
	input = scanner.nextInt();
	output= (input/4*10)+input%4;
	
	System.out.println(output);
	
	
	int price = 29550;	
	int money = 35000;	
	int change = money - price;
	System.out.println("거스름돈은 "+change+"원입니다");
	
	int man = change/10000;
	int chon = change%10000/1000;
	int back = change%1000/100;
	int sib = change%100/10;
	System.out.println("만원 : "+man+" 장");
	System.out.println("천원 : "+chon+" 장");
	System.out.println("백원 : "+back+" 개");
	System.out.println("십원 : "+sib+" 개");
	
	System.out.println("Finish");
}
}
