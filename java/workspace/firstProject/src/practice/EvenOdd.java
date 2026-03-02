package practice;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7,8,9,0,11,12,131,122,43,15,17};
		int e=0;
		int o=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				e++;
			else 
				o++;
		}
		System.out.println("Even elements:"+e+ " & Odd elements:"+o);

	}

}
