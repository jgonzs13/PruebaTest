package junitAnt.src.es.unileon.prg1.bank;

class Account{
		
	private Person owner;
	private int balance;

	//constructores
	Account (Account another){
		this.owner = another.getOwner();
		this.balance = another.getBalance();
	}
	
    Account(Person owner){
    	this.owner = owner;
   		this.balance = 0;
    }

    Account(Person owner, int balance){
    	this.owner = owner;
   		this.balance = balance;
    }
    //fin de constructores
    
    int getBalance(){
    	return balance;
    }
    
    Person getOwner(){
    	return this.owner;
    }
    //metodos
    //ingreso
    void deposit (int amount){
    		this.balance += amount;
    }
    //retirada
    void withdraw (int amount){
    		this.balance -= amount;
    }

    public String toString(){
    	    return "Account: " + 
    	    owner.toString() +
    	    " - Balance: " + balance;
    }

}
