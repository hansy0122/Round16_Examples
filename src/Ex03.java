import java.io.*;
import java.util.*;
 public class Ex03 {
	public static void main(String ar[]){
		File fff=new File("C:\\java\\eclipse\\workspace\\Round16_Exampels\\src");       //fff�� ���丮
		File f=new File("C:\\java\\eclipse\\workspace\\Round16_Exampels\\src\\Ex01.java");  //f�� ����
		String s[]=fff.list();
		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
		}
		
		File ffff[]=File.listRoots();
		for(int i=0;i<ffff.length;i++){
			System.out.println(i+"="+ffff[i]);
		}
		
		
		
		System.out.println(fff.isDirectory());
		System.out.println(f.isFile());
		System.out.println(f.isHidden()); //���� �����̳�
		System.out.println(new Date(f.lastModified())); //������������ ������
		System.out.println(f.length());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.exists());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.getName());
		System.out.println(f.getParentFile());
		System.out.println(f.getPath()); //name+parent
		
		
		File f1=new File("C:\\java\\eclipse\\workspace\\Round16_Exampels\\src\\aaa.txt");
		try{
			boolean bool=f1.createNewFile();
			System.out.println(bool);
			}catch(IOException e){
			
		}
		File ff=new File(".");
		try{
		File f2=File.createTempFile("temp", ".ksh",ff);
		System.out.println(f2);
		f2.deleteOnExit(); // ���α׷� ������ ����
		}catch(IOException e){}
		
		boolean bool1= f1.delete(); //��ٷ� ����
		System.out.println(bool1);
		
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){}
		
	}
}
