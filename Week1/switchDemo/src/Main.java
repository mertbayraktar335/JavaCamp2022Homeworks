public class Main {
    public static void main(String[] args) throws Exception {
        char grade = 'A';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena değil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Malesef kaldınız");
			break;

		default:
			System.out.println("Geçersiz not");
			break;
		}

    }
}