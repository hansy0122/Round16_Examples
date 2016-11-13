import java.io.*;
class AAA implements Serializable{ //Serializable은 객체를 직렬화 시키는 인터페이스
	int x=100;
	int y=200;
	int z=300;
}
public class Ex13 {
// 객체 직렬화 --> 저장과 전송에 용이한 형태로 변환시키는것
	
			public static void main(String ar[])throws IOException{
				AAA ap=new AAA();
				
				File f=new File("ddd.txt");
				FileOutputStream fos=new FileOutputStream(f);
				BufferedOutputStream bos=new BufferedOutputStream(fos,1024);
				ObjectOutputStream oos=new ObjectOutputStream(bos); //물론 다른거도 다되지만 객체 출력이 가장중요
				
				
				ap.z=400;
				
				oos.writeObject(ap);
				
				oos.close();
				
				
				System.out.println("끝");
			}
	
}
