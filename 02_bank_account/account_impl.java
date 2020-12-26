class account_impl{
	public static void main(String args[]){
		Account acc1=new Account();
		acc1.getInput();
		acc1.deposit(20.4f);
		acc1.withdraw(10.2f);
		System.out.println("Displaying account-");
		acc1.display();
	}
}
