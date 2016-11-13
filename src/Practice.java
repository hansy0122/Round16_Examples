import java.io.*;
import java.util.*;
public class Practice {
	public static void main(String ar[])throws IOException{
		
		//////////////////////////////////////1byte/////////////////////////////////////////
		//콘솔 출력 1byte
		FileOutputStream fos=new FileOutputStream(FileDescriptor.out);
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		
		//콘솔 입력 1byte
		FileInputStream fis=new FileInputStream(FileDescriptor.in);
		BufferedInputStream bis=new BufferedInputStream(fis);
		DataInputStream dis=new DataInputStream(bis);
		
		
		//파일 출력 1byte
		File file=new File("aaaa.txt");
		FileOutputStream fos1=new FileOutputStream(file);
		BufferedOutputStream bos1=new BufferedOutputStream(fos1);
		DataOutputStream dos1=new DataOutputStream(bos1);
		
		//파일 입력 1byte
		File file1=new File("zzz.txt");
		FileInputStream fis1=new FileInputStream(file1);
		BufferedInputStream bis1=new BufferedInputStream(fis1);
		DataInputStream dis1=new DataInputStream(bis1);
		
//////////////////////////////////////객체/////////////////////////////////////////
		
//파일 출력 객체
		File file2=new File("hhh.txt");
		FileOutputStream fos2=new FileOutputStream(file2);
		BufferedOutputStream bos2=new BufferedOutputStream(fos2);
		ObjectOutputStream oos=new ObjectOutputStream(bos2);


//파일 입력 객체
		File file3=new File("ggg.txt");
		FileInputStream fis3=new FileInputStream(file3);
		BufferedInputStream bis3=new BufferedInputStream(fis3);
		ObjectInputStream ois=new ObjectInputStream(bis3);


		

//////////////////////////////////////2byte/////////////////////////////////////////
		
		//콘솔 출력 2byte
		OutputStreamWriter osw=new OutputStreamWriter(System.out);
		BufferedWriter bw=new BufferedWriter(osw);
		PrintWriter pw=new PrintWriter(bw);
		pw.println("");
		
		//콘솔 입력 2byte
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		br.readLine();
		
		//파일 출력 2byte
		File file4=new File("qwd.txt");
		FileWriter fw=new FileWriter(file4);
		BufferedWriter bw1=new BufferedWriter(fw);
		PrintWriter pw1=new PrintWriter(bw1);
		
		
		//파일입력 2byte
		File file5=new File("qwdqw.txt");
		FileReader fr=new FileReader(file5);
		//BufferedReader br=new BufferedReader(fr);
		
	}
}
