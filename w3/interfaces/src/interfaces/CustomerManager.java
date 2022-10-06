package interfaces;

public class CustomerManager {
	CustomerDal customer;
	public CustomerManager(CustomerDal customer) {
		this.customer = customer;
	}
	public void add() {
		customer.add();
	}
}
