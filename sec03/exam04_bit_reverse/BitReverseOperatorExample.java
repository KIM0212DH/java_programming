package sec03.exam04_bit_reverse;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	v1 = 10;
		int	v2 = ~v1;	//1의 보수
		int	v3 = ~v1 + 1;	//1의 보수 + 1 = 2의 보수
		System.out.println(toBinaryString(v1) + " (십진수: " + v1 + ")");
		System.out.println(toBinaryString(v2) + " (십진수: " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (십진수: " + v3 + ")");
		System.out.println();
	}

	public static String	toBinaryString(int value)	//강의에 부연 설명 잇음 3/10
	{
		String str = Integer.toBinaryString(value);
		while (str.length() < 32)
		{
			str = "0" + str;
		}
		return str;
	}
}
