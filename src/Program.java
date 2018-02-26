/**
* Java Dating Program Program Class
* 
* This Java class contains the Program class of the 
* Java dating program. This class contains all the methods of 
* creating, matching, deleting, displaying and messaging. 
*
* @author  Hsu Sheng Hu Kenneth
* @version 1.0
* @since   25/02/2018
*/

import java.util.*;

public class Program {
	
	static ArrayList<Responder> accountR = new ArrayList<Responder>();
	static ArrayList<Advertiser> accountA = new ArrayList<Advertiser>();
	static ArrayList<Message> mailbox = new ArrayList<Message>();
	static String mList[] = new String[10];
	
	// Method to add customers
	public static void addCustomer()
	{
		// Add advertiser accounts
		// ------------------------login---pwd------------type-------sex-age-ic------psex------ar-----ir---message----
		accountA.add(new Advertiser("Lisa", "password", "Advertiser", 'F', 18, 2000, 'M', 18, 24, 1000, "Lisa Here!"));		
		accountA.add(new Advertiser("Mona", "password", "Advertiser", 'F', 24, 3000, 'M', 18, 24, 2000, "Mona Here!"));
		accountA.add(new Advertiser("Sarah", "password", "Advertiser", 'F', 30, 3000, 'M', 18, 40, 8000, "Sarah Here!"));
		accountA.add(new Advertiser("Anna", "password", "Advertiser", 'F', 36, 10000, 'M', 18, 24, 110000, "Anna Here!"));		
		accountA.add(new Advertiser("Ben", "password", "Advertiser", 'M', 18, 3000, 'F', 18, 40, 1000, "Ben Here!"));
		accountA.add(new Advertiser("Louis", "password", "Advertiser", 'M', 24, 5000, 'F', 21, 30, 2000, "Louis Here!"));		
		accountA.add(new Advertiser("Tom", "password", "Advertiser", 'M', 30, 50000, 'F', 22, 30, 12000, "Tom Here!"));
		accountA.add(new Advertiser("Jim", "password", "Advertiser", 'M', 36, 2000, 'F', 18, 60, 300000, "Jim Here!"));

		// Add Responder accounts
		//------------------------login------pws-----type-----------sex-age----ic---------
		accountR.add(new Responder("Adam", "password", "Responder", 'M', 18, 2000));
		accountR.add(new Responder("Sam", "password", "Responder", 'M', 25, 4000));
		accountR.add(new Responder("Mark", "password", "Responder", 'M', 30, 20000));
		accountR.add(new Responder("Carl", "password", "Responder", 'M', 40, 200000));		
		accountR.add(new Responder("Naomi", "password", "Responder", 'F', 18, 2000));
		accountR.add(new Responder("Lydia", "password", "Responder", 'F', 24, 4000));
		accountR.add(new Responder("Karen", "password", "Responder", 'F', 30, 8000));
		accountR.add(new Responder("Jazlynn", "password", "Responder", 'F', 36, 20000));
		
		System.out.println("8 Advertiers and 8 Responder accounts created.");

	}
	
	// Display student info
	public static void displayStudentInfo()
	{
	System.out.println("Student Name: Hsu Sheng Hu Kenneth");
	System.out.println("Student Number: 33154872");
	System.out.println("Mode of enrolment: Full Time ");
	System.out.println("Tutor Name: Dr Loo");
	System.out.println("Tutorial attendance day and time: Tuesday 9am");
	System.out.println();
	}

	// Main menu method
	public static void mainMenu()
	{		
		Scanner kbinput = new Scanner(System.in);
		System.out.println("******************************************************************");
		System.out.println("Welcome to the online dating site!");
		System.out.println("Press 1 Login");
		System.out.println("Press 2 Delete an existing Customer");
		System.out.println("Press 3 for New Registration");	
		System.out.println("Press 4 Display the details of all Advertisers");
		System.out.println("Press 5 Display the details of all Responders");
		System.out.println("Press 6 Display all Customers");
		System.out.println("Press 7 Exit program");
		System.out.println("******************************************************************");
		
		int input = kbinput.nextInt();
		switch  (input)
		{
		case 1: input = 1;
		//Login
		login();
		mainMenu();
		break;
		
		case 2: input = 2;
		// Delete customer
		delete();
		mainMenu();
		break;
		
		case 3: input = 3;
		// Register new customer
		register();
		mainMenu();
		break;
		
		case 4: input = 4;
		// Display details of all advertiser registered with the service
		displayAdvertisers();
		mainMenu();
		break;
		
		case 5: input = 5;
		// Display details of all responder registered with the service
		displayResponders();
		mainMenu();
		
		case 6: input = 6;
		// Display details of all customers registered  with the service
		displayAll();
		mainMenu();
		break;
		
		case 7: input = 7;
		// Exit program
		System.exit(0);		
		break;
		
		default:
			System.out.println("Invalid Selection.");
			mainMenu();
		}
	}
		// Display advertiser details
		public static void displayAdvertiser(int num)
		{
			System.out.println(accountA.get(num).getType()+" " +"Account Details | Login  "+accountA.get(num).getLogin()
					+ " Password: "+accountA.get(num).getPassword()
					+ " Gender: "+accountA.get(num).getGender()
					+ " Age: "+accountA.get(num).getAge()
					+ " Income: "+accountA.get(num).getIncome()		
					+ " Partner Gender: "+accountA.get(num).getPartnerGender()
					+ " Age Range: "+accountA.get(num).getAgeRangeMin() + " - " +accountA.get(num).getAgeRangeMax()
					+ " Minimum Income: "+accountA.get(num).getIncomeMin()
					+ " Message: "+accountA.get(num).getAdvertiserMessage());						
			System.out.println("----------------------------------------------------------");
		}
		
