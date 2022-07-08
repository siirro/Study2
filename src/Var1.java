
public class Var1 {
	public static void main(String[]args) {
		//변수 선언 공식
		//데이터타입 변수명;
		byte num;
		//대입 연산자 '=' : 오른쪽의 결과를 왼쪽에 대입하는 연산자
		num=10;
		System.out.println(num);
		num=35;
		System.out.println(num);
		// byte를 넘는 범위라서 에러 남-> num=30000000;
		int num2;
		num2=4000000;
		long num3;
		num3=2000000000;
		System.out.println(num3);
		num2=1;
		
		byte num4= 100+10;
		System.out.println(num4);
		//기본적으로 숫자는 int에 속한다 num4=num4+10;
		long num5 = 100L; //메모리에 8byte의 공간을 확보하고 주소를 num5로 지정
		//중복선언이라 에러 남 long num5=2L;
		num5=2L;
		System.out.println(num5);
		int num6;
		//num6에 대한 값이 없기 때문에 에러남->System.out.println(num6);
		//선언하고 아무 값도 안 넣은 상태면 에러남
		num6=10;//변수 초기화
		
		int num7=0;//정수는 보통 0으로 초기화함
		long num8=0L;//long타입은 0L로 초기화함
		
		
		
		
		
		
	} 
}
