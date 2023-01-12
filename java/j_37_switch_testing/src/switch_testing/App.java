package switch_testing;

public class App {

	public static void main(String[] args) {
		
	    switch(args.length) {
	    
	        case 0: // aucun argument n'a été envoyé
	        	
	            sayHelloTo("world");
	            
	            break;
	            
	        case 1: // l'utilisateur a fourni un argument dans le terminal
	        	
	            sayHelloTo(args[0]);
	            
	            break;
	            
	        case 2: // l'utilisateur a fourni 2 arguments
	        	
	            sayHelloTo(args[0] + "-" + args[1]);
	            
	            break;
	            
	        default: // l'utilisateur a fourni plus d'arguments qu'on peut en gérer !
	        	
	            System.out.println("Sorry, I don't know how to manage more than 2 names!");
	    }
	}

	private static void sayHelloTo(String string) {

		System.out.println("Hello " + string + "!");
	}

}
