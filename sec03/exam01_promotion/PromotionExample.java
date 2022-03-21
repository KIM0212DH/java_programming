package sec03.exam01_promotion;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte	byteValue = 10;
		int		intValue = byteValue;
		System.out.println(intValue);
		
		char	charValue = '가';
		intValue = charValue;	//작은 것에서 큰것은 자동 promotion
		System.out.println("가의 유니코드="+ intValue);
		
		intValue = 500;
		long	longValue = intValue;	//작은 것에서 큰것은 자동 promotion
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	//작은 것에서 큰것은 자동 promotion
		System.out.println(doubleValue);
	}

}
