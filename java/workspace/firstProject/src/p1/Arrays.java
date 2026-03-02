package p1;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Object[] arr=new Object[5];
			arr[0]=true;
			arr[1]=(byte)1;
			arr[2]='k';
			arr[3]="StringLover";
			arr[4]=1234567890l;
			
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}

	}

}
