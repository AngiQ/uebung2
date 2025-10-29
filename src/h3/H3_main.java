package h3;

public class H3_main {

	public static void main(String[] args) {
		int i = 225 , j = 152 , k = -10 ;
		boolean a1, a2, a3 ;
		a1 = (i>j) ;
		a2 = (i>200) ;
		a3 = (j>100) ;
		
		if (a1 && !a2 && !a3) {
			k = 1 ;
		}
		
		if (a1 && a2 && !a3) {
			k = 2 ;
		}

		if (a1 && a2 && a3) {
			k = 3 ;
		}

		if (!a1 && !a2 && !a3) {
			k = 4 ;
		}
		
		System.out.println("K hat Wert:" + k);
		
	}

}
