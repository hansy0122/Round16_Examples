import java.io.*;
public class Ex02 {
	public static void main(String ar[]){
		File f=new File("Ex01.java");// 존재하든 존재안하든 생성가능.
		File f1=new File("Ex03.java");// 객체니까~ 나중에 사용시 문제
								// 이렇게 하면 현제폴더에서만 찾음. 
		File f2=new File("C:\\java\\eclipse\\workspace\\Round16_Exampels\\Ex02.java"); // \뒤에 특수문자 적어야 인식가능 그래서 \\ 꼴로사용
		           // 파일을 불러다가 객체화 중.
		
		File dir=new File("C:\\java\\eclipse\\workspace\\Round16_Exampels");
		File  f3=new File(dir,"Ex04");
		File f4=new File("C:\\java\\eclipse\\workspace\\Round16_Exampels","Ex05.java");
		//사실 정석대로 라면
		
		File f5=new File("C:"+File.separator+"java\\eclipse\\workspace\\Round16_Exampels"); // 이런식으로 \\대신에 File.separator을 적어줘야함.
		
	}
}
