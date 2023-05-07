public class Loan
{
	private double annualInterestRate;
	private int numberOfYears;
	private double loanAmount;
	private java.util.Date loanDate;

	/* Default constructor */
	public Loan()
	{
		this(2.5, 1, 1000);
	}

	/* Construct a loan with specified annual interest rate, number of years, and loan amount.	**/
	public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
	{
		this.annualInterestRate = annualInterestRate;
		this.numberOfYears = numberOfYears;
		this.loanAmount = loanAmount;
		loanDate = new java.util.Date();
	}

	/* Return annualInterestRate */
	public double getAnnualInterestRate()//DONE
	{
		return annualInterestRate;
	}

	/* Set a new annualInterestRate */
	public void setAnnualInterestRate(double annualInterestRate)//DONE
	{
		this.annualInterestRate = annualInterestRate;
	}

	/* Return the length of the loan */
	public int getNumberOfYears()//DONE
	{
		return numberOfYears;
	}

	/* Set a new loan duration */
	public void setNumberOfYears(int numberOfYears)//DONE
	{
		this.numberOfYears = numberOfYears;
	}

	/* Return the amount of money loaned */
	public double getLoanAmount()//DONE
	{
		return loanAmount;
	}

	/* Set a update the amount of money loaned */
	public void setLoanAmount(double loanAmount) throws Exception//DONE
	{
		if (loanAmount < 0)
			throw new Exception("The loan amount cannot be negative!");
		this.loanAmount = loanAmount;
	}

	/* Calculate monthly payment */
	public double getMonthlyPayment()
	{
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
				(1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	/* Calculate total payment */
	public double getTotalPayment()
	{
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}

	/* Return loan date */
	public java.util.Date getLoanDate()
	{
		return loanDate;
	}
}