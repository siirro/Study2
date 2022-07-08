import java.util.Scanner;

public class Operator1 {
public static void main (String []args) {
	
	Scanner sc = new Scanner(System.in);
	
	int count=0;
	count = count+1;//1
	count = count+1;//2
	
	count = 0;
	
	count = ++count;
	
	++count;//선행
	count++;//후행
	
	System.out.println(++count);//4
	System.out.println(count++);//4를 print하고 1 증가
	System.out.println(count);//5
	
	count = 0;
	int result = ++count;
	System.out.println(count); //1
	System.out.println(result); //1
	
	result = count++; //대입 연산자를 먼저! count를 먼저 대입한 후에 ++를 연산함
	System.out.println(count); //2
	System.out.println(result); //1
	
	count = 0;
	
	int result1 = --count;
	System.out.println(result1);
	
	result = 0;
	result-=4;
	System.out.println(result);
	
	String result2 = null;
	int age= sc.nextInt();
	result2 = age > 19 ? "성년" : "미성년";
	System.out.println(result2);
	
}
}
