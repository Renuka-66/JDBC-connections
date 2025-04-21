package collections_sets;

public class payment {
	double amount;
	public payment (double amount)
	{
		this.amount=amount;
	}
	public  void pay() {
		System.out.println("paid amount:"+amount+"using UPI");
		
	}
}
class Debitcard extends payment{
	public Debitcard(double amount) {
		super(amount);
	}
	@Override
	public void pay() {
		System.out.println("paid amount :"+amount+"using UPI");
	}
}
class creditcard  extends payment{
    public creditcard(double amount) {
		super(amount);
	}
	@Override
	public void pay() {
		System.out.println("paid amount :"+amount+"using UPI");
	}
		}
class loan  extends payment{
    public loan(double amount) {
		super(amount);
	}
	@Override
	public void pay() {
		System.out.println("paid amount :"+amount+"using UPI");
	}
}
class payment_process{
	public static <t extends payment> void payment_process(t payment) {
		payment.pay();
	}
	}
class program2{
	public static void main(String[] args) {
		creditcard c =  new creditcard(12345.00);
		payment_process.payment_process(c);
		Debitcard d =  new Debitcard(12345.00);
		payment_process.payment_process(d);
	}
}

