package java;

import java.util.Scanner;

public class Array_1D_2 {
	public static boolean canWin(int leap, int[] game) {
		boolean rs = true;
		while (rs) {
			// forπÆ Ω√¿€
			for (int i = 0; i < game.length; i++) {
				if (game[i] == 0 && i + leap >= game.length) {
					return true;
				}
				for (int j = 1; j < game.length; j++) {
					if (i + leap * j < game.length && i + leap * (j + 1) < game.length
							&& game[i + leap * (j + 1)] == 0 && i + leap * (j + 2) >= game.length) {
						return true;
					}
				}
			}
			rs=false;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		while (q-- > 0) {
			int n = scan.nextInt();
			int leap = scan.nextInt();

			int[] game = new int[n];
			for (int i = 0; i < n; i++) {
				game[i] = scan.nextInt();
			}
			System.out.println((canWin(leap, game)) ? "YES" : "NO");
		}
		scan.close();

	}

}
