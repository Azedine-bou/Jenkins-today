package BeginnProgramming;

public class Kapitel_Eins {

	public static void main(String[] args) {
	    int rows = 5, k = 0;
        for(int i = 1; i <= rows; ++i,k=0) {
            for(int space = 5; space >= rows - i; --space) {
                System.out.print("      ");
            }
            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
		
	
		
	}
	public static int fakulteat(int n) {
		int fakulteat=1;
		if (n<=0) {
		
			return 1;
		}else {
			for(int i= 1; i<n;i++) {
				fakulteat = n*fakulteat(n-1);
		}
		}
		
		return fakulteat ;
	}
}
