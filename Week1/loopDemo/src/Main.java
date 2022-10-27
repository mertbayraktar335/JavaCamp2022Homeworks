public class Main {
    public static void main(String[] args) throws Exception {
        //For
		for (int i = 0; i < 10; i+=4) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti");
		
		//While
		int i = 2;
		while (i<10) {
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti");
		
		//Do while
		i = 1;
		do {
			System.out.println(i);
			i+=2;
		} while (i < 10);
		System.out.println("Do-While Döngüsü Bitti");
	}
    }

