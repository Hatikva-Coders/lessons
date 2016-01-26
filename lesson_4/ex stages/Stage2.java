public class Stage2 {

    public static void main(String [] args) {
		
		int password;
		int a=2;
		int b=1;
		
		while (  a <= 4*b ){
			if ( (2*b-a)%3<2 ){
				a = a+1;
			}
			b = b+1;
			if ( !(a>=b) ){
				a = (a*3)/2;
			}
			a = a + 5;
		}
		
		
		password = a+b;
	}

}