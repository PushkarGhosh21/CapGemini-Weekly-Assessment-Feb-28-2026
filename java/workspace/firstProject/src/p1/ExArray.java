package p1;

public class ExArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    System.out.println("START");
			Object[] arr=new Object[5];
			arr[0]=true;
			arr[1]=(byte)1;
			arr[2]='k';
			arr[3]="StringLover";
			arr[4]=1234567890l;
			
			try {
				arr[5]=false;
			} catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e.getMessage());
			}
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
             System.out.println("END");
	}

}
