package practice;

/**
 * PracticeQuestion1 verifies the String immutable nature i.e. if the String objects are created, there contents 
 * cannot be changed. If the content of the String objects are modified then a new object is created.
 * 
 * @author abheek.srivastava
 *
 */
public class PracticeQuestion1 {

	public static void main(String[] args) {
		String ta = "A";
		
		ta = ta.concat("B");  // AB
		
		String tb = "C";
		
		ta = ta.concat(tb); // ABC
		
		ta.replace('C', 'D');  // A new object will be created with content ABD but there is  
		                       // no reference variable therefore it's eligible for garbage collection 
		
		ta = ta.concat(tb); // ABCC
		
		System.out.println(ta);
	}

}
