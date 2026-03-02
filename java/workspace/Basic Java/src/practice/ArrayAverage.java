package practice;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,21,37,49,58,66};
		double avg=0.0;
		for(int i=0;i<arr.length;i++)
		{
			int s=0;
				s=s+arr[i];
				avg=s/arr.length;
		}
		System.out.println("Average:"+avg);

	}

}
