package practice;


public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {12,13,45,89,100,1};
		int flag=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]<arr[i+1]) {
				flag=0;
			} else
			{
				flag=-1;
				break;
			}
				
		}
		if(flag==0) {
			System.out.println("Sorted");
		} else {
			System.out.println("Unsorted");
		}

	}

}
