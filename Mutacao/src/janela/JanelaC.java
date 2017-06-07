package janela;
import java.util.Scanner;


public class JanelaC {
	public static int calculaJanela(int p1, int p2, int p3) {
        
		int t = 0;
		
        if (p3 < p2) { t = p3; p3 = p2; p2 = t; }
        if (p2 < p1) { t = p2; p2 = p1; p1 = t; }
        if (p3 < p2) { t = p3; p3 = p2; p2 = t; }
        if (p1 > p2 || p2 > p3) return 1;

	    if (p3 - p1 <= 200) {
	        return 100 * (400 - p3 + p1);
	    } else if (p2 - p1 <= 200 && p3 - p2 <= 200) {
	        return 100 * (400 - p3 + p1);
	    } else if (p2 - p1 <= 200 && p3 - p2 > 200) {
	        return 100 * (200 - p2 + p1);
	    } else if (p3 - p2 <= 200 && p2 - p1 > 200) {
	        return 100 * (200 - p3 + p2);
	    } else {
	        return 0;
	    }
	    
	}

	public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
        int posFolha1 = scanner.nextInt();
        int posFolha2 = scanner.nextInt();
        int posFolha3 = scanner.nextInt();
        
        scanner.close();
    	
        System.out.println(JanelaC.calculaJanela(posFolha1, posFolha2, posFolha3));	

    }
}
