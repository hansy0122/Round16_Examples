import java.io.*;

public class Ex07 {
	public static void main(String ar[])throws IOException{
		FileInputStream fis1=new FileInputStream(FileDescriptor.in);
		FileInputStream fis2=new FileInputStream(new File("aaa.txt"));
		FileInputStream fis3=new FileInputStream(new File("bbb.txt"));
		
		
	/*	System.out.print("����=");
		
						char ch=(char)fis1.read(); // char ���·� ����
		
		System.in.read(); // ����ġ�� ó��.
		//System.in.read(); ��Ŭ���������� �ϳ��� �صδ�
		System.out.print("���ڿ�=");
		byte[] by=new byte[1024];  //byte ���·� ����.
		
		
								fis1.read(by);
		
		System.out.println("ch="+ch);
		System.out.println("by="+new String(by)); //.trim()�� ������� �ֱ����� �ٿ�����
													// char �迭�� String���� �ٲ㼭 ���
			fis1.close();	
								//
		
		
		while(true){             //���� �������� �̷��� �������·� �о�帮�°� ����.
			int x =fis2.read();  // �о�鿩�� int ������ ��ȯ (char)
					if(x==-1){ // ���Ͽ��� ���� -1���� �ȵ�����. ���� ������ �װ� ���� 
						break;
					}
			System.out.print((char)x);
		}*/
		
		System.out.println();
		byte bb[]=new byte[512];                  //read()�� �о�帮�� Ŀ���� �������� ���ִ°�ó�� �۵��ؼ� �ؿ��ִ��� read(bb)�� �۵����� 
		int i=fis2.read(bb);							//read(nn)�� Ŀ���� �Ǿ����� ������ �� �غ���. 
		for(int j=0;j<i;j++){
			System.out.print((char)bb[j]);
		}
		System.out.println(new String(bb));
		fis2.close();
		
		
	}
}	
