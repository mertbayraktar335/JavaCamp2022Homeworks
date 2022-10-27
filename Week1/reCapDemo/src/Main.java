public class Main {
    public static void main(String[] args) throws Exception {
        int sayi1 = 20;
		int sayi2 = 36;
		int sayi3 = 48;
		int enBuyuk = sayi1;
		if (enBuyuk < sayi2) {
			enBuyuk = sayi2;
		} 
		if(enBuyuk < sayi3) {
			enBuyuk = sayi3;
		}
		
		System.out.println("En büyük = "+ enBuyuk);
    }
}
