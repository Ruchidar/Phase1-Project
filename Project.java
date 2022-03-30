package com.mphasis.basics;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Project {
	public static void main(String[] args) throws IOException {
		while(true) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter required option 1.Retrieving the file names in an ascending order ; 2.Business-level operations ; 3.Option to close the application");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:{
				String path="D:\\Project\\";
				File f=new File(path);
				File filename[]=f.listFiles();
				for(File ff:filename) {
					System.out.println(ff.getName());
			}
				break;
			}
			case 2:
			{
				Scanner sc1=new Scanner(System.in);
				System.out.println("Enter required option for business level operation");
				System.out.println("1.To create file");
				System.out.println("2.To delete file");
				System.out.println("3.To search for file");
				System.out.println("4.Goto Main Menu");
				int choice1=sc1.nextInt();
				switch(choice1) {
				case 1:
				{
					String path="D:\\1Project\\";
					Scanner sc2=new Scanner(System.in);
					ArrayList<String> al=new ArrayList<>();
					while(true) {
					System.out.println("Enter the file name to create :");
					String filename=sc2.next();
					String finalname=path+filename;
					System.out.println(finalname);

					//create a file 

					File f=new File(finalname);
					boolean b=f.createNewFile();
					if(b!=true) {
						System.out.println("the file not created");
					}
					else {
						al.add(filename);
						System.out.println("file created");
						break;
					}
					

					System.out.println("the collection of files is "+ al);
					}
		
					break;
				}
				case 2:
				{
					String filepath="D:\\Project\\";
					Scanner sc3=new Scanner(System.in);
					System.out.println("Enter the file name to be deleted");
					String filname=sc3.next();
					String finalfile=filepath+filname;
					File file=new File(finalfile);
					file.delete();
					System.out.println("file deleted");
					break;
				}
				case 3:
				{
					String path3="D:\\Project\\";
					File f1=new File(path3);
					Scanner sc4=new Scanner(System.in);
					System.out.println("Enter the file name to search");
					String filsearchname=sc4.next();
					File filename1[]=f1.listFiles();
					int flag=0;
					for(File ff:filename1) {
						if(ff.getName().equals(filsearchname)) {
							flag=1;
							break;
						}
						else {
							flag=0;
						}
						
						
						
					}

					if(flag==1) {
						System.out.println("found the file");
					}
					else {
						System.out.println("File not found");
					}
					break;
				}
				case 4:{
					break;
				}
				}
			}
			case 3:System.exit(0);
			break;
			default:System.out.println("Check Your Choice");
			break;
		}
		}
		}
		}

