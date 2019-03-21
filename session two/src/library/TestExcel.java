package library;

public class TestExcel {

	public static void main(String[] args) {
		
		
		ExcelDataConfig obj = new ExcelDataConfig("C:\\Users\\patel\\Downloads\\SData.xlsx\\");
		String data = obj.getData("StudentAttendance", 2, 1);
		
	
	}

}
