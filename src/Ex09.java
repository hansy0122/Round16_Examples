import java.io.*;
public class Ex09 {
	public static void main(String ar[])throws IOException{
		OutputStreamWriter osw=new OutputStreamWriter(System.out); // 2����Ʈ(�ؽ�Ʈ��Ʈ�� Ÿ���� ���鋚�� ) 1����Ʈ(System.out)�� �ݵ�� �ŰԺ����� ��������.
		BufferedWriter bw=new BufferedWriter(osw,1024);
		PrintWriter pw=new PrintWriter(bw);
		
		
		File f=new File("ccc.txt");
		FileWriter fw=new FileWriter(f);//���Ͽ� ���� ��°�ü ��Ʈ�� ���� 2����Ʈ ¥��
		BufferedWriter bw1=new BufferedWriter(fw,1024);
		PrintWriter pw1=new PrintWriter(bw1);
		
		
		
		pw.println(10);
		pw.println("test �ȳ��ϼ���");
		pw1.println(10);
		pw1.println("test �ȳ��ϼ���");
		pw.close();pw1.close();
		
		
		//2byte ����� 1byte ����� ������� ��.
		//�������� 1byte�� ��� ���/�Է��ϴ��� Ȥ�� �츮�� ���⽬�� Ÿ���� txt Ÿ������ ��/��� ���ִ��� ��!
		
		
		
		
		
	}
}
