package sec04.exam01_arithmetic;

public class InfinityAndNaNCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	x = 5;
		double	y = 0.0;
		
		double	z = x / y;
		//double	z = x % y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
		//�߸��� �ڵ�
		System.out.println(z + 2);
		//�˸��� �ڵ�
		if (Double.isInfinite(z) || Double.isNaN(z))
		{
			System.out.println("�� ���� �Ұ�");
		}
		else
		{
			System.out.println(z + 2);
		}
	}

}
