package sec03.exam02_casting;

public class CheckValueBeforeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	i = -129;
		
		if ( (i < Byte.MIN_VALUE) || (i > Byte.MAX_VALUE))
		{
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
			System.out.println("���� �ٽ� Ȯ���� �ּ���");
		}
		else
		{	//-128 ~ 127 �϶�
			byte	b = (byte) i;
			System.out.println(b);
		}
	}

}
