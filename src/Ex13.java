import java.io.*;
class AAA implements Serializable{ //Serializable�� ��ü�� ����ȭ ��Ű�� �������̽�
	int x=100;
	int y=200;
	int z=300;
}
public class Ex13 {
// ��ü ����ȭ --> ����� ���ۿ� ������ ���·� ��ȯ��Ű�°�
	
			public static void main(String ar[])throws IOException{
				AAA ap=new AAA();
				
				File f=new File("ddd.txt");
				FileOutputStream fos=new FileOutputStream(f);
				BufferedOutputStream bos=new BufferedOutputStream(fos,1024);
				ObjectOutputStream oos=new ObjectOutputStream(bos); //���� �ٸ��ŵ� �ٵ����� ��ü ����� �����߿�
				
				
				ap.z=400;
				
				oos.writeObject(ap);
				
				oos.close();
				
				
				System.out.println("��");
			}
	
}
