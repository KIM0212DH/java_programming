package sec04.exam03_compare;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "dlwlrma";
		String strVar2 = "dlwlrma";
		String strVar3 = new String("dlwlrma");
		
		System.out.println(strVar1 == strVar2); 	//��� ��
		System.out.println(strVar1 == strVar3);		//��� ��
		System.out.println();
		System.out.println(strVar1.equals(strVar2));	//���� ����, �� ��
		System.out.println(strVar1.equals(strVar3));
	}

}
