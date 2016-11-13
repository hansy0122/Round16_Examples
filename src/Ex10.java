import java.io.*;
public class Ex10 {
	public static void main(String ar[]) throws IOException{
		InputStreamReader	isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr); // 콘솔
		
		File f=new File("ccc.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br1=new BufferedReader(fr);
		
		
		System.out.print("문자=");
		String str=br.readLine();
		System.out.print(str);

		System.out.print("숫자=");
		int x=Integer.parseInt(br.readLine());
		System.out.print(x);
		
		System.out.println("============================");
		
		
		/*파일은 --> 무엇이있는지 모른다 무한루프 
			--> 무엇이 있는지 안다 --> 자료형 설정후에 go
		*/
		
		
		while(true){
			String s=br1.readLine(); // file 에 있는 것을 한줄 한줄씩 읽어드리는것입니다.
			if(s==null)break;
			System.out.println(s);
		}
		
		br.close();
		br1.close();
		
	}
}
