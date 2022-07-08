import java.util.Scanner;

public class Var9 {
public static void main (String []args) {
	Scanner sc = new Scanner(System.in);
	int num1=97;
	long num2 = 10L;
	char ch = 'a';
	String name1 = "IU";
	String name2 = "IU";
	System.out.println("이름을 입력하세요");
	String name3 = sc.next();
	
	System.out.println(num1==num2);
	System.out.println(ch==num1);
	System.out.println(name1==name2);
	System.out.println(name1==name3);
	
	int age = 20;
	boolean check = age >= 10 && age <20;
	System.out.println(check);
	
	check = age >= 10 || age <20;
	System.out.println(check);
	//a&&b&&c<-a=true, b=false일때는 c는 연산을 안함, 어차피 false니까
	//a||b||c<-a=false, b=false일때는 c까지 연산함, c의 값에 따라 결과가 달라짐
}
}
