package result;

public class Main {
	
		static int a = 4;
		
		Main(){
			a = 10;
			
		}
		void func() {
			a =a+1;
			System.out.println(a);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m = new Main();
		m.func();
	}
}
	