import java.io.*;
public class Ex08 {
	public static void main(String ar[])throws IOException{
		File f= new File("bbb.txt");
		FileInputStream fis =new FileInputStream(f);
		BufferedInputStream bis= new BufferedInputStream(fis,1024);
		DataInputStream dis =new DataInputStream(bis);
		
		
		while(true){
			int x=dis.read();
			if(x==-1){
				break;
			}
			System.out.print(x);
		}                               // �̷��� �ϸ� ����ȯ�� �ȵǼ� �׳� ������ ������ �ɻ���.
										// ��� �̷��� ��� ����. 
										// �Ʒ��� �����ϴ°� ��������.
		
		
		
		/*int a=dis.readInt();
		byte b=dis.readByte();
		double c=dis.readDouble();
		char d=dis.readChar();
		int e=dis.readInt();
		
		dis.close();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);*/
				
	}
}
