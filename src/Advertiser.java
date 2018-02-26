/**
* Java Dating Program Advertiser Class
* 
* This Java class contains the advertiser class of the 
* Java dating program. The functions of this class manages the customers 
* of type advertisers. This class contains all the set and get methods for advertisers.
*
* @author  Hsu Sheng Hu Kenneth
* @version 1.0
* @since   25/02/2018
*/

public class Advertiser extends Responder {
	
	
	// List properties for Responder accounts
	private char partnerGender;
	private int ageRangeMin;
	private int ageRangeMax;	
	private int incomeMin;
	private String advertiserMessage;
	
	
	
	// Constructor
	public Advertiser(String login, String password, String type, char gender, int age, int income,
			char partnerGender, int ageRangeMin, int ageRangeMax, int incomeMin, String adveriserMessage) 
	{
		super(login, password, type, gender, age, income);
		setPartnerGender(partnerGender);
		setAgeRangeMin(ageRangeMin);
		setAgeRangeMax(ageRangeMax);
		setIncomeRangeMin(incomeMin);
		setAdvertiserMessage(adveriserMessage);

	}
	
	public void setPartnerGender(char partnerGender)
	{this.partnerGender = partnerGender;}
	
	public void setAgeRangeMin(int ageRangeMin)
	{this.ageRangeMin = ageRangeMin;}
	
	public void setAgeRangeMax(int ageRangeMax)
	{this.ageRangeMax = ageRangeMax;}
	
	public void setIncomeRangeMin(int incomeRangeMin)
	{this.incomeMin = incomeRangeMin;}
	
	public void setAdvertiserMessage(String advertiserMesssage)
	{this.advertiserMessage = advertiserMesssage;}
	

	public char getPartnerGender() {return partnerGender;}	
	public int getAgeRangeMin() {return ageRangeMin;}
	public int getAgeRangeMax() {return ageRangeMax;}
	public int getIncomeMin() {return incomeMin;}
	public String getAdvertiserMessage() {return advertiserMessage;}	
}
