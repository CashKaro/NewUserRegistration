package libraries;

import com.relevantcodes.extentreports.LogStatus;
import features.ExcelSheet;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.joda.time.DateTime;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.time.Clock;
import java.util.*;


/**
* Created by 23319 on 28-12-2016.
*/
public class CommonLibrary {
    public static String newBrowser="";
    public static String oldBrowser="";
    public static String Desc=null;

    public static String stringHelperToGenerateUniqueLastName = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static Random rand = new Random();
    // consider using a Map<String,Boolean> to say whether the identifier is being used or not
    public static Set<String> identifiers = new HashSet<String>();


    public static HashMap settingsSheetInfo;

    /*public CommonLibrary(){

    }*/
    public static CommonLibrary commonInstance;

    CommonLibrary()
    {
        settingsSheetInfo = getSettingsSheetInfo();
    }

    public static HashMap<String, String> getSettingsSheetInfo()
    {
        HashMap<String,String> settingsSheetData = new HashMap<String,String>();
        try
        {
            DataFormatter formatter = new DataFormatter();
            FileInputStream file = new FileInputStream(new File(ReportLibrary.getPath()
                    +"\\testdata\\TestScenarios_Selector.xls"));
            //Create Workbook instance holding reference to .xlsx file
            HSSFWorkbook workbook = new HSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            HSSFSheet sheet = workbook.getSheet("Settings");
            int noOfRows = sheet.getLastRowNum();
            //System.out.println("no of rows:" + noOfRows);

            int i = 0;
            Row rowWithColumnNames = sheet.getRow(0);
            int noOfColumns = rowWithColumnNames.getPhysicalNumberOfCells();
            //System.out.println(noOfColumns);
            String settingsKey ="";
            String settingsValue = "";

            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();

            for(int m=0;m<=noOfRows;m++)
            {
                //System.out.println("Ieration number : " + m);
                Row rowCurrent = rowIterator.next();
                if(m<=0){
                    continue;
                }
                settingsKey = String.valueOf(rowCurrent.getCell(1));
                settingsValue = String.valueOf(rowCurrent.getCell(2));
                settingsSheetData.put(settingsKey,settingsValue);
            }
            file.close();
            return settingsSheetData;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;

    }
    public static Map getTestCasesTestData(String locOfFile)
    {
        HashMap<String,String> rowData = new HashMap<String,String>();
        try
        {
            DataFormatter formatter = new DataFormatter();
            FileInputStream file = new FileInputStream(new File(locOfFile));

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);
            int noOfRows = sheet.getLastRowNum();
            //System.out.println("no of rows:" + noOfRows);

            int i = 0;
            Row rowWithColumnNames = sheet.getRow(0);
            int noOfColumns = rowWithColumnNames.getPhysicalNumberOfCells();
            //System.out.println(noOfColumns);
            String testCaseName ="";
            String columnNamesAndValuesOfOneRow = "";

            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();

            // System.out.println(rowIterator

            for(int m=0;m<=noOfRows;m++)
            {
                //System.out.println("Ieration number : " + m);
                Row rowCurrent = rowIterator.next();
                if(m==0){
                    continue;
                }
                testCaseName = String.valueOf(rowCurrent.getCell(0));
                //     System.out.println("test case name " + testCaseName);

                for (int p = 0; p < noOfColumns; p++) {
                    //formatter.formatCellValue(rowWithColumnNames.getCell(p))=="" &&
                    //Igonre the columns without any column name in test case excel file
                    if(formatter.formatCellValue(rowWithColumnNames.getCell(p))=="")
                    {
                        continue;
                    }
                    columnNamesAndValuesOfOneRow = columnNamesAndValuesOfOneRow+formatter.formatCellValue((rowWithColumnNames.getCell(p))).trim()+
                            ":"+formatter.formatCellValue((rowCurrent.getCell(p))).trim()+";";

                }
                rowData.put(testCaseName,columnNamesAndValuesOfOneRow);
                columnNamesAndValuesOfOneRow="";

            }
            file.close();

            //Sorting the test case ids which are present in Hashmap(allTestCasesDataBeforeSort)
            Map<String, String> allTestCasesData = new TreeMap<String, String>(rowData);

            //System.out.println("After Sorting:");
            Iterator iterator = allTestCasesData.entrySet().iterator();
            while(iterator.hasNext()) {
                Map.Entry me = (Map.Entry)iterator.next();
            }

            return allTestCasesData;
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return null;

    }

    public static HashMap<String,String> dELEMEgetRunningTestCaseData(HashMap allTestCasesData)
    {
        //Defining variables to save data for each row
        String testCaseName = "";
        String colNamesAndValuesInfoString = "";
        String colNamesAndValuesInfoArray [];
        String keyName="";
        String keyValue="";

        //Creating a map object to keep each test case data
        HashMap<String,String> eachTestCaseData = new HashMap<String, String>(allTestCasesData);
        Iterator iterator1 = allTestCasesData.entrySet().iterator();

        while(iterator1.hasNext()) {
            Map.Entry me1 = (Map.Entry) iterator1.next();
            testCaseName = me1.getKey().toString();
            //this string holds all the columnn name and vlaue perticular syntax(Example - "PlazaId:099;PltRead:997;
            colNamesAndValuesInfoString = me1.getValue().toString();
            //this array holds column names and values for a single test case(row)
            colNamesAndValuesInfoArray = colNamesAndValuesInfoString.split(";");
            //column name and value are keeping here in a Map(eachTestCaseData)
            for (int i = 0; i <= colNamesAndValuesInfoArray.length - 1; i++) {
                keyName = colNamesAndValuesInfoArray[i].split(":")[0].toString();//keyname(column name)
                if (colNamesAndValuesInfoArray[i].split(":").length == 2) {
                    //key  value(actual value to be passed in xml)
                    keyValue = colNamesAndValuesInfoArray[i].split(":")[1].toString();
                } else {
                    keyValue = "";
                }
                eachTestCaseData.put(keyName, keyValue);
            }
        }
        return eachTestCaseData;
    }
public static HashMap getEachTestCaseData(ExcelSheet ex, String sheetName, int currentRowNumber) {

    DataFormatter formatter = new DataFormatter();
    XSSFRow rowWithColumnNames = null;
    try {
        rowWithColumnNames = ex.getRow(sheetName, 0);
    } catch (IOException e) {
        e.printStackTrace();
    }
    HashMap<String, String> eachTestCaseData = new HashMap();

    XSSFRow rowCurrent = null;
    try {
        rowCurrent = ex.getRow(sheetName, currentRowNumber);
    } catch (IOException e) {
        e.printStackTrace();
    }

    for (int p = 0; p < rowWithColumnNames.getLastCellNum(); p++) {
        //Igonre the columns without any column name in test case excel file
        if (formatter.formatCellValue(rowWithColumnNames.getCell(p)) == "") {
            continue;
        }
        eachTestCaseData.put(formatter.formatCellValue((rowWithColumnNames.getCell(p))).trim(), formatter.formatCellValue((rowCurrent.getCell(p))).trim());
        //System.out.println(eachTestCaseData);
    }
   //System.out.println(eachTestCaseData);
    return  eachTestCaseData;

}

    public static String randomIdentifier() {
        StringBuilder builder = new StringBuilder();
        while(builder.toString().length() == 0) {
            int length = rand.nextInt(5)+5;
            for(int i = 0; i < length; i++) {
                builder.append(stringHelperToGenerateUniqueLastName.charAt(rand.nextInt(stringHelperToGenerateUniqueLastName.length())));
            }
            if(identifiers.contains(builder.toString())) {
                builder = new StringBuilder();
            }
        }
        return builder.toString();
    }

    

    public static void launchBrowser(String url,String desc,String browserName)
    {
        newBrowser = browserName;
        if(!oldBrowser.equals(newBrowser))
        {
            try{
                FunctionLibrary.ObjDriver.quit();
                

            }
            catch (Exception e)
            {
                System.out.println("Webdriver is not yet initiated");
            }
            System.out.println(browserName);
            if(browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver",".\\src\\browserDrivers\\geckodriver.exe");
                DesiredCapabilities capabilities=DesiredCapabilities.firefox();
                capabilities.setCapability("marionette", true);
                FunctionLibrary.ObjDriver = new FirefoxDriver(capabilities);

            }else if(browserName.equalsIgnoreCase("chrome")) {

                System.setProperty("webdriver.chrome.driver", ".\\src\\browserDrivers\\chromedriver.exe");

                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                FunctionLibrary.ObjDriver = new ChromeDriver( );

            }else if(browserName.equalsIgnoreCase("iexplore")) {

                System.setProperty("webdriver.ie.driver",".\\src\\browserDrivers\\IEDriverServer.exe");
                FunctionLibrary.ObjDriver = new InternetExplorerDriver();
                //Get Browser name and version.
              //Get OS name.
            }else {
                System.out.println(FunctionLibrary.ObjDriver + " is not a supported browser");
            }

        }
        


       


        FunctionLibrary.ObjDriver.manage().window().maximize();
        Capabilities caps = ((RemoteWebDriver) FunctionLibrary.ObjDriver).getCapabilities();
        String browserName1 = caps.getBrowserName();
        String browserVersion = caps.getVersion();

        String os = System.getProperty("os.name").toLowerCase();
        //System.out.println("operating system: " + os);
        ReportLibrary.Add_Step(ReportLibrary.Test_Step_Number,"Test environment: Browser '" + browserName1 + "' of version '"
                + browserVersion + "' on OS '"+os+"'",LogStatus.INFO,false);
        FunctionLibrary.ObjDriver.navigate().to(url);
        oldBrowser=newBrowser;

    }


    
	
	

	
}//End of COmmon Library Class	



