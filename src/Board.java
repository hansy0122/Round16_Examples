
	import java.io.*;
	import java.util.*;

	
	
	public class Board {
		private static File dir;
		private static BufferedReader in;
		private static Vector vc;
		static {
			dir = new File("c:\\java\\eclipse\\workspace\\Round16_Exampels\\board");
			if(!dir.exists()) dir.mkdir();
			in = new BufferedReader(new InputStreamReader(System.in));
			vc = new Vector();
		}	
		public void list() throws IOException {
			
			File[] files = dir.listFiles();
			if(files == null || files.length == 0) {
				System.out.println("데이터가 없습니다.");
			}
			else {
				for(int i = 0; i < files.length; i++) {
					BufferedReader br = new BufferedReader(
						new FileReader(files[i]));
					String title = br.readLine();
					String name = br.readLine();
					String date = br.readLine();
					System.out.print(i + 1 + " : ");
					System.out.print(title + "(" + name + ") : ");
					System.out.println(date);
					vc.add(files[i]);
					br.close();
				}	
			}
		}
		public void read() throws IOException {
			System.out.print("읽을 글 번호 = ");
			int num = Integer.parseInt(in.readLine());
			String file = (String)vc.elementAt(num - 1).toString();
			BufferedReader br = new BufferedReader(
									new FileReader(file));
			System.out.print("글제목 : ");
			System.out.println(br.readLine());
			System.out.print("작성자 : ");
			System.out.println(br.readLine());
			System.out.print("작성일 : ");
			System.out.println(br.readLine());
			System.out.println("내용 : ");
			StringBuffer sb = new StringBuffer();
			while(true) {
				String imsi = br.readLine();
				if(imsi == null) break;
				sb.append(imsi + "\n");						
			}
			System.out.println(sb.toString());
			br.close();		
		}
		public void write() throws IOException {
			System.out.print("글제목 : ");
			String title = in.readLine();
			System.out.print("작성자 : ");
			String name = in.readLine();
			java.util.Date udate = new java.util.Date();
			String date = udate.toString();
			System.out.print("내용('.'을 찍으면 입력이 끝납니다.) : ");
			StringBuffer sb = new StringBuffer();
			while(true) {
				String imsi = in.readLine();
				if(imsi != null && imsi.trim().length() == 1
						&& imsi.trim().charAt(0) == '.') {
					break;
				}
				if(imsi == null) imsi = "";
				sb.append(imsi + "\n");
			}
			File file = new File(dir, udate.getTime() + ".dat");
			PrintWriter out = new PrintWriter(
				new BufferedWriter(new FileWriter(file)));
			out.println(title);
			out.println(name);
			out.println(date);
			out.println(sb.toString());
			out.close();
		}
		public void delete() throws IOException {
			System.out.print("지울 글 번호 = ");
			int num = Integer.parseInt(in.readLine());
			System.out.print("정말 ?(y/n) ");
			char ch = (char)System.in.read();
			System.in.read();
			System.in.read();
			if(ch == 'y' || ch == 'Y') {
				File file = (File)vc.elementAt(num - 1);
				vc.removeElementAt(num - 1);			
				file.delete();			
			}
		}
		public void edit() throws IOException {
			System.out.print("수정할 글 번호 = ");
			int num = Integer.parseInt(in.readLine());
			String file = (String)vc.elementAt(num - 1).toString();
			BufferedReader br = new BufferedReader(
									new FileReader(file));
			System.out.print("글제목 : ");
			String title = br.readLine();
			System.out.println(title);
			System.out.print("수정할 글제목 : ");
			String imsititle = in.readLine();
			if(imsititle == null || imsititle.trim().length() == 0) {
				imsititle = title;
			}
			String name = br.readLine(); 
			String date = br.readLine();
			StringBuffer sb = new StringBuffer();
			while(true) {
				String imsi = br.readLine();
				if(imsi == null) break;
				sb.append(imsi + "\n");						
			}
			System.out.println(sb.toString());
			br.close();
			System.out.print("수정할 내용 : ");
			sb = new StringBuffer();
			while(true) {
				String imsi = in.readLine();
				if(imsi != null && imsi.trim().length() == 1
					&& imsi.trim().charAt(0) == '.') break;
				sb.append(imsi + "\n");
			}
			PrintWriter out = new PrintWriter(
				new BufferedWriter(new FileWriter(file)));
			out.println(imsititle);
			out.println(name);
			out.println(date);
			out.println(sb.toString());
			out.close();
		}	
	}


	


