import java.io.*;
import java.util.*;
public class Ex04 {
public static void main(String ar[]){
	File f=new File("aaa");
	f.mkdir(); //폴더 생성
	File ff=new File("bbb/ccc/ddd/fff/eee");
	ff.mkdirs(); //복수 폴더생성
	f.setLastModified(new Date().getTime());
	ff.setLastModified(new Date().getTime());
	
	
	f.setReadOnly();
}
}
