package sec02.exam02_switch;

public class SwitchStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String position = "����";
		
		switch (position)
		{
			case  " ":
				System.out.println("700����");
				break;
			case "2":
				System.out.println("500����");
				break;
			default:
				System.out.println("300����");
		}
	}
}