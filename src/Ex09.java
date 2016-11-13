import java.io.*;
public class Ex09 {
	public static void main(String ar[])throws IOException{
		OutputStreamWriter osw=new OutputStreamWriter(System.out); // 2바이트(텍스트스트림 타입을 만들떄는 ) 1바이트(System.out)을 반드시 매게변수로 삼아줘야함.
		BufferedWriter bw=new BufferedWriter(osw,1024);
		PrintWriter pw=new PrintWriter(bw);
		
		
		File f=new File("ccc.txt");
		FileWriter fw=new FileWriter(f);//파일에 대한 출력객체 스트림 생성 2바이트 짜리
		BufferedWriter bw1=new BufferedWriter(fw,1024);
		PrintWriter pw1=new PrintWriter(bw1);
		
		
		
		pw.println(10);
		pw.println("test 안녕하세요");
		pw1.println(10);
		pw1.println("test 안녕하세요");
		pw.close();pw1.close();
		
		
		//2byte 출력은 1byte 출력을 기반으로 함.
		//차이점은 1byte씩 끊어서 출력/입력하느냐 혹은 우리가 보기쉬운 타입인 txt 타입으로 입/출력 해주느냐 임!
		
		
		
		
		
	}
}
