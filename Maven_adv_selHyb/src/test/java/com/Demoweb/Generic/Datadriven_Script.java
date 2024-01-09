package com.Demoweb.Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Datadriven_Script {
public static String getdata(String sheet, int r, int cel)
{
	FileInputStream fis;
	Workbook book= null;
	
	try
	{
		fis=new FileInputStream("./excel1/test2data.xlsx");
		book=WorkbookFactory.create(fis);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	Sheet sh = book.getSheet(sheet);
	Row ro = sh.getRow(r);
	Cell c = ro.getCell(cel);
	String value = c.toString();
	return value;
	
	
}
}
