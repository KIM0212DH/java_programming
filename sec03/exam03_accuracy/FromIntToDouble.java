package sec03.exam03_accuracy;

public class FromIntToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	num1 = 123456780;
		int	num2 = 123456780;
		
		double	num3 = num2;	//작은것에서 큰것으로 자동 promotion
		num2 = (int) num3;		//큰것에서 작은것으로 강제 casting. double은 52bit 영역으로 상대적으로 공간 큼
		
		int	result = num1 - num2;
		System.out.println(result);
	}

}
