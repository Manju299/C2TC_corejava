package assignment2;

public class Commission {
	String Name;
	String Address;
	int Phone;
	double Sales_amount;
	void detailSale(String Name,String Address,int Phone,double Sales_amount) {
		this.Name = Name;
		this.Address = Address;
		this.Phone = Phone;
		this.Sales_amount = Sales_amount;
		System.out.println("Name "+this.Name);
		System.out.println("Address "+this.Address);
		System.out.println("Phone "+this.Phone);
		System.out.println("Amount "+this.Sales_amount);
	}
	void calculate() {
		double commission=0;
		if(Sales_amount>=100000) {
			commission = Sales_amount*0.1;
			System.out.print("The commission is 10% " +commission);
			
		}
		else if(Sales_amount<=50000) {
			commission = Sales_amount*0.05;
			System.out.print("The commission is 5% " +commission);
			
		}
		else if(Sales_amount<=30000) {
			commission = Sales_amount*0.03;
			System.out.print("The commission is 3% " +commission);
			
		}
		else {
		System.out.print("No Tax");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Commission sc = new Commission();
		sc.detailSale("Manjunath","Bangalore",123344, 50000);
		sc.calculate();

	}

}
