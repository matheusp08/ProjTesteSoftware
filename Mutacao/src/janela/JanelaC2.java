package janela;

public class JanelaC2 {
	public static int calculaJanela(int p1, int p2, int p3) {
	    
	    if (p3 - p1 < 200) {
	        return 100 * (400 - p3 + p1);
	    } else if (p2 - p1 < 200 && p3 - p2 < 200) {
	    	return 100 * (400 - p3 + p1);
	    } else if (p2 - p1 < 200 && p3 - p2 > 200) {
	    	return 100 * (200 - p2 + p1);
	    } else if (p3 - p2 < 200 && p2 - p1 > 200) {
	    	return 100 * (200 - p3 + p2);
	    } else {
	        return 0;
	    }
	    
	}
}
