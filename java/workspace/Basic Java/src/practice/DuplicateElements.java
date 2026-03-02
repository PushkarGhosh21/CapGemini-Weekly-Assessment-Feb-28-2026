package practice;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[]= {10,20,12,-6,98,12,20,8};
        int c=0;
        int ch=0;
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            c=0;
        	ch=arr[i];
        	for(int j=0;j<arr.length;j++)
        	{
        		if(ch==arr[j]) {
					c++;
				}
        		
        	}
        	if(c>1) {
				ans++;
			}
        	
        }
        System.out.println("There are "+ans/2+" Duplicate elements");
	}

}
