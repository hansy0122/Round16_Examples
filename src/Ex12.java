import java.io.*;
import java.util.*;
public class Ex12 {
	public static void main(String  ar[])throws IOException{
		if(ar.length<1)System.exit(0);
		
		int sum=0;
		double avg=0.0;
		
		String str="";
		for(int i=0;i<ar.length;i++){
			str+=ar[i]+" ";
		}
		System.out.println(str);
		
		
		int i=0;
		Scanner in=new Scanner(str);
		while(in.hasNextInt()){
			i++;
			sum=sum+in.nextInt();
		}
		avg=(double)(sum/ar.length);
		System.out.println("����="+i);
		System.out.println("��="+sum);
		System.out.println("���="+avg);
	}	
}
///////////////////////////////////// ��ĳ�ʸ� ����ϰ� �Ǹ� �����̶�� �����ڰ� �⺻ �����ڷ� ���� �۵��ϰԵ� //////////////