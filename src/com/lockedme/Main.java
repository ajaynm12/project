package com.lockedme;
import java.io.File;
import java.util.Scanner;
public class Main {

		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("********************WELCOME TO SCREEN********************************\n");
			boolean d=true;
			do {
			System.out.println("Select Your Option From Below List:\n");
			System.out.println("1.Display All Files:\n");
			System.out.println("2.File Operations:\n");
			System.out.println("3.Exit\n");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				File ob = new File("D:\\main.txt");
			    File array[] =ob.listFiles();
			    for(int i=0;i<array.length;i++) {
			    	System.out.println(array[i]);
			      }
			case 2:
				do
				{
				System.out.println("Select Your File Operation\n");
				System.out.println("1.Add File:\n");
				System.out.println("2.Delete File:\n");
				System.out.println("3.Search File:\n");
				System.out.println("4.Return to Previous Menu\n");
				System.out.println("5.Exit\n");
				int choice1=scan.nextInt();
				switch(choice1) {
				case 1:
					System.out.println("Enter File Name with Path");
					String name=scan.next();
					File folder=new File("name");
					folder.mkdir();
				case 2:
					System.out.println("Enter Your File Name to Delete");
					String n1=scan.next();
					File folder1=new File(n1);
					folder1.delete();
				case 3:
					System.out.println("Enter Starting Letter Of File Which You Want To Search:\n");
					String name1=scan.next();
					File ob1= new File("D:\\main");
				    File array1[] =ob1.listFiles();
					 for(int i=0;i<array1.length;i++) {
						    
					    	if(array1[i].getName().startsWith(name1)) {
					    		System.out.println(array1[i]);
					    	}
					      }
				case 4:
					break;
					
				case 5:d=false;
				default:
				}
				}while(d);
			case 3:d=false;
			default:
			 }
			}while(d);
			scan.close();
		}

	}


		