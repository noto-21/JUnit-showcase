import org.junit.Test;

public class LoanTest
{
	Loan loan = new Loan();

	@Test
	public void setLoanTest() throws Exception
	{
		loan.setLoanAmount(10);
		assert(loan.getLoanAmount() == 10);
	}

	@Test
	public void setInterestTest() throws Exception
	{
		loan.setAnnualInterestRate(2.5);
		assert(loan.getAnnualInterestRate() == 2.5);
	}
	@Test
	public void setYearsTest() throws Exception
	{
		loan.setNumberOfYears(7);
		assert(loan.getNumberOfYears() == 7);
	}
	
	@Test
	public void getDateTest() throws Exception
	{
		assert(loan.getLoanDate() != null);
	}
	
	@Test
	public void getMonthlyTest() throws Exception
	{
		System.out.println("Monthly Payment: " + loan.getMonthlyPayment());
		assert(loan.getMonthlyPayment() == 84.4661111639436);
	}
	@Test
	public void getTotalTest() throws Exception
	{
		System.out.println("Total Payment: " + loan.getTotalPayment());
		assert(loan.getTotalPayment() == 1013.5933339673231);
	}
	
	/* UnitTest - Exception when setting loan amount to negative number. */
	@Test(expected = AssertionError.class)
	public void negativeTest() throws Exception
	{
		loan.setNumberOfYears(-7);
		assert(loan.getMonthlyPayment() >= 0 && loan.getTotalPayment() >= 0);
	}
}