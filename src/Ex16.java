import java.io.*;
	import java.util.*;
public class Ex16 {
		public static void main(String ar[])throws ClassNotFoundException,IOException{
			
			// ���� ������ ����
			File file=new File("C:\\java\\eclipse\\workspace\\Round16_Exampels\\src\\myfriends.txt");
			
			// �������� ��ü�� ���� vector ����
			Vector vc=new Vector();
			
			//�̹� �����ϰ� �ִ� ������ �о�帮��
			if(file.exists()){
				FileInputStream fis=new FileInputStream(file);
				BufferedInputStream bis=new BufferedInputStream(fis);
				ObjectInputStream ois=new ObjectInputStream(bis);
				vc=(Vector)ois.readObject();
				ois.close();
			}
			
			//ģ�� ��ϱ� �����ؼ� ������
			
			while(true){
				System.out.print("1.ģ����� 2.��ü���� 3.����");
				int x=System.in.read()-48;
				System.in.read();
				System.in.read();
				
				
				if(x==1){
					Ex15 ps=new Ex15();
					vc.add(ps);
					System.out.println("ģ�� �Ѹ��� ����߽��ϴ�.");
				}
				else if(x==2){
					for(int i=0;i<vc.size();i++){
						Ex15 imsi= (Ex15) vc.elementAt(i);
						imsi.disp();	
					}
					
				}
				else if(x==3){
					System.out.println("�ý����� �����մϴ�");
					FileOutputStream fos=new FileOutputStream(file);
					BufferedOutputStream bos=new BufferedOutputStream(fos);
					ObjectOutputStream oos=new ObjectOutputStream(bos);
					oos.writeObject(vc);
					oos.close();
					System.exit(0);
					
				}
				else{
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				}
				
			}
		}
}
