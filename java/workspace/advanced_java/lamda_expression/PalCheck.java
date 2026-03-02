package lamda_expression;
@FunctionalInterface
interface Palin
{
	void Pcheck(String s);
}

public class PalCheck 
{

	public static void main(String[] args) 
	{
		Palin p=(String s)->{
			s=s.toLowerCase();
			s=s.replaceAll("\\s+","");
			s=s.replaceAll("[^0-9a-zA-Z]", "");
			boolean isPalin=true;
			for(int i=0;i<s.length()/2;i++)
			{if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				isPalin=false;
				break;
			}}
			System.out.println(isPalin);
		};
		p.Pcheck("Racecar");

	}

}
