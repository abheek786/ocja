package practice;

/**
 * PracticeQuestion3 tests trims() knowledge.
 * 
 * @author abheek.srivastava
 *
 */
public class PracticeQuestion3 {

	public static void main(String[] args) {
		String s = "Abheek Srivastava";
		
		int len = s.trim().length(); // trim() removes only leading and trailing white spaces
		
		System.out.println(len); // 17
	}

}
