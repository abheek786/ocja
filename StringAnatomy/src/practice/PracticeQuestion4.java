package practice;

/**
 * PracticeQuestion4 test trim() and String immutble property knowledge.
 * 
 * @author abheek.srivastava
 *
 */
public class PracticeQuestion4 {

	public static void main(String[] args) {
		String s = "Hello World";
		
		s.trim(); // trim() removes only leading and trailing whitespace also this will lead to no change 
		          // since String objects are immutable
		
		int i1 = s.indexOf(" ");
		
		System.out.println(i1); // 5

	}

}
