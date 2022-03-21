package sec03.exam04_bit_reverse;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	v1 = 10;
		int	v2 = ~v1;	//1�� ����
		int	v3 = ~v1 + 1;	//1�� ���� + 1 = 2�� ����
		System.out.println(toBinaryString(v1) + " (������: " + v1 + ")");
		System.out.println(toBinaryString(v2) + " (������: " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (������: " + v3 + ")");
		System.out.println();
	}

	public static String	toBinaryString(int value)	//���ǿ� �ο� ���� ���� 3/10
	{
		String str = Integer.toBinaryString(value);
		while (str.length() < 32)
		{
			str = "0" + str;
		}
		return str;
	}
}
