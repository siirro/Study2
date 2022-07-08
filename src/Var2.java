
public class Var2 {
public static void main (String []args) {
	//2.1234;
	double num1= 2.1234;//8byte
	System.out.println(num1);
	float num2 = 2.1234F;//4byte
	System.out.println(num2);
	float num3=num2;
	System.out.println(num3);
	// float num3=num1;<-float타입에 double타입을 대입할수 없다, 에러 남
	System.out.println(56789);//56789=int타입
	System.out.println(2.3256F);//2.3256F=float타입
	
	int kor = 0;
	int math = 0;
	int eng = 0;
	int total = kor+math+eng;
	
	kor=50;
	math=50;
	eng=50;
	
	System.out.println(total);//total에 대입한 마지막 값이 0이기 때문에 total의 값은 0임
	
	char ch = '한';
	System.out.println(ch);
	
	char ch2 = ' ';//초기값
	double d1 = 0.0;
	float d2 = 0.0F;
	
	System.out.println("초기값="+ ch2);
	
	boolean check = true;
	check = false;
	boolean check2 = false;//초기값
	
	//변수 선언 공식
	//데이터타입명 변수명;
	String name = "abc";
	String name2 = new String();

	System.out.println('b');//char타입
	System.out.println('1');//char타입
	System.out.println("abc");//string타입

}
}
