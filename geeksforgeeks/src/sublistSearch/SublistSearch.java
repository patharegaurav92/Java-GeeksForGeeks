package sublistSearch;

public class SublistSearch {
	public static void main(String args[]){
	
		int first[] = {1,2,3,4};
		int second[] = {1,2,1,2,3,4,5};
		
		System.out.println(sublist(first,second));
		
	}

	private static boolean sublist(int[] first, int[] second) {
		
		if(first.length<second.length){
			int c=0;
			for(int i=0;i<second.length;){
				for(int j=0;j<first.length;){
					System.out.println(i+ " "+j);
					if(i<second.length){
						
					if(first[j] == second[i]){
						j++;i++;
						if(j==first.length)
							return true;
						continue;
					}else{
						break;
					}
					}
					else{
						break;
					}
				}
				c++;
				i=c;
			}
			
			
		}
		return false;
	}
}
