package test;

abstract class AnonymousInner {
	   public abstract void mymethod();
	}

	public class Anonym {

	   public static void main(String args[]) {
	      AnonymousInner inner = new AnonymousInner() {
	         public void mymethod() {
	            System.out.println("This is an example of anonymous inner class");
	         }
	      };
	      inner.mymethod();	
	   }
	}

	/*It is used when you want to override method of unknown class,
	 * In above example declared inner class anonymous */
	
	