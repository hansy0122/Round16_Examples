	import java.io.*;
public class Ex15 implements Serializable{
		//�̸� �ֹ� ��ȭ �ּ� ���۸��� �� 
		private String name="";
		private String jumin="";
		private String tel="";
		private String adr="";
		private static transient BufferedReader in;
		static {
			in=new BufferedReader(new InputStreamReader(System.in));
		}
		
		//������+�Է�
		public Ex15()throws IOException{
			System.out.print("name=");
			name=in.readLine();
			
			System.out.print("jumin=");
			jumin=in.readLine();
			
			System.out.print("tel=");
			tel=in.readLine();
			
			System.out.print("adr=");
			adr=in.readLine();
		}
		
		//���
		public void disp(){
			System.out.print(name+"\t"+jumin+"\t"+tel+"\t"+adr+"\n");
		}
		
		public static void main(String ar[])throws IOException{
			Ex15 ex=new Ex15();
			ex.disp();
			
		}

	}


