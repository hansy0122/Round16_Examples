import java.io.*;
public class Ex06 {
	public static void main(String ar[])throws IOException{
		//�ܼ�
		FileOutputStream fos1=new FileOutputStream(FileDescriptor.out);
		//���ۿ� ��Ҵٰ� ���
		BufferedOutputStream bos1=new BufferedOutputStream(fos1,2048);
		//������ �ƹ��ų� ��°����ϰ�����
		DataOutputStream dos1=new DataOutputStream(bos1);
		
		
		//����
		
		FileOutputStream fos2=new FileOutputStream(new File("bbb.txt"),false);
		//���ۿ� ��Ҵٰ� ���
		BufferedOutputStream bos2=new BufferedOutputStream(fos2,1024);
		//������ �ƹ��ų� ��°����ϰ�����
		DataOutputStream dos2=new DataOutputStream(bos2);
		//�÷����� close �����ʰ� ���۸� ����� �����Ͱ� ��µǰԲ� ����
		// �Ϲ���Ʈ�� �����ִ°� ó�� ����. ���߿� input ��Ʈ������ ������ ���������� ��Ÿ���Ե�.
	
		//1 ����Ʈ ���
		
		
		dos2.writeInt(20);
		dos2.writeByte('\n');
		dos2.writeDouble(12.24);
		dos2.flush();
		
		dos2.writeChar('a');
		dos2.writeInt(11);
		dos2.close();
		
		
	}
}
