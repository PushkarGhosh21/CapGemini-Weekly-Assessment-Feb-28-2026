package practice;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		int s=arr.length;
		int pos=3;
		int element=-10;
		int narr[]=new int[s+1];
		narr[pos]=element;
		for(int i=0;i<narr.length;i++)
		{
			if(i<pos)
				narr[i]=arr[i];
			else if(i>pos)
				narr[i]=arr[i-1];
		}
		for(int i=0;i<narr.length;i++)
		{
			System.out.println(narr[i]);
		}	

	}

}
