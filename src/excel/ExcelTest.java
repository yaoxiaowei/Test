/** 
 * @Desription: TODO
 * @Company: CSN
 * @ClassName: ExcelTest.java
 * @Author: YaoXiaowei
 * @CreateDate: 2014-6-10
 * @UpdateUser: YaoXiaowei
 * @Version: 0.1
 */
package excel;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.dev.HSSF;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.hssf.util.Region;

public class ExcelTest {
	public static void main(String[] args) throws Exception {
		test1();
	}

	public static void test2() throws Exception {
		HSSFWorkbook wb = new HSSFWorkbook();
		HSSFSheet sheet = wb.createSheet("new sheet");
		HSSFRow row = null;
		HSSFCell cell = null;
		HSSFCellStyle style = wb.createCellStyle();

		// Aqua background
//		
//		style.setFillBackgroundColor(HSSFColor.AQUA.index);
//		style.setFillPattern(HSSFCellStyle.BIG_SPOTS);
//		HSSFCell cell = row.createCell((short) 1);
//		cell.setCellValue("X");
//		cell.setCellStyle(style);

		// Orange "foreground",
		// foreground being the fill foreground not the font color.
		style = wb.createCellStyle();
		style.setFillForegroundColor(HSSFColor.ORANGE.index);
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);

		for (int x = 0; x < 1000; x++) {

			// Create a row and put some cells in it. Rows are 0 based.
			row = sheet.createRow((short) x);

			for (int y = 0; y < 100; y++) {
				cell = row.createCell((short) y);
				cell.setCellValue("X");
				cell.setCellStyle(style);
			}
		}

		// Write the output to a file
		FileOutputStream fileOut = new FileOutputStream("G:/test.xls");
		wb.write(fileOut);
		fileOut.close();
	}

	public static void test1() {
		FileOutputStream out = null;
		try {
			out = new FileOutputStream("G:/test.xls");

			HSSFWorkbook wb = new HSSFWorkbook();
			HSSFSheet s = wb.createSheet();
			wb.setSheetName(0, "ComplainTaskDetailReport");
			
			HSSFCellStyle style = wb.createCellStyle();
			HSSFFont font = wb.createFont();
		    font.setFontName("Courier New");
		    font.setItalic(true);
		    font.setColor(HSSFColor.GREEN.index);
		    font.setUnderline((byte)1);
		    font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		    font.setFontHeightInPoints((short)20);
		    style.setFont(font);

			HSSFRow row0 = s.createRow(0);
			HSSFCell _cell = row0.createCell((short) 0);
			HSSFCell _cell1 = row0.createCell((short) 1);
			HSSFCell _cell2 = row0.createCell((short) 2);
			HSSFCell _cell3 = row0.createCell((short) 3);
			HSSFCell _cell4 = row0.createCell((short) 4);
			HSSFCell _cell5 = row0.createCell((short) 5);

			_cell.setEncoding(HSSFCell.ENCODING_UTF_16);
			_cell1.setEncoding(HSSFCell.ENCODING_UTF_16);
			_cell2.setEncoding(HSSFCell.ENCODING_UTF_16);
			_cell3.setEncoding(HSSFCell.ENCODING_UTF_16);
			_cell4.setEncoding(HSSFCell.ENCODING_UTF_16);
			_cell5.setEncoding(HSSFCell.ENCODING_UTF_16);

			_cell.setCellValue("投诉单号");
			_cell1.setCellValue("分派单位");
			_cell2.setCellValue("要求回复时间");
			_cell3.setCellValue("处理时间");
			_cell4.setCellValue("处理部门");
			_cell5.setCellValue("处理人");

			s.addMergedRegion(new Region(3, (short) 3, 5, (short) 5));
			HSSFRow row3 = s.createRow(3);
			HSSFCell cell = row3.createCell((short) 3);
			cell.setEncoding(HSSFCell.ENCODING_UTF_16);
			cell.setCellValue("你好");
			cell.setCellStyle(style);

			wb.write(out);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null)
					out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
