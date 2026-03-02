package p1;

public class ColumnM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{2},{20},{30}};
        isMat(arr);

	}
	public static void isMat(int[][]arr) {
		int flag=0;
		if(arr.length>1)
		{
			for(int i=0;i<arr.length;i++)
			{
				if(arr[0].length!=1)
					{flag=69;
					break;
					}
			}
		}
	     if(flag==69)
	    	 System.out.println("NO");
	     else
	    	 System.out.println("YES");
	}


}
