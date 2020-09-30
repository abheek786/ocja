package practice;

/**
 * PracticeQuestion5 tests equalIgnoreCase(String) knowledge.
 * 
 * @author abheek.srivastava
 *
 */
public class PracticeQuestion5 {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("java");
		
		if(s1.equalsIgnoreCase(s2)) { // doesn't care about case
			System.out.println("Equal");
		}else {
			System.out.println("Not Equal");
		}
	}

}
