import java.io.*;
public class Ex01 {
	public static void main(String ar[]){
		String a=File.pathSeparator;
		char b=File.pathSeparatorChar; // 이렇게 명명해야지 윈도우 리눅스 아무곳에서나 사용가능
		String c=File.separator;     //java.io에 있는 녀석들
		char d=File.separatorChar;    // static이라서 클래스 명으로 접근가능
	
		System.out.println(a);
		System.out.println(b); // path 구분자
		System.out.println(c);
		System.out.println(d); // 파일단위 구분자
	
	
	
	
	}

}
