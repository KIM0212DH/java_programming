package sec03.exam03_accuracy;

import java.math.BigDecimal;

public class DoubleAccuracy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double	total = 0;
		total += 5.6;
		System.out.println(total);
		total += 5.8;
		System.out.println(total);
		
		double	num = 0.1;
		for (int i = 0; i < 10000; i++)
		{
			num += 0.1;
		}
		System.out.println(num);
		
		double	a = 77.124;
		System.out.println(a * 100000);
		
		BigDecimal	x1 = new BigDecimal("77.124");
		BigDecimal	y1 = new BigDecimal("100000");
		System.out.println(x1.multiply(y1));
	}

}
