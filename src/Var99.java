
public class Var99 {
public static void main (String []args) {
	System.out.println("Start");
	//편의점 계산 자동화 프로그램
	
	//물건 가격의 총합계
	int price = 28640;
	
	//손님이 낸 돈
	int money=50000;
	
	//잔돈 계산
	int change= money-price;
	
	//만원짜리 개수를 담을 변수
	int man = change/10000;
	int chon= change%10000/1000;
//	int back=(change-man*10000-chon*1000)/100;
	int back = change%1000/100;
	int sib = change%100/10; 
	
	System.out.println("거스름돈은 "+change+"원이고\n만원짜리는 "+man+"장\n천원짜리는 "+chon+"장\n백원짜리는 "+back+"개\n십원짜리는 "+sib+"개입니다");
	System.out.println("만원 : "+man+" 장");
	System.out.println("천원 : "+chon+" 장");
	System.out.println("백원 : "+back+" 개");
	System.out.println("십원 : "+sib+" 개");
	System.out.println("Finish");
}
}

