package com.qa.utilities;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	public static Object[][] getLoginData() {

	    List<Object[]> dataList = new ArrayList<>();

	    try {

	        FileInputStream fis =
	            new FileInputStream(
	            "testdata/LoginData.xlsx");

	        Workbook workbook =
	            new XSSFWorkbook(fis);

	        Sheet sheet =
	            workbook.getSheetAt(0);

	        int rows =
	            sheet.getLastRowNum();

	        for(int i = 1; i <= rows; i++) {

	            Row row = sheet.getRow(i);

	            if(row == null)
	                continue;

	            Cell userCell =
	            	    row.getCell(0);

	            	Cell passCell =
	            	    row.getCell(1);

	            	Cell expectedCell =
	            	    row.getCell(2);

	            	if(userCell == null
	            	        || passCell == null
	            	        || expectedCell == null)
	            	    continue;

	            	dataList.add(
	            	    new Object[] {

	            	        userCell.toString(),

	            	        passCell.toString(),

	            	        expectedCell.toString()

	            	    }
	            	);

	        }

	        workbook.close();

	    } catch(Exception e) {

	        e.printStackTrace();
	    }

	    Object[][] data =
	        new Object[dataList.size()][3];

	    for(int i=0;i<dataList.size();i++) {

	        data[i] = dataList.get(i);

	    }
	    

	    return data;
	}
}