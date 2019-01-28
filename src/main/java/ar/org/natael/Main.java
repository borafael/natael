package ar.org.natael;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Main {

	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("Uso: java -jar natael.jar <archivo>");
		}
		else {
			new Main().process(args[0]);;
		}
	}	
	
	public void process(String path) {
		try (InputStream inputStream = new FileInputStream(new File(path))) {
			
			Workbook workbook = new XSSFWorkbook(inputStream);
			Sheet sheet = workbook.getSheetAt(0);
			for(int rowIndex = 0; rowIndex < sheet.getPhysicalNumberOfRows(); rowIndex++) {
				Row row = sheet.getRow(rowIndex);
				for(int cellIndex = 0; cellIndex < row.getLastCellNum(); cellIndex++) {
					Cell cell = row.getCell(cellIndex);
					System.out.println(cell.getStringCellValue());
				}
				System.out.println("-----");
			}
 
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo encontrar el archivo: " + path);
		} catch (IOException e) {
			System.out.println("No se pudo acceder al archivo: " + path);
		}		
	}
}
