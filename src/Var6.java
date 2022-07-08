
public class Var6 {
public static void main (String []args) {
System.out.println("Start");
	//형변화(Cascading)
	int num1 = 10;
	long num2 = 20L;
	
	// num1=num2;<-다른 타입이라 에러남
	num2=num1;//자동형변환
	System.out.println(num2);
	System.out.println(20+20L);
	num1 = (int)num2;//강제 형변환
	//byte, short, int(4), long(8), double(8), char(2)
	char ch = 'a';
	num1 = ch;
	num2 = num1;
	float f = num2;
	//1.0000001<-1이라고 판단함
	//1.0000002<-1이라고 판단
	int k = 35;
	int m = 35;
	int e = 37;
	int t = k+m+e;
	double v = t/3.0;
	System.out.println(t);
	System.out.println(v);
	
	num1 = 'b';
	System.out.println(num1);
	
	char c = (char)60;
	System.out.println(c);
	
	System.out.println("Finish");
}
}
