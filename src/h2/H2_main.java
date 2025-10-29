package h2;

public class H2_main {

	public static void main(String[] args) {
		int i = 7, j = 42, k = 625, min = 0, max = 999 ;
		
		if (i>j && i>k) {
			max = i ;
		}
		
		if (j>i && j>k) {
			 max = j ;
		}
		
		if (k>j && k>i) {
			max = k ;
		}
		
		if (i<j && i<k) {
			min = i ;
		}
		
		if (j<i && j<k) {
			 min = j ;
		}
		
		if (k<j && k<i) {
			min = k ;
		}
		
		System.out.println("min hat Wert: " + min);
		System.out.println("max hat Wert: " + max);
	}

}
