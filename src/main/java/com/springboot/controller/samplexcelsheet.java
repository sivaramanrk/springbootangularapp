package com.springboot.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class samplexcelsheet {
	
	public static void main(String[] args) throws IOException {
		
		//System.out.println("Wel....");
				List<Employee1> triplist = new ArrayList<Employee1>();
				// List<Student> studentlist = new ArrayList<Student>();

				 FileInputStream file = new FileInputStream(new File("C:\\Users\\Swetha Sivaraman\\Downloads\\testexcel.xlsx"));
				 XSSFWorkbook workbook = new XSSFWorkbook(file);

				// XSSFSheet sheet = workbook.getSheetAt(0) ;

				// Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));

			//	InputStream in = file.getInputStream();

				//Workbook workbook = WorkbookFactory.create(in);
				Sheet sheet = null;

				Row row;
				int sheetcount = workbook.getNumberOfSheets();

				for (int k = 0; k <= sheetcount - 1; k++) {
					sheet = workbook.getSheetAt(k);
					

					for (int i = 1; i <= sheet.getLastRowNum(); i++) {
						Row firstrow = sheet.getRow(0);
						Employee1 emp = new Employee1();
						row = sheet.getRow(i);
						try {

							if (String.valueOf(firstrow.getCell(0)).equals("empid")) {
								if (row.getCell(0) != null) {
									//trip.setDatetime(row.getCell(0).toString());
									emp.setEmpid(row.getCell(0).toString());
								}
							}

							if (String.valueOf(firstrow.getCell(1)).equals("name")) {
								if (row.getCell(1) != null) {
									//trip.setLoadno(row.getCell(1).toString());
									//trip.setLoadno(new DataFormatter().formatCellValue(row.getCell(1)));
									//System.out.println("destinatio "+row.getCell(1).toString());
									emp.setName(row.getCell(1).toString());

									
								}
							}

							if (String.valueOf(firstrow.getCell(2)).equals("address")) {
								if (row.getCell(2) != null) {
									emp.setAddress(row.getCell(2).toString());
									
									//trip.setTripNo(row.getCell(2).toString());
								//	System.out.println("orgin "+row.getCell(2).toString());
								}
							}

							
							triplist.add(emp);

						} catch (NullPointerException e) {
							// System.out.println("Null caught..");
						}
						// System.out.println(trip.getDestination() + " " + trip.getLoadNo()+"
						// "+trip.getInvoiceNO());
					}

				}

		/*
		 * for(Employee1 e:triplist) { System.out.println("emp: "+e.getAddress() +
		 * " "+e.getEmpid()); }
		 */
				
				workbook.close();
				
				
				//exce 2
				
				
				List<Employee1> triplist2 = new ArrayList<Employee1>();
				// List<Student> studentlist = new ArrayList<Student>();

				 FileInputStream file2 = new FileInputStream(new File("C:\\Users\\Swetha Sivaraman\\Downloads\\testexcel2.xlsx"));
				 XSSFWorkbook workbook2 = new XSSFWorkbook(file2);

				// XSSFSheet sheet = workbook.getSheetAt(0) ;

				// Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));

			//	InputStream in = file.getInputStream();

				//Workbook workbook = WorkbookFactory.create(in);
				Sheet sheet2 = null;

				Row row2;
				int sheetcount2 = workbook2.getNumberOfSheets();

				for (int k = 0; k <= sheetcount2 - 1; k++) {
					sheet2 = workbook2.getSheetAt(k);
					

					for (int i = 1; i <= sheet.getLastRowNum(); i++) {
						Row firstrow2 = sheet2.getRow(0);
						Employee1 emp2 = new Employee1();
						row2 = sheet2.getRow(i);
						try {

							if (String.valueOf(firstrow2.getCell(0)).equals("empid")) {
								if (row2.getCell(0) != null) {
									//trip.setDatetime(row.getCell(0).toString());
									emp2.setEmpid(row2.getCell(0).toString());
								}
							}

							if (String.valueOf(firstrow2.getCell(1)).equals("name")) {
								if (row2.getCell(1) != null) {
									//trip.setLoadno(row.getCell(1).toString());
									//trip.setLoadno(new DataFormatter().formatCellValue(row.getCell(1)));
									//System.out.println("destinatio "+row.getCell(1).toString());
									emp2.setName(row2.getCell(1).toString());

									
								}
							}

							if (String.valueOf(firstrow2.getCell(2)).equals("address")) {
								if (row2.getCell(2) != null) {
									emp2.setAddress(row2.getCell(2).toString());
									
									//trip.setTripNo(row.getCell(2).toString());
								//	System.out.println("orgin "+row.getCell(2).toString());
								}
							}

							
							triplist2.add(emp2);

						} catch (NullPointerException e) {
							// System.out.println("Null caught..");
						}
						// System.out.println(trip.getDestination() + " " + trip.getLoadNo()+"
						// "+trip.getInvoiceNO());
					}

				}
				
				
				
				
			ArrayList<Employee1> empl= new ArrayList<>(); 
				 
				//for(Employee1 emp1:triplist) {
					for(int i=0;i<triplist.size();i++) {
					int k=0;
					Employee1 em1=null;
					Employee1 em2 = null;
					
				//for(Employee1 e:triplist2) {
					for(int j=0;j<triplist2.size();j++) {
						em1=triplist.get(i);
						em2=triplist.get(j);
						
					if(em1.getEmpid().equals(em2.getEmpid()))
					{
						System.out.println("matched.."+em1.getEmpid());
						k++;
						

				}else {
					System.out.println("not matched.."+em2.getEmpid());
				}
				}
					
					if(k!=0) {
						empl.add(triplist.get(i));
						System.out.println("matched..");
					}else {
						System.out.println("not matched.."+em2.getEmpid());
					}
				}
				
				
				workbook.close();	

				//Set<TripSheet> response = tripSheetService.createTripSheetByExcel(triplist);

			//	return response;
				
				
				
		
	}

}
