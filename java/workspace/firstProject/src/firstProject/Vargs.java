package firstProject;

public class Vargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("start");
		varArgs(1,2,45,332,123);
		System.out.println("end");

	}
	public static void varArgs(double...d)
	{
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
	}

}
