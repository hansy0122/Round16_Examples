import java.io.*;
public class Ex14 {
	public static void main(String ar[]) throws IOException{
// �Է¹޴°� ��¹޴°� ��� class AAA�� �־�������� ������ ���� �������� �����Ƿ� (package) AAA ��� ����		
		
		File f=new File("ddd.txt"); //���� ��ü������ ���ٱ��� ����
		FileInputStream fis=new FileInputStream(f);         //f�� ���� ��Ʈ�� ���ѻ���
		BufferedInputStream bis=new BufferedInputStream(fis,1024);
		ObjectInputStream ois=new ObjectInputStream(bis);  //������Ʈ�� �аڴ�.
		
		
		
		Object obj=null;
		
		try{
			obj=ois.readObject();
			
		}catch(ClassNotFoundException e){}
		AAA ap=(AAA) obj;
		
		System.out.println(ap.x);
		System.out.println(ap.y);
		System.out.println(ap.z);
		
	}
}
