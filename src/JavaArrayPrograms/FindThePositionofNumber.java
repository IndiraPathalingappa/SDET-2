package JavaArrayPrograms;

import java.util.LinkedHashSet;

public class FindThePositionofNumber {
	
	public static void main(String[] args) {
		
		int[]a={8,2,3,7,5,5,7,7};
		
		LinkedHashSet<Integer> set = new LinkedHashSet<>();
		
		for(int i=0;i<a.length;i++) {
			
			set.add(a[i]);
		}
		for (Integer integer : set) {
			
			for(int i=0;i<a.length;i++) {
				
				if(a[i]==integer) {
					
					System.out.println(integer+" "+i);
					break;
				}
				
			}
		}
	}

}
