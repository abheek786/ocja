package practice;

/**
 * PracticeQuestion2 tests trim() knowledge along with String immutable properties.
 * 
 * @author abheek.srivastava
 *
 */
public class PracticeQuestion2 {

	public static void main(String[] args) {
		String str = " ";
		
		str.trim(); // there will be no change on str since String objects are immutable
		
		System.out.println(str.equals("")+" "+str.isEmpty()); // false false
	}

}
