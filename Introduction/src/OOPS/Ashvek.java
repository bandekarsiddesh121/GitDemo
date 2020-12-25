package OOPS;

public class Ashvek {

	String cName = new String();
	String cCode = new String();
	
	public boolean AddDB(String cName, String cCode)
	{
		// add toDB
		boolean isValid=ValidateData(cName,cCode);
		if(isValid)
		{
			CreateDBObjects();
		}
		
		return true;
	}
	private boolean ValidateData(String cName, String cCode)
	{
		
		
		
		return true ;
	}
	private boolean CreateDBObjects()
	{
		//open 
		return true;
	}
	
	
}


