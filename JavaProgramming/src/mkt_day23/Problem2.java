package mkt_day23;

public class Problem2 {
//create a array of length 4 and check the given number 6 is present in the array or not 
	public static void main(String[] args) {
		
		int roll_no[]=new int[4];
		roll_no[0]=10;
		roll_no[1]=6;
		roll_no[2]=30;
		roll_no[3]=39;
		
		int num_to_check=6;
		
		for(int i=0;i<roll_no.length;i++) {
			
			if(roll_no[i]==num_to_check) {
				
				System.out.println("we found the num"+num_to_check+"at the index position" +i);
			}else {
				//System.out.println("numer 6 is not present");
			}
			
		}
		
	}

}
