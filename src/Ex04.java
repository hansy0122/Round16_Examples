import java.io.*;
import java.util.*;
public class Ex04 {
public static void main(String ar[]){
	File f=new File("aaa");
	f.mkdir(); //���� ����
	File ff=new File("bbb/ccc/ddd/fff/eee");
	ff.mkdirs(); //���� ��������
	f.setLastModified(new Date().getTime());
	ff.setLastModified(new Date().getTime());
	
	
	f.setReadOnly();
}
}
