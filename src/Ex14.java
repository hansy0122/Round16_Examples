import java.io.*;
public class Ex14 {
	public static void main(String ar[]) throws IOException{
// 입력받는곳 출력받는곳 모두 class AAA가 있어야하지만 지금은 같은 폴더내에 있으므로 (package) AAA 없어도 ㄱㅊ		
		
		File f=new File("ddd.txt"); //파일 객체에대한 접근권한 생성
		FileInputStream fis=new FileInputStream(f);         //f에 대한 스트림 권한생성
		BufferedInputStream bis=new BufferedInputStream(fis,1024);
		ObjectInputStream ois=new ObjectInputStream(bis);  //오브젝트를 읽겠다.
		
		
		
		Object obj=null;
		
		try{
			obj=ois.readObject();
			
		}catch(ClassNotFoundException e){}
		AAA ap=(AAA) obj;
		
		System.out.println(ap.x);
		System.out.println(ap.y);
		System.out.println(ap.z);
		
	}
}
