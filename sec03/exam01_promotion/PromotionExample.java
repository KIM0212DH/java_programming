package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte	byteValue = 10;
		int		intValue = byteValue;
		System.out.println(intValue);
		
		char	charValue = '�';
		intValue = charValue;	//���� �Ϳ��� ū���� �ڵ� promotion
		System.out.println("="+ intValue);
		
		intValue = 500;
		long	longValue = intValue;	//���� �Ϳ��� ū���� �ڵ� promotion
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	//���� �Ϳ��� ū���� �ڵ� promotion
		System.out.println(doubleValue);
	}

}
