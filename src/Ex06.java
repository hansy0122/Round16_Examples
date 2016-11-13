import java.io.*;
public class Ex06 {
	public static void main(String ar[])throws IOException{
		//콘솔
		FileOutputStream fos1=new FileOutputStream(FileDescriptor.out);
		//버퍼에 담았다가 출력
		BufferedOutputStream bos1=new BufferedOutputStream(fos1,2048);
		//데이터 아무거나 출력가능하게해줌
		DataOutputStream dos1=new DataOutputStream(bos1);
		
		
		//파일
		
		FileOutputStream fos2=new FileOutputStream(new File("bbb.txt"),false);
		//버퍼에 담았다가 출력
		BufferedOutputStream bos2=new BufferedOutputStream(fos2,1024);
		//데이터 아무거나 출력가능하게해줌
		DataOutputStream dos2=new DataOutputStream(bos2);
		//플러쉬는 close 하지않고 버퍼를 비워서 데이터가 출력되게끔 해줌
		// 일바이트라서 깨져있는거 처럼 보임. 나중에 input 스트림으로 읽으면 정상적으로 나타나게됨.
	
		//1 바이트 출력
		
		
		dos2.writeInt(20);
		dos2.writeByte('\n');
		dos2.writeDouble(12.24);
		dos2.flush();
		
		dos2.writeChar('a');
		dos2.writeInt(11);
		dos2.close();
		
		
	}
}
