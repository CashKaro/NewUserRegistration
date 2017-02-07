package features;

import com.relevantcodes.extentreports.LogStatus;
import libraries.CommonLibrary;
import libraries.FunctionLibrary;
import libraries.ReportLibrary;
import org.joda.time.DateTime;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.HashMap;
import static objectProperties.OR.*;

public  class CashKaro_simple
{

    //private static final Logger LOG = LoggerFactory.getLogger(SiebelAccountCreation.class);
	 public static WebDriver browser= FunctionLibrary.ObjDriver;
   
    public static String CaptchaText,currentTcBrowser;
    //public static String URL="https://cashkaro.iamsavings.co.uk";
    public static String Firstname,email,password,confirmEmail,choosePassword;
    public static String applicationUrl,Desc;
  
 @SuppressWarnings("unchecked")
public static void CashKaro_simple() throws IOException, Exception {
	try{
	 //Read input excel sheet for test data
	    ExcelSheet exl=new ExcelSheet();
 
	 int noOfTestCases=exl.totalrows("TestData","Registration");
	 for(int iterator=1;iterator<=noOfTestCases;iterator++)
     {
	 
	 HashMap<String,String> eachTestCaseData =new HashMap<String, String>();
	 eachTestCaseData= CommonLibrary.getEachTestCaseData(exl,"Registration",iterator);
	  Firstname=eachTestCaseData.get("Firstname");
      email=eachTestCaseData.get("Email");
      confirmEmail=eachTestCaseData.get("ConfirmEmail");
      currentTcBrowser =eachTestCaseData.get("Browser Type");
      choosePassword =eachTestCaseData.get("ChoosePassword");
      applicationUrl = CommonLibrary.getSettingsSheetInfo().get("URL_QA").toString();
      ReportLibrary.Add_Step(ReportLibrary.Test_Step_Number,"<b>"+eachTestCaseData.get("TestCaseId")+"</b>"+
 				": Test Case Execution is started....................... <br>"
 				+ "Test case description: " + eachTestCaseData.get("TestCaseDesc"), LogStatus.INFO, false);
      
      CommonLibrary.launchBrowser(applicationUrl.toString(), "Launching CashKaro app",currentTcBrowser);
//==Registration:
registration(Firstname,email,confirmEmail,choosePassword);
  }
	}catch(Exception e){
		String Errormsg=e.getMessage();
		ReportLibrary.Add_Step(ReportLibrary.Test_Step_Number, "Expected: "+Desc+""+"<br>"+"Actual: Execution Failed due to: <br>"+Errormsg, LogStatus.FAIL, true);
	}
//Similarly can be done for signin and forget password as well 	 
//==Sign-In:
	try{
//signIn(Firstname,password);
	}catch(Exception e){}  
//==Forgot Password:
	try{
//forgetPassword(email);

 
 }catch(Exception e){ }
}//End of class
 
 private static void registration(String FirstName,String Email,String ConfirmEmail,String ChoosePassword) {
	 //FunctionLibrary.clickObject(joinFreeBtn, "", "Click sign in button");
	 Desc="Click on joinFree button";
	 FunctionLibrary.ObjDriver.findElement(By.xpath("//a[@class='fl last']")).click();
	 FunctionLibrary.setText(fullNameTxtBox,FirstName, "Setup Full Name");
	 Desc="Setup email";
	 FunctionLibrary.setText(emailTxtBox,Email, Desc);
	 /*Desc= "Setup Password ";
	 FunctionLibrary.setText(choosePasswordTxtBox,ChoosePassword,Desc);*/
	 Desc="Setup confirmation email";
	 FunctionLibrary.setText(confirmEmailTxtBox,ConfirmEmail,Desc );
	 Desc= "Setup Password ";
	 FunctionLibrary.ObjDriver.findElement(By.name("pwd-txt")).click();
	 FunctionLibrary.ObjDriver.findElement(By.name("pwd-txt")).sendKeys(ChoosePassword);
	 //code for entering Captcha
	//Add code for captcha
	 Desc="Enter Captcha";
	 CaptchaText=FunctionLibrary.ObjDriver.findElement(By.xpath("//img[@title='security code']")).getAttribute("src");
	 FunctionLibrary.clickObject(joinFreeNowBtn, "", "Click sign in button");
	 
	 
	 
	 
		/*browser.findElement(By.id("firstname")).sendKeys(FirstName);
		browser.findElement(By.id("email")).sendKeys(Email);
		browser.findElement(By.id("con_email")).sendKeys(Email);
		browser.findElement(By.name("pwd-txt")).sendKeys(Password);*/
		
		browser.findElement(By.name("to_be_check")).sendKeys(CaptchaText);
		browser.findElement(By.id("join_free_submit")).click();
		
	}
 public static void signIn(String UserName,String Password){
	 browser.get(applicationUrl);
	 browser.manage().window().maximize();
	 browser.findElement(By.linkText("SIGN IN")).click();
	 browser.switchTo().frame(browser.findElement(By.className("cboxIframe")));
	 browser.findElement(By.id("uname")).sendKeys(UserName);
	 browser.findElement(By.id("pwd-txt")).sendKeys(Password);
	 browser.findElement(By.id("sign_in")).click();
 }


public static void forgetPassword(String Email) throws InterruptedException{
	
	browser.get(applicationUrl);
	browser.manage().window().maximize();
	browser.findElement(By.linkText("SIGN IN")).click();
	Thread.sleep(2000);
	browser.switchTo().frame(browser.findElement(By.className("cboxIframe")));
	browser.findElement(By.xpath("//a[@class='fl link']")).click();
	browser.findElement(By.id("from_email")).sendKeys(Email);
	browser.findElement(By.id("submit_req")).click();

}
		 
 }     