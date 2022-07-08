import java.util.Scanner;

public class Var4 {
public static void main (String[]args) {
	System.out.println("Start");
	 Scanner scanner=new Scanner (System.in);
	String id = null;
	String pw = null;
	String name = null;
	int year = 0;
	int month = 0;
	int day = 0;
	String gen = null;
	String mail = null;
	String num = null;
		 
	System.out.println("아이디를 입력하세요");
	id = scanner.next();
	System.out.print("아이디는 ");
	System.out.println(id);
	
	System.out.println("패스워드를 입력하세요");
	pw = scanner.next();
	System.out.print("패스워드는 ");
	System.out.println(pw);
	
	System.out.println("이름을 입력하세요");
	name = scanner.next();
	System.out.print("이름은 ");
	System.out.println(name);
	
	System.out.println("태어난 연도를 입력하세요");
	year = scanner.nextInt();
	System.out.print("태어난 연도는 ");
	System.out.println(year);
	System.out.println("태어난 월을 입력하세요");
	month = scanner.nextInt();
	System.out.print("태어난 월은 ");
	System.out.println(month);
	System.out.println("태어난 일을 입력하세요");
	day = scanner.nextInt();
	System.out.print("태어난 일은 ");
	System.out.println(day);	
	System.out.println("성별을 입력하세요");
	gen = scanner.next();
	System.out.print("당신의 성별은");
	System.out.println(gen);
	System.out.println("이메일을 입력하세요");
	mail= scanner.next();
	System.out.print("이메일은 ");
	System.out.println(mail);
	
	System.out.println("전화번호를 입력하세요");
	num = scanner.next(); 
	System.out.println("전화번호는 ");
	System.out.println(num);
	
	
	
	System.out.println("Finish");
}
}
