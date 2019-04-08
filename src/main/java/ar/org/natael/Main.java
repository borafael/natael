package ar.org.natael;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

class Main {

	private static final int LAST_NAME_COLUMN_INDEX = 0;
	private static final int FIRST_NAME_COLUMN_INDEX = 1;

	public static void main(String[] args) throws Exception {
		File file = new File("/Users/rbarrera/repos/natael/invitados.xlsx");
		
		org.apache.poi.ss.usermodel.Workbook workbook = WorkbookFactory.create(file);
		List<Guest> guests = new ArrayList<Guest>();
		Sheet sheet = workbook.getSheetAt(0);
		for (int rowIndex = 1; rowIndex < sheet.getPhysicalNumberOfRows() - 1; rowIndex++) {
			Row row = sheet.getRow(rowIndex);
			guests.add(new Guest.Builder()
					.firstName(row.getCell(FIRST_NAME_COLUMN_INDEX).getStringCellValue())
					.lastName(row.getCell(LAST_NAME_COLUMN_INDEX).getStringCellValue()).build());
			System.out.println(row.getCell(2).getNumericCellValue());
		}
	}
}
