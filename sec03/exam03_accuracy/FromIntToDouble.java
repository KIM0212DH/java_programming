package sec03.exam03_accuracy;

public class FromIntToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	num1 = 123456780;
		int	num2 = 123456780;
		
		double	num3 = num2;	//�����Ϳ��� ū������ �ڵ� promotion
		num2 = (int) num3;		//ū�Ϳ��� ���������� ���� casting. double�� 52bit �������� ��������� ���� ŭ
		
		int	result = num1 - num2;
		System.out.println(result);
	}

}
