package sec02.exam05_float_double;

public class FloatDoubleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double	var1 = 3.14;
		//float	var2 = 3.14	//컴파일 에러
		float	var3 = 3.14F;
		
		double	var4 = 0.1234567890123456789;		//실수는 근사값으로 저장	52bit 영역
		float	var5 = 0.1234567890123456789F;		//실수는 근사값으로 저장	23bit 영역
		
		System.out.println("var1: " + var1);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
		
		int		var6 = 3000000;
		double	var7 = 3e6;
		float	var8 = 3e6F; //대소문자 f 상관 없음
		double	var9 = 2e-3;
		
		System.out.println("var6: " + var6);
		System.out.println("var7: " + var7);
		System.out.println("var8: " + var8);
		System.out.println("var9: " + var9);
	}

}
