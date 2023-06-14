package assignment9;
//****************************************************************** 
//Commission.java      
//
//Represents a commission employee staff member.
//****************************************************************** 
public class Commission extends Hourly{

	protected double Provisionssatz;
	protected double Gesamtumsatz;
	//--------------------------------------------------------------- 
	//  Sets up a commission employee using the specified information.
	//---------------------------------------------------------------     
    Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double Provisionssatz) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.Provisionssatz = Provisionssatz;
    }
    public void addSales(double Gesamtumsatz)
    {
        this.Gesamtumsatz = Gesamtumsatz;
    }
    //----------------------------------------------------------------- 
    //  Computes and returns the pay for this commission employee.
    //----------------------------------------------------------------- 
    public double pay()
    {
       double Zahlung = super.pay() + ( Provisionssatz * Gesamtumsatz );
       Gesamtumsatz = 0;
       return Zahlung;
    }
    //--------------------------------------------------------------- 
    //  Returns information about the commission employee as a string. 
    //--------------------------------------------------------------- 
    public String toString()
    {
        String Ergebnis = super.toString();
        Ergebnis  = Ergebnis +  "\nTotal sales: " + Gesamtumsatz;
        return Ergebnis;
    }
}
