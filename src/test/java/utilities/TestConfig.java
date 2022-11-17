package utilities;
public class TestConfig{


	
	public static String server="smtp.mail.yahoo.com";
	public static String from = "suresh_eee_2003@yahoo.com";
	public static String password = "gjakiuqgythdvzth";
	public static String[] to ={"haisureshskr@gmail.com","suresh.ku.kumar@oracle.com"};
	/*public static String server="phoenix50810.ad1.fusionappsdphx1.oraclevcn.com";
	public static String from = "HCMGPEUser5@mailtest.com";
	public static String password = "Welcome1";
	public static String[] to ={"HCMGPEUser1@mailtest.com","HCMGPEUser2@mailtest.com"};*/
	public static String subject = "Test Execution Project Report";
	public static String messageBody ="TestMessage";
	public static String attachmentPath="c:\\screenshot\\2017_10_3_14_49_9.jpg";
	public static String attachmentName="error.jpg";
	
	
	
	//SQL DATABASE DETAILS	
	public static String driver="oracle.jdbc.driver.OracleDriver"; 
	public static String dbConnectionUrl="jdbc:oracle:thin:@SLC11SHC.us.oracle.com:1521:xe"; 
	public static String dbUserName="emdbo"; 
	public static String dbPassword="emdbo123"; 
	
	
	//MYSQL DATABASE DETAILS
	public static String mysqldriver="com.mysql.jdbc.Driver";
	public static String mysqluserName = "emdbo";
	public static String mysqlpassword = "emdbo123";
	public static String mysqlurl = "jdbc:mysql://SLC11SHC.us.oracle.com";
	
}
