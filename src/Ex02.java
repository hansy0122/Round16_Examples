import java.io.*;
public class Ex02 {
	public static void main(String ar[]){
		File f=new File("Ex01.java");// �����ϵ� ������ϵ� ��������.
		File f1=new File("Ex03.java");// ��ü�ϱ�~ ���߿� ���� ����
								// �̷��� �ϸ� �������������� ã��. 
		File f2=new File("C:\\java\\eclipse\\workspace\\Round16_Exampels\\Ex02.java"); // \�ڿ� Ư������ ����� �νİ��� �׷��� \\ �÷λ��
		           // ������ �ҷ��ٰ� ��üȭ ��.
		
		File dir=new File("C:\\java\\eclipse\\workspace\\Round16_Exampels");
		File  f3=new File(dir,"Ex04");
		File f4=new File("C:\\java\\eclipse\\workspace\\Round16_Exampels","Ex05.java");
		//��� ������� ���
		
		File f5=new File("C:"+File.separator+"java\\eclipse\\workspace\\Round16_Exampels"); // �̷������� \\��ſ� File.separator�� ���������.
		
	}
}
