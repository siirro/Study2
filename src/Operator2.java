import java.util.Scanner;

public class Operator2 {
public static void main (String[]args ) {
	Scanner sc = new Scanner (System.in);
	
	int age= 0; 
	int price = 0;
	System.out.println("나이를 입력하세요");
	//나이를 입력받아 10대 유무 판정
	age = sc.nextInt();
	String result = age >=10&&age<20? "10대입니다":"10대가 아닙니다";
	System.out.println(result);
	
	System.out.println("물건의 가격을 입력하세요");
	//물건의 가격이 30000 이상이면 배송료가 무료
	//아니면 배송료가 가격의 10%로 책정
	// 최종 지불 비용을 출력하세요
	price = sc.nextInt();
	//int result2 = price >= 30000? 0:(int)(price*0.1);
	//price = price+ result2;
	price=price>=30000? price:(int)(price*1.1);
	System.out.println("결제비용 (배송료 포함): " + price);
	System.out.println("끝~");
	

			
	
}
}
