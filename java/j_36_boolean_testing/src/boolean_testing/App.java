package boolean_testing;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// test booleans 1
		if (args.length == 1) {
			
	        sayHelloTo(args[0]);
	        
	    } else if (args.length == 2) {
	    	
	        sayHelloTo(args[0] + "-" + args[1]);
	        
	    } else if (args.length == 3) {
	    	
	        sayHelloTo(args[0] + "-" + args[1] + "-" + args[2]);
	        
	    } else {
	    	
	        sayHelloTo("world");
	    }
	}

	private static void sayHelloTo(String string) {
		
		System.out.println("Hello " + string + "!");
	}

}
