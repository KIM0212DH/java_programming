package sec03.exam03_accuracy;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	num1 = 123456780;
		int	num2 = 123456780;
		
		float	num3 = num2;	
		System.out.println(num3);
		num2 = (int) num3;	//ū�Ϳ��� ���������� ���� casting. float Ÿ���� 23bit ���� ���. ��������� ũ�� ����
		System.out.println(num2);
		
		int	result = num1 - num2;
		System.out.println(result);
	}

}
