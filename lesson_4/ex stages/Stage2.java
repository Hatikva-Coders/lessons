public class Stage2 {

    public static void main(String [] args) {
		String password;
		int a=-7;
		int b=2;
		char some_character = 'w';
		boolean shouldContinue = true;
		
		
		while (  shouldContinue ){
			if ( a > 0 ){
				some_character = 'a';
			}
			else {
				a = a+3;
				b = a - b +1;
			}
			
			if ( some_character == 'w' && !(b<0) ){
				some_character = 'd';
				shouldContinue = !shouldContinue;
			}
			
			if ( a < b ){
				shouldContinue = true;
				some_character = 'w';
			}
			
			if ( some_character=='a' ){
				some_character = 't';
				shouldContinue = !shouldContinue;
				b = 1000;
			}
		}
		
		
		password = "P" + some_character + a + "!" + b;
	}

}