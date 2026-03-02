package practice;
public class Delete {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5}; //Original Array
		int pos=2; //Element at index 2 needs to be deleted
		for(int i=0;i<arr.length;i++)
		{
			if(i<pos)
				arr[i]=arr[i];
			else if(i>pos)
				arr[i-1]=arr[i];
			else 
				continue;
		}
		arr[arr.length-1]=0; // Last element=0
		for(int i=0;i<arr.length;i++) //For printing 
		{
			System.out.println(arr[i]);
		}	
	}

}