		// Display responder details
		public static void displayResponder(int num)
		{
			System.out.println(accountR.get(num).getType()+" " +"Account Details | Login: "+accountR.get(num).getLogin()
					+ " Password: "+accountR.get(num).getPassword()
					+ " Gender: "+accountR.get(num).getGender()
					+ " Age: "+accountR.get(num).getAge()
					+ " Income: "+accountR.get(num).getIncome());
			System.out.println("----------------------------------------------------------");
		}
		
		//isBetween method to check age range
		public static boolean isBetween(int n, int min, int max) 
		{
			  return n > min && n < max;
		}
	
	
		// Option 1 Login
		public static void login()
		{
			Scanner kbinput = new Scanner(System.in);
			System.out.println("Enter 1 for Advertiser Login");
			System.out.println("Enter 2 for Responder Login");
			
			int input = kbinput.nextInt();
			
			if(input == 1)
			{
				advertiserLogin();
			}
			else if(input == 2)
			{
				responderLogin();
			}
			else
			{
				System.out.println("Invalid input");
				login();
			}
		}
		
		// Advertiser login
		public static void advertiserLogin()
		{
			boolean verify = false;
			Scanner kbinput = new Scanner(System.in);
			System.out.println("Enter login name:");
			String login = kbinput.next();
			System.out.println("Enter password:");
			String password = kbinput.next();	
			
			for(int a = 0; a < accountA.size(); a++)
			{			
				if(login.equalsIgnoreCase(accountA.get(a).getLogin()) 
				   && password.equals(accountA.get(a).getPassword()))
				   {
					System.out.println("Advertiser Login Success");
					verify = true;
										
					for(Message i : mailbox)
					{
						if(i.getTo().equalsIgnoreCase(login))
						{
							System.out.println("Message Recived:");
							System.out.println("From: " + i.getFrom());							
							System.out.println("Message: ");
							System.out.println(i.getBody());
							
							
						}
					}
				   }
			}			
			if(verify == false)
			{
				System.out.println("Invalid Password or Login");
			}
		}
		
		
		// Responder login
		public static void responderLogin()
		{
			boolean verify = false;
			Scanner kbinput = new Scanner(System.in);
			System.out.println("Enter login name:");
			String login = kbinput.next();
			System.out.println("Enter password:");
			String password = kbinput.next();
			
			for(int a = 0; a < accountR.size(); a++)
			{			
				if(login.equalsIgnoreCase(accountR.get(a).getLogin()) 
				   && password.equals(accountR.get(a).getPassword()))
				   {
					System.out.println("Responder Login Success");
					verify = true;	
				   }
			}			
			if(verify == false)
			{
				System.out.println("Invalid Password or Login");
			}
		}			
		
		// Option 2 Delete customer from service
		public static void delete()
		{		
			Scanner kbinput = new Scanner(System.in);
			System.out.println("Enter login name to be removed: ");
			String name = kbinput.nextLine();
			boolean found = false;
			for(int a = 0; a < accountA.size(); a++)
			{	
				if(name.equalsIgnoreCase(accountA.get(a).getLogin()))
				{
				System.out.println("Removed");
				displayAdvertiser(a);	
				accountA.remove(a);	
				found = true;
				}		
				
			}	
			
			for(int a = 0; a < accountR.size(); a++)
			{	
				if(name.equalsIgnoreCase(accountR.get(a).getLogin()))
				{
				System.out.println("Removed");
				displayResponder(a);	
				accountR.remove(a);
				found = true;
				}		
			}	
			if(found == false)
			{
				System.out.println("Error name not found");				
			}
		}
		
