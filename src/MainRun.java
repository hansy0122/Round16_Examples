import java.io.IOException;
	
	public class MainRun {
		public static void main(String[] args) throws IOException {
			Board board = new Board();
			while(true) {
				System.out.print("1.����Ʈ���� 2.�۾��� " + 				"3.���б� 4.�ۼ��� 5.�ۻ��� 6.���� = ");
				int dist = System.in.read() - 48;
				System.in.read();
				System.in.read();
				if(dist == 1) board.list();
				else if(dist == 2) board.write();
				else if(dist == 3) board.read();
				else if(dist == 4) board.edit();
				else if(dist == 5) board.delete();
				else if(dist == 6) break;
				else System.out.println("�߸� �Է�!!");
			}		
			System.out.println("���α׷� ����!!!");
		}
	}

