
/**
* Java Dating Program Main
* 
* This Java class contains the main class  

*
* @author  Hsu Sheng Hu Kenneth
* @version 1.0
* @since   25/02/2018
*/


public class Main {
	
	public static void main(String[] args)
	{		
	Program.displayStudentInfo();	
	Program.addCustomer();
	
	
	boolean run = true;
	while(run)
	{
	try {
	Program.mainMenu();	
		} catch (NullPointerException e) {
			System.out.println("***Errore***"); //
	} catch (Exception e1)		{ 
			System.out.println("***Fatal Error***"); // try/catch exception to catch all other input errors
			System.out.println("***Program Restarted***");				
	}
	}
	}
}

