import java.io.*;

public class Ex07 {
	public static void main(String ar[])throws IOException{
		FileInputStream fis1=new FileInputStream(FileDescriptor.in);
		FileInputStream fis2=new FileInputStream(new File("aaa.txt"));
		FileInputStream fis3=new FileInputStream(new File("bbb.txt"));
		
		
	/*	System.out.print("문자=");
		
						char ch=(char)fis1.read(); // char 형태로 받음
		
		System.in.read(); // 엔터치값 처리.
		//System.in.read(); 이클립스에서는 하나만 해두댐
		System.out.print("문자열=");
		byte[] by=new byte[1024];  //byte 형태로 받음.
		
		
								fis1.read(by);
		
		System.out.println("ch="+ch);
		System.out.println("by="+new String(by)); //.trim()을 공백없에 주기위해 붙여도댐
													// char 배열을 String으로 바꿔서 출력
			fis1.close();	
								//
		
		
		while(true){             //파일 읽을떄는 이렇게 무한형태로 읽어드리는게 보통.
			int x =fis2.read();  // 읽어들여서 int 값으로 반환 (char)
					if(x==-1){ // 파일에는 원래 -1값이 안들어가야함. 파일 끝에만 그게 가능 
						break;
					}
			System.out.print((char)x);
		}*/
		
		System.out.println();
		byte bb[]=new byte[512];                  //read()로 읽어드리면 커서가 마지막에 가있는거처럼 작동해서 밑에있느느 read(bb)가 작동안함 
		int i=fis2.read(bb);							//read(nn)는 커서를 맨앞으로 돌리는 듯 해보임. 
		for(int j=0;j<i;j++){
			System.out.print((char)bb[j]);
		}
		System.out.println(new String(bb));
		fis2.close();
		
		
	}
}	
