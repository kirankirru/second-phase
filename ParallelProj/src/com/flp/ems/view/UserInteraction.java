package com.flp.ems.view;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;


import com.flp.ems.domain.Employee;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.service.IEmployeeService;
import com.flp.ems.util.Validate;

public class UserInteraction {
	
	 Validate val=new Validate();
	Scanner sc=new Scanner(System.in);
	IEmployeeService empService;

	Map<String, Object> empDetails=new HashMap<String, Object>();

		public UserInteraction(){
		 empService=new EmployeeServiceImpl();
	}
		private int eid;
	public void addEmployee() throws ClassNotFoundException, SQLException{
		
	 System.out.println("Generate id was");
	 Random r = new Random();
		eid = r.nextInt(9999 - 1000) + 1000;
	  String empid=String.valueOf(eid);
	  System.out.println(empid);
	empDetails.put("empid",empid);
	
		System.out.println("Kinid");
		empDetails.put("Kinid",sc.next());
		boolean z;
		do{
			System.out.print("Enter empName");
		    String na=sc.next();
		     z=val.isNameValid(na);
		    
		    if(z){
		    	
		    	System.out.println("Validated");
		    	empDetails.put("empName",na);

		    	
		    }
		    else{
		    	System.out.println("Invalid");
		    }
		    
			}while(z==false);

		boolean m;
		do{
			System.out.print("Enter mail");
		    String ma=sc.next();
		     m=val.isEmailValid(ma);
		    
		    if(m){
		    	
		    	System.out.println("Validated");
		    	empDetails.put("mail",ma);

		    	
		    }
		    else{
		    	System.out.println("Invalid");
		    }
		    
			}while(m==false);

		
		
		
		boolean p;
		do{
			System.out.print("Enter phone");
		    String ph=sc.next();
		     p=val.isPhoneNumberValid(ph);
		    
		    if(p){
		    	
		    	System.out.println("Validated");
		    	empDetails.put("phno",ph);

		    	
		    }
		    else{
		    	System.out.println("Invalid");
		    }
		    
			}while(p==false);

		
		
		
		
		System.out.println("enter address");
		empDetails.put("address", sc.next());
		
		boolean db,dj;
			
		do{
		System.out.print("Enter dob");
	    String dob=sc.next();
	    db=val.validate(dob);
	    
	    if(db){
	    	
	    	System.out.println("Validated");
	    	empDetails.put("dob",dob );

	    	
	    }
	    else{
	    	System.out.println("Invalid");
	    }
	    
		}while(db==false);
		
		do{
	    System.out.print("Enter employee DOJ");
		String doj=sc.next();
		  dj=val.validate(doj);
				    
		    if(dj){
		    	System.out.println("Validated");
		    	empDetails.put("doj", doj);
		    }
		    else{
		    	System.out.println("Invalid");
		    }
			

		}while(dj==false);
	  	
	 
			
        System.out.println("enter dept id");
		empDetails.put("deptId", sc.nextInt());
		System.out.println("enter proj id");
		empDetails.put("projId", sc.nextInt());
		
		System.out.println("Enter your department:1. ADM        2. Cards     3.CapitalMarkets");
		int r1= sc.nextInt();
		switch(r1){
		      case 1: System.out.println("ADM");
		              empDetails.put("deptName", "ADM");
			          System.out.println("Choose your project:  1. HSBC      2. BarClays         3. Morgans Stanley");
			          int ch2 = sc.nextInt();
			          	switch(ch2){
			          		case 1: System.out.println("HSBC"); 
			          				empDetails.put("projName", "HSBC");
			          				break;
			          		case 2: System.out.println("BarClays");
			          				empDetails.put("projName", "BarClays");
			          				break;
			          		case 3: System.out.println("Morgans Stanley");
			          				empDetails.put("projName", "Morgans Stanley");
			          				break;
				
				}
			  break;
		      
		     case 2: System.out.println("Cards");
		     		 empDetails.put("deptName", "Cards");
		     		 System.out.println("Choose your project: 1.HSBC    2. BarClays     3. Morgans Stanley");
		     		 int ch3 = sc.nextInt();
		     		   switch(ch3){
		     		   	   case 1: System.out.println("HSBC"); 
		     		   	   		   empDetails.put("projName", "HSBC");
		     		   	   		   break;
		     		   	   case 2: System.out.println("BarClays");
		     		   	   		   empDetails.put("projName", "BarClays");
		     		   	   		   break;
		     		   	   case 3: System.out.println("Morgan Stanley");
		                           empDetails.put("projName", "Morgans Stanley");
		                           break;
		
		}
		    break;
		
		    case 3: System.out.println("Capital Markets");
		            empDetails.put("projName", "Capital Markets");
		            System.out.println("Choose your project:1.HSBC    2. BarClays     3. Morgans Stanley");
		            int ch4 = sc.nextInt();
		             switch(ch4){
		                 case 1: System.out.println("HSBC"); 
		                 	     empDetails.put("projName", "HSBC");
		                 	     break;
		                 case 2: System.out.println("BarClays");
		                         empDetails.put("projName", "BarClays");
		                         break;
		                 case 3: System.out.println("Morgan Stanley");
		                 	     empDetails.put("projName", "Morgan Stanley");
		                 	     break;
		
		}
		break;
				
		}
		
				
		System.out.println("enter role id");
		empDetails.put("roleId", sc.nextInt());
		
		//System.out.println("enter role name");
		System.out.println("Choose one");
		System.out.println("1.Developer   2.Tester   3.Team Leader");
		int y=sc.nextInt();
	    
		switch(y){
		     
		    case 1:empDetails.put("roleName", "Developer");
		           break;
		    case 2:empDetails.put("roleName", "Tester");
			
		           break;
		    case 3:empDetails.put("roleName", "Team Leader");
		    	   break;	 
		    default: System.out.println("Wrong Choice");
		}
		
	//empDetails.put("roleName", sc.next());

		empService.addEmployee(empDetails);
		
      
	}
   

