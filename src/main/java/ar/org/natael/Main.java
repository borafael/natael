package ar.org.natael;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

class Main {

	private static final int FIRST_NAME_COLUMN_INDEX = 0;
	private static final int LAST_NAME_COLUMN_INDEX = 1;
	private static final int EMAIL_COLUMN_INDEX = 2;
	private static final int STATE_COLUMN_INDEX = 7;

	public static void main(String[] args) {

		if (args.length == 0) {
			System.out.println("Uso: java -jar natael.jar <archivo>");
		} else {
			new Main().process(args[0]);
		}
	}

	private List<Guest> loadGuests(InputStream inputStream) throws IOException {
		Workbook workbook = new XSSFWorkbook(inputStream);
		List<Guest> guests = new ArrayList<Guest>();
		Sheet sheet = workbook.getSheetAt(0);
		for (int rowIndex = 1; rowIndex < sheet.getPhysicalNumberOfRows() - 1; rowIndex++) {
			Row row = sheet.getRow(rowIndex);
			guests.add(new Guest.Builder()
					.firstName(row.getCell(FIRST_NAME_COLUMN_INDEX).getStringCellValue())
					.lastName(row.getCell(LAST_NAME_COLUMN_INDEX).getStringCellValue())
					.email(row.getCell(EMAIL_COLUMN_INDEX).getStringCellValue())
					.state(Guest.STATE.valueOf(row.getCell(STATE_COLUMN_INDEX).getStringCellValue()))
					.build());
		}
		return guests;
	}

	public void process(String path) {
		try (InputStream inputStream = new FileInputStream(new File(path))) {
			List<Guest> guests = loadGuests(inputStream);
			guests.stream()
				.filter(guest -> Guest.STATE.PENDIENTE.equals(guest.getState()))
				.map(Guest::toString)
				.sorted()
				.forEach(System.out::println);
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo encontrar el archivo: " + path);
		} catch (IOException e) {
			System.out.println("No se pudo acceder al archivo: " + path);
		}
	}
}
