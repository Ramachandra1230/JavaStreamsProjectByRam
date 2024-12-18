package ram.java8;

import java.util.ArrayList;
import java.util.List;

public class DuplicateIntergersForLoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[] { 10, 15, 8, 49, 25, 98, 98, 32, 15 };
		int[] arr1 = new int[] {11, 23, 43, 54, 67, 32, 43, 11};
		List<Integer> myList = new ArrayList<Integer>();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]==arr[j]) {
					myList.add(arr[i]);
				}
			}
		}
		System.out.println("duplicate integers using for loop***"+myList);

	}

}
