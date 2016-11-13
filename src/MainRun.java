import java.io.IOException;
	
	public class MainRun {
		public static void main(String[] args) throws IOException {
			Board board = new Board();
			while(true) {
				System.out.print("1.리스트보기 2.글쓰기 " + 				"3.글읽기 4.글수정 5.글삭제 6.종료 = ");
				int dist = System.in.read() - 48;
				System.in.read();
				System.in.read();
				if(dist == 1) board.list();
				else if(dist == 2) board.write();
				else if(dist == 3) board.read();
				else if(dist == 4) board.edit();
				else if(dist == 5) board.delete();
				else if(dist == 6) break;
				else System.out.println("잘못 입력!!");
			}		
			System.out.println("프로그램 종료!!!");
		}
	}

