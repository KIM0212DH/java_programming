package sec03.exam03_accuracy;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	num1 = 123456780;
		int	num2 = 123456780;
		
		float	num3 = num2;	
		System.out.println(num3);
		num2 = (int) num3;	//큰것에서 작은것으로 강제 casting. float 타입은 23bit 영역 사용. 상대적으로 크기 작음
		System.out.println(num2);
		
		int	result = num1 - num2;
		System.out.println(result);
	}

}