	public boolean removeEmployee() throws ClassNotFoundException, SQLException
	{
		/*System.out.println("Enter  kinid you want to delete");
		String  kinid=sc.next();
		return empService.removeEmployee(kinid);
	*/

		String kinid;
		String empName,mail;
		while(true){
			System.out.println("1.Remove by id");
			System.out.println("2.Remove by name");
			System.out.println("3.Remove by mail");
			System.out.println("Enter ur choice:"); 	
			int c=sc.nextInt();
			if(c==4){
				break;
			}
		
		switch(c){
		case 1:System.out.println("enter the kinid"); 
	    	   kinid=sc.next();
	    	   return empService.removeEmployee(kinid,"*","*");
	    case 2:System.out.println("enter the name"); 
               empName=sc.next();
               return empService.removeEmployee("*",empName,"*"); 
        case 3:System.out.println("enter the mail"); 
			   mail=sc.next();
			   return empService.removeEmployee("*","*",mail);
    
		}
	
	}
		return false;

	}	//return empService.removeEmployee(Kinid,empName,mail;);
		//return false;
	//}
	
   public void searchEmployee() throws ClassNotFoundException, SQLException
	{
	String kinid;
	String empName,mail;
		while(true){
		System.out.println("1.Search by id");
		System.out.println("2.Search by name");
		System.out.println("3.Search by mail");
		System.out.println("4.Search by id and name");
		System.out.println("5.Search by id and mail");
		System.out.println("6.Search by mail and name");
		System.out.println("7.Search by id and name");
		System.out.println("8.Search by id,name,mail");
		System.out.println("Enter ur choice:"); 	
		int c=sc.nextInt();
		if(c==10){
			break;
		}
		switch(c){
			case 1:System.out.println("enter the kinid"); 
		    	   kinid=sc.next();
		    	   empService.searchEmployee(kinid,"*","*");
		    	   break;
		    case 2:System.out.println("enter the name"); 
                   empName=sc.next();
                   empService.searchEmployee("*",empName,"*"); 
                   break;
		    case 3:System.out.println("enter the mail"); 
				   mail=sc.next();
				   empService.searchEmployee("*","*",mail);
				   break;
		    case 4:System.out.println("enter the id and name");
				   kinid=sc.next();	
				   empName=sc.next();
			       empService.searchEmployee(kinid,empName,"*");
			       break;
		    case 5:System.out.println("enter the id and mail"); 
			       kinid=sc.next();	
			       mail=sc.next();
	               empService.searchEmployee(kinid,"*",mail);
	               break;
		    case 6:System.out.println("enter the mail and name"); 
			       mail=sc.next();
			       empName=sc.next();
			       empService.searchEmployee("*",empName,mail);
			       break;
	        case 7:System.out.println("enter the id and name"); 
			       kinid=sc.next();	
			       empName=sc.next();
	               empService.searchEmployee(kinid,empName,"*");
	               break;
            case 8:System.out.println("enter the id,name,mail"); 
	               kinid=sc.next();	
			       empName=sc.next();
			       mail=sc.next();
			       empService.searchEmployee(kinid,empName,mail);
			       break;
   }
		}
	
		
	}
	
