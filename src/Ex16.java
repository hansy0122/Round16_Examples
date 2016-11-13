import java.io.*;
	import java.util.*;
public class Ex16 {
		public static void main(String ar[])throws ClassNotFoundException,IOException{
			
			// 담을 공간들 생성
			File file=new File("C:\\java\\eclipse\\workspace\\Round16_Exampels\\src\\myfriends.txt");
			
			// 여러개의 객체를 담을 vector 생성
			Vector vc=new Vector();
			
			//이미 존재하고 있는 파일을 읽어드리기
			if(file.exists()){
				FileInputStream fis=new FileInputStream(file);
				BufferedInputStream bis=new BufferedInputStream(fis);
				ObjectInputStream ois=new ObjectInputStream(bis);
				vc=(Vector)ois.readObject();
				ois.close();
			}
			
			//친구 목록기 생성해서 돌리기
			
			while(true){
				System.out.print("1.친구등록 2.전체보기 3.종료");
				int x=System.in.read()-48;
				System.in.read();
				System.in.read();
				
				
				if(x==1){
					Ex15 ps=new Ex15();
					vc.add(ps);
					System.out.println("친구 한명을 등록했습니다.");
				}
				else if(x==2){
					for(int i=0;i<vc.size();i++){
						Ex15 imsi= (Ex15) vc.elementAt(i);
						imsi.disp();	
					}
					
				}
				else if(x==3){
					System.out.println("시스템을 종료합니다");
					FileOutputStream fos=new FileOutputStream(file);
					BufferedOutputStream bos=new BufferedOutputStream(fos);
					ObjectOutputStream oos=new ObjectOutputStream(bos);
					oos.writeObject(vc);
					oos.close();
					System.exit(0);
					
				}
				else{
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				}
				
			}
		}
}
