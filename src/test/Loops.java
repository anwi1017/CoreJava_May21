package test;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//------- While loops
		int index = 10;
		
		while(index>0)
		{
			if(index!=3)
			{
			System.out.println(index);
			}
			//index = index-1;
			index--;
		}
		
		int index1 = 5;
		
		while(index1>0)
		{
			System.out.println(index1);
			
			if(index1==3)
			{
				break;
			}
			//index = index-1;
			index1--;
		}
		
		//-----Do While loop
		
		int index2 = 1;
		
		do {
			System.out.println(index2);
			index2++;
		
			}while(index2<11);
		
		//---- For loop
		
		for(int i=1;i<11;i++) {
			
			System.out.println(i);
		}
		
		int myarray [] = {2,3,45,6,7};
		
		for(int i=0;i<myarray.length;i++)
		{
			
			System.out.println(myarray[i]);
		}
	}
}
