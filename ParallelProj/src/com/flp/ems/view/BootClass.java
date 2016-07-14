package com.flp.ems.view;

import java.util.*;

public class BootClass {

	
		
		static UserInteraction ui=new UserInteraction();
		
		static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
		while(true){
	    System.out.println("Menu Selection\n1.Add Employee\n2.Modify Employee\n3.Search Employee\n4.Remove Employee\n5.Get Employee Details");
		System.out.println("Enter your choice");
		int ch = sc.nextInt();
		menuSelection(ch);
		     }
		}
		public static void menuSelection(int ch){
			switch(ch){
				case 1: ui.addEmployee();
						break;
				/*case 2: ui.ModifyEmployee();
				        break;
				*/case 3: ui.searchEmployee();
				        break;
				case 4: ui.removeEmployee();
				        break;
				case 5: ui.getAllEmp();
				        break;
				case 6:System.exit(0);
				
			          }
		  }
		
}
