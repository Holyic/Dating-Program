/**
* Java Dating Program Responder Class
* 
* This Java class contains the responder class of the 
* Java dating program. The functions of this class manages the customers 
* of type responder. This class contains all the set and get methods for responder.
*
* @author  Hsu Sheng Hu Kenneth
* @version 1.0
* @since   25/02/2018
*/

public class Responder {
	
			// List properties for Responder accounts 		
			private String login;
			private String password;
			private String type;
			private char gender;
			private int age;
			private int income;	
			
			// Constructor
			public Responder(String login, String password, String type, char gender, int age, int income)
			{
				this.login = login;
				this.password = "password";
				this.type = type;
				this.gender = gender;
				this.age = age;
				this.income  = income;	
			}	
	
			// Set Methods
			public void setLogin(String login)
			{this.login = login;}
			
			public void setPassword(String password)
			{this.password = password;}
			
			public void setType(String type)
			{this.type = type;}
			
			public void setGender(char gender)
			{this.gender = gender;}
			
			public void setAge(int age)
			{this.age = age;}
			
			public void setIncome(int income)
			{this.income = income;}
			
			// Get Methods
			public String getLogin() {return login;}
			public String getPassword() {return password;}
			public String getType() {return type;}
			public char getGender() {return gender;}
			public int getAge() {return age;}
			public int getIncome() {return income;}
}
