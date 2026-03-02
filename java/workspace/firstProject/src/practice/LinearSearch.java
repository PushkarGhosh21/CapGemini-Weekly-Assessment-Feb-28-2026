package practice;

public class LinearSearch {

	public static void main(String[] args) {
		int []arr= {12,34,56,89,534,122};
		int val=90;
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==val)
				index=i;
		}
		System.out.println("Index:"+index);
		

	}

}
