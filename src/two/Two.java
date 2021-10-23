package two;

public class Two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int x =0, mi,middle=14;
		for(int n =0;n<14;n++) {
			//middle = 14;
		    while(i<14 ){
			if(i>0) {
				 x += 2;
				 middle = middle/2;
				int y= x/2;
				while(i<middle-y) {
					System.out.print("*");
					i++;
				}//while
				while(middle+y < 14) {
					System.out.print("*");
					i++;
					
				}//while2
				
			}//if
			else { System.out.print("*"); 
			        i++;
			}
		}//for1
	       System.out.println("/n");
		}//for2
		
			
		

	}

}
