package test;

public class ThirdLargest {

	public static void main(String[] args) {
		
		int a[]= {10,7,18,56,45};
		int largest=Integer.MIN_VALUE;
		int slargest=Integer.MIN_VALUE;
		int ans=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>largest)
			{
				ans=slargest;
				slargest=largest;
				largest=a[i];
			}
			else if (a[i] > slargest && a[i] < largest) {
                ans = slargest;
                slargest = a[i];
            }
            else if (a[i] > ans && a[i] < slargest) {
                ans = a[i];
		}
		
 	    }
		System.out.println("Third Largest:"+ans);

	}

}
