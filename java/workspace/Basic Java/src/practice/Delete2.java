package practice;
public class Delete2 {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,2
				}; //Original Array
		int val=2; //Element  2 needs to be deleted
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=val)
				arr[k++]=arr[i];
		}
		while(k<arr.length)
			arr[k++]=0;
		for(int i=0;i<arr.length;i++) //For printing 
		{
			System.out.println(arr[i]);
		}	
	}

}
