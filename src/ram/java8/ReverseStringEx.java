package ram.java8;

public class ReverseStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "abcd";
		char ch[] = s.toCharArray();
		String rev="";
		
		for(int i=ch.length-1; i>=0; i--) {
			rev+=ch[i];
		}
		System.out.println("reverse a string....."+rev);
		

	}

}
