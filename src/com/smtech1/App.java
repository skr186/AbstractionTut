package com.smtech1;

interface Bank {
	
	float rateOfInterest(); 
//	int numberOfEmployee();

}

interface BankAMount extends Bank{		//Interface extends another interface
	int numberOfEmployee();				//Interface can only be implemented by classes
}


class NBB implements Bank, BankAMount{ //Multiple inheritance only in Interface

	@Override
	public float rateOfInterest() {
		// TODO Auto-generated method stub
		return 9.15f;
	}

	@Override
	public int numberOfEmployee() {
		// TODO Auto-generated method stub
		return 0;
	}
}
	
class SBI implements Bank{

	@Override
	public float rateOfInterest() {
		// TODO Auto-generated method stub
		return 11.5f;
	}	
}

class App{
	public static void main(String[] args) {
		Bank b1 = new NBB();
		System.out.println("ROI: "+ b1.rateOfInterest());
		
		Bank b2 = new SBI();
		System.out.println("ROI: "+b2.rateOfInterest());
	}
}

