package practice;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=3;
		int a[]= {10,20,30,40,50,60,70};
		k=k%a.length;
		reverse(a,0,a.length-1);
		reverse(a,0,k-1);
	    reverse(a,k,a.length-1);
	    for(int i=0;i<a.length;i++)
        {
        	System.out.println(a[i]);
        }
		

	}
	public static void reverse(int []nums,int start,int end)
    {
        while(start<end){
          int temp=nums[start];
          nums[start]=nums[end];
          nums[end]=temp;
          start++;
          end--;
        }
        

}
}