	/*public List<Employee> getAllEmployee(){
		return empService.getAllEmployee();
	}*/
	void getAllEmployee() throws ClassNotFoundException, SQLException {

		empService.getAllEmployee();

		}
	
    public void modifyEmployee()
	{   
    	Employee emp=null;
    	String Kinid,empName,mail; 	
    	System.out.println("How you want to modfiy");
	    
	    while(true){
	    System.out.println("1.Modify by Name");	
	    System.out.println("2.Modify by mail");
	    System.out.println("3.Modify by Kinid");
	    int c=sc.nextInt();
		if(c==4){
			break;
		}
		switch(c){
		case 1:System.out.println("1.Name u want to modify");	
	           empName=sc.next();
	           emp=empService.searchEmployee("*", empName,"*" );
	           break;
		case 2:System.out.println("2.Mail u want to modify");	
  			   mail=sc.next();
    	       emp=empService.searchEmployee("*", "*", mail);
    	       break;
		case 3:System.out.println("3.Kinid u want to modify");	
			   Kinid=sc.next();
		       emp=empService.searchEmployee(Kinid,"*", "*");
		       break;
		}
	
	  if(emp!=null)
		{ 
			while(true)
			{ 
				Map<String,Object> empModifiedDetails=new HashMap<String,Object>();
					System.out.println("Modify Employee by:");
					System.out.println("1.Modify Name:");
					System.out.println("2.Modify  Email:");
					System.out.println("3.Modify  phno:");
					System.out.println("4.Modify  Address:");
					System.out.println("5.Modify  Dob:");
					System.out.println("6.Modify Doj:");
					
					System.out.println("Enter ur choice:"); 	
					int ch=sc.nextInt();
					if(ch==7){
						break;
					}
					switch(ch)
					{
						case 1:
							System.out.println("Enter The name");
							empModifiedDetails.put("empName", sc.next());
							empService.modifyEmployee(empModifiedDetails,emp,ch);
							break;
						case 2:
							System.out.println("Enter The email");
							empModifiedDetails.put("mail", sc.next());
							empService.modifyEmployee(empModifiedDetails,emp,ch);
							break;
						case 3:
							System.out.println("Enter The phno");
							empModifiedDetails.put("phno", sc.next());
							empService.modifyEmployee(empModifiedDetails,emp,ch);
							break;	
						case 4:
							System.out.println("Enter The Address");
							empModifiedDetails.put("address", sc.next());
							empService.modifyEmployee(empModifiedDetails,emp,ch);
							break;
						case 5:
							System.out.println("Enter The Dob");
							empModifiedDetails.put("dob", sc.next());
							empService.modifyEmployee(empModifiedDetails,emp,ch);
							break;
						case 6:
							System.out.println("Enter The Doj");
							empModifiedDetails.put("doj", sc.next());
							empService.modifyEmployee(empModifiedDetails,emp,ch);
							break;	
					   		
					}
			}
			
		}
		
		
		
	
			   
   }
		return null;
	    
	}
}



