import java.io.*;
public class Ex05 {
	public	static void main(String ar[])throws IOException{
		FileOutputStream fos1=new FileOutputStream(FileDescriptor.out);// �ܼ����
		File f=new File("aaa.txt");	
		FileOutputStream fos2 =new FileOutputStream(f);				//���� ���  // �������� ���
		FileOutputStream fos3 =new FileOutputStream(f, true);				//���� ���  �������� �߰��ǰԲ� �����
		byte[] by=new byte[]{'h','l',' ','2','h','l',' ','2'};
		fos1.write(by); //�ܼ�â�� ��.
		fos2.write(by);
		fos1.write(by,2,4); //�ܼ�â�� ��. 2��° ~ 4����
		fos1.write(65); // char ���·� ��� A
		fos2.write(65);
	}
}
		
		