		// Option 3 Add new customer
		public static void register()
		{
			// get login name from user
			Scanner kbinput = new Scanner(System.in);
			System.out.println("Enter new login name:");
			String newLogin = kbinput.next();
			
			// display default password
			System.out.println("Default password is: password");
			String newPassword = "password";
			
			// get gender from user
			System.out.println("Enter Gender: ");
			char newGender = kbinput.next().charAt(0);			
			if(newGender != 'm' && newGender !='f' &&  newGender !='M'  && newGender !='F') 
			{
				System.out.println("Invalid input. Please register again.");
				register();
			}
			
			
			// get age from user
			System.out.println("Enter Age: ");
			int newAge = kbinput.nextInt();
			if((newAge <= 0) || (newAge > 99))
			{
				System.out.println("Invalid input. Please register again.");
				register();
			}
			
			// get income from user
			System.out.println("Enter Income: ");
			int newIncome = kbinput.nextInt();
			if(newIncome < 0)
			{
				System.out.println("Invalid input. Please register again.");
				register();
			}
			
			
			// prompt user to select account type
			// get selection from user
			System.out.println("Select Account Type: ");
			System.out.println("Option 1: Advertiser");
			System.out.println("Option 2: Responder");
			int input = kbinput.nextInt();
			kbinput.nextLine();
			String newType = null;
			
			if(input == 1)
				newType = "Advertiser";
			else if(input == 2)
				newType = "Responder";
			else 
			{
				System.out.println("Invalid input. Please register again.");
				register();
			}	
			
			int newAgeRangeMin = 0;
			int newAgeRangeMax = 0;
			int newIncomeMin = 0;
			char newPartnerGender = 0;
			boolean match = false;
			
			if(input == 1)
			{
				// advertiser message
				System.out.println("Enter Message for Partner: ");				
				String newReplyMessages = kbinput.nextLine();
				
				//Get user input for advertiser			
				// age range
				System.out.println("Enter Minimum Age Range of Partner: ");				
				newAgeRangeMin = kbinput.nextInt();
				
				System.out.println("Enter Maximum Age Range of Partner: ");				
				newAgeRangeMax = kbinput.nextInt();
				
				// get minimum income from user
				System.out.println("Enter Minimum Partner Income: ");
				newIncomeMin = kbinput.nextInt();
				
				
				
				
				// get partner gender from user
				System.out.println("Select Partner Gender: M/F");
				newPartnerGender = kbinput.next().charAt(0);
				newPartnerGender = Character.toUpperCase(newPartnerGender);
				
				if(newPartnerGender != 'm' && newPartnerGender !='f' &&  newPartnerGender !='M'  && newPartnerGender !='F') 
				{
					System.out.println("Invalid input. Please register again.");
					register();
				}
				
				// Advertiser account created
				// add information to arraylist Advertiser
				accountA.add(new Advertiser(newLogin, newPassword, newType,
						newGender, newAge, newIncome, newPartnerGender,
						newAgeRangeMin, newAgeRangeMax , newIncomeMin, newReplyMessages ));
				System.out.println("Advertiser Account Created.");	
				}
				else
				{	
				// Responder account created
				//
				accountR.add(new Responder(newLogin, newPassword, newType,
						newGender, newAge, newIncome));
				System.out.println("Responder Account Created.");
				
				
				// Match responder with advertiser
				for(int a = 0; a < accountA.size(); a++)
				{
				if(isBetween(newAge, accountA.get(a).getAgeRangeMin(), accountA.get(a).getAgeRangeMax()) == true
						&& newIncome >= accountA.get(a).getIncomeMin()
						&& Character.toUpperCase(newGender) == accountA.get(a).getPartnerGender())				
						{							
							System.out.println("You got a Match!");	
							System.out.println(accountA.get(a).getLogin()+" says "+accountA.get(a).getAdvertiserMessage());
							
							mList[a] = accountA.get(a).getLogin();
							match = true;
						}
				}
				if(match == true)
				{
				System.out.println("Enter name of Match to reply:");
				String matchName = kbinput.nextLine();
				
				String msg = null;
				
				// Create message for advertiser
				// Search to check if match to send reply message
				for(String i : mList)
				 { 
					 if(matchName.equalsIgnoreCase(i))
					 {
						 // Create reply message
						 System.out.println("Enter Message");
						 msg = kbinput.nextLine();
						 mailbox.add(new Message(newLogin, matchName,msg));
					 }
				 }	
				// Send message to advertiser
				System.out.println("Message Info:");
				System.out.println("To: " +matchName);
				System.out.println("From: " +newLogin);
				System.out.println("Message Sent!");
				System.out.println("---------------");
				System.out.println(msg);
				}
			 
			}				
		}	
		
		// Option 4 Display advertisers
		public static void displayAdvertisers()
		{
			// Display details of all advertiser registered with the service
			for(int a = 0; a < accountA.size(); a++)
			{
			    displayAdvertiser(a);	
			}			
		}
		
		// Option 5 Display responders
		public static void displayResponders()
		{
			// Display details of all responder registered with the service
			for(int a = 0; a < accountR.size(); a++)
			{
			    displayResponder(a);	
			}				
		}
		
		
		// Option 6 Display All customers
		public static void displayAll()
		{
			// Display details of all Customers registered with the service
			System.out.println("All Customer Details");
			for(int a = 0; a < accountA.size(); a++)
			{				
			displayAdvertiser(a);			
			}
			for(int a = 0; a < accountR.size(); a++)
			{		
			displayResponder(a);
			}	
		}	
}
