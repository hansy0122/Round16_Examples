import java.io.*;
public class Ex05 {
	public	static void main(String ar[])throws IOException{
		FileOutputStream fos1=new FileOutputStream(FileDescriptor.out);// 콘솔출력
		File f=new File("aaa.txt");	
		FileOutputStream fos2 =new FileOutputStream(f);				//파일 출력  // 기존값을 덮어씀
		FileOutputStream fos3 =new FileOutputStream(f, true);				//파일 출력  기존값에 추가되게끔 사용함
		byte[] by=new byte[]{'h','l',' ','2','h','l',' ','2'};
		fos1.write(by); //콘솔창에 뜸.
		fos2.write(by);
		fos1.write(by,2,4); //콘솔창에 뜸. 2번째 ~ 4개만
		fos1.write(65); // char 형태로 출력 A
		fos2.write(65);
	}
}
		
		