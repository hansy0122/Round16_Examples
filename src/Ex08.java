import java.io.*;
public class Ex08 {
	public static void main(String ar[])throws IOException{
		File f= new File("bbb.txt");
		FileInputStream fis =new FileInputStream(f);
		BufferedInputStream bis= new BufferedInputStream(fis,1024);
		DataInputStream dis =new DataInputStream(bis);
		
		
		while(true){
			int x=dis.read();
			if(x==-1){
				break;
			}
			System.out.print(x);
		}                               // 이렇게 하면 형변환이 안되서 그냥 숫자의 나열이 될뿐임.
										// 사실 이렇게 출력 안함. 
										// 아래와 같이하는게 보통이지.
		
		
		
		/*int a=dis.readInt();
		byte b=dis.readByte();
		double c=dis.readDouble();
		char d=dis.readChar();
		int e=dis.readInt();
		
		dis.close();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);*/
				
	}
}
