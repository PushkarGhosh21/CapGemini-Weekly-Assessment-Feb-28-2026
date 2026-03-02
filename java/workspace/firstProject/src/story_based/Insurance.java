package story_based;

interface Insure
{
	void submitclaim()throws InvalidClaimException;
	void submitclaim(double amt)throws InvalidClaimException;
}

class InvalidClaimException extends Exception
{
	public InvalidClaimException(String message)
	{
		super(message);
	}
}
class ClaimRejectedException extends RuntimeException
{
	public ClaimRejectedException(String message)
	{
		super(message);
	}
}
abstract class Insurances implements Insure
{

	private long claimid;
	private String name;
	private double amount;
	 protected Insurances(long claim,String holdername,double amt)
	 {
		 this.claimid=claim;
		 this.name=holdername;
		 this.amount=amt;
	 }
	 protected double getClaim()
	 {
		 return amount;
	 }
	 protected void validateClaim(double amount)throws InvalidClaimException
	 {
		 if(amount<0) {
			throw new InvalidClaimException("INVALID AMOUNT !");
		 }
	}
}
class HealthClaim extends Insurances 
{
	public HealthClaim(long cid,String n,double a)
	{
		super(cid,n,a);
	}

	@Override
	public void submitclaim() throws InvalidClaimException {
		// TODO Auto-generated method stub
		validateClaim(getClaim());

        if (getClaim() > 5000000) {
            throw new ClaimRejectedException("Health claim amount exceeds limit");
        }

        System.out.println("Health claim approved");
	}

	@Override
	public void submitclaim(double eamt) throws InvalidClaimException {
		// TODO Auto-generated method stub
		if (eamt < 0) {
            throw new InvalidClaimException("Invalid extra claim amount");
        }

        double total = getClaim() + eamt;
        validateClaim(total);

        if (total > 10000000) {
            throw new ClaimRejectedException("Health claim rejected due to excess amount");
        }

        System.out.println("Health claim approved with additional amount");
	}
}
class VehicleClaim extends Insurances 
{
	public VehicleClaim(long cid,String n,double a)
	{
		super(cid,n,a);
	}

	@Override
	public void submitclaim() throws InvalidClaimException {
		// TODO Auto-generated method stub
		validateClaim(getClaim());

        if (getClaim() > 3000000) {
            throw new ClaimRejectedException("Health claim amount exceeds limit");
        }

        System.out.println("Health claim approved");
	}

	@Override
	public void submitclaim(double eamt) throws InvalidClaimException {
		// TODO Auto-generated method stub
		if (eamt < 0) {
            throw new InvalidClaimException("Invalid extra claim amount");
        }

        double total = getClaim() + eamt;
        validateClaim(total);

        if (total > 8000000) {
            throw new ClaimRejectedException("Health claim rejected due to excess amount");
        }

        System.out.println("Health claim approved with additional amount");
	}
}
public class Insurance {

    public static void main(String[] args) {

        Insure claim1 =new HealthClaim(101, "Ramesh", 200000);

        Insure claim2 =new VehicleClaim(202, "Suresh", 150000);

        try {
            claim1.submitclaim(50000); // health with extra
            claim2.submitclaim();      // vehicle normal
        } catch (InvalidClaimException e) {
            System.out.println(e.getMessage());
        }
    }
}

