package pack1.patterns;

public class ASCIIPRogramming {

	public static void main(String[] args) {

		for (int i = 0; i <= 256; i++) {

			System.out.print(i+ " :");
			System.out.format("%2C", i);
			System.out.println();
		}
	}

}
