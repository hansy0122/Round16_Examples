import java.io.*;
public class Ex10 {
	public static void main(String ar[]) throws IOException{
		InputStreamReader	isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr); // �ܼ�
		
		File f=new File("ccc.txt");
		FileReader fr=new FileReader(f);
		BufferedReader br1=new BufferedReader(fr);
		
		
		System.out.print("����=");
		String str=br.readLine();
		System.out.print(str);

		System.out.print("����=");
		int x=Integer.parseInt(br.readLine());
		System.out.print(x);
		
		System.out.println("============================");
		
		
		/*������ --> �������ִ��� �𸥴� ���ѷ��� 
			--> ������ �ִ��� �ȴ� --> �ڷ��� �����Ŀ� go
		*/
		
		
		while(true){
			String s=br1.readLine(); // file �� �ִ� ���� ���� ���پ� �о�帮�°��Դϴ�.
			if(s==null)break;
			System.out.println(s);
		}
		
		br.close();
		br1.close();
		
	}
}
