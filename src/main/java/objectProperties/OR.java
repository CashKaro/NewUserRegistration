package objectProperties;

//package FLCSS.floridaautomationtestsuite.object.repository;

/**
* Created by 31586 on 13-12-2016.
*/
public class OR {
	
	//**************************************************************
	public static String joinFreeBtn="xpath=//a[@class='fl last']";
    public static String fullNameTxtBox="id=firstname";
    public static String emailTxtBox="id=email";
    public static String confirmEmailTxtBox="id=con_email";
    public static String choosePasswordTxtBox="id=pwd-txt";
    public static String signIn="linkText=SIGN IN";
    public static String joinFreeNowBtn="id=join_free_submit";
    public static String homePageVerificationTxt="xpath=(.//div[@class='Welcome'])[1]";
    //Properties for Logout
    public static String logoutSettingImage="xpath=//li[@id='tb_0']";
    public static String logoutButton="xpath=//span[@class='siebui-icon-logout']";


    //Properties of Entering basic details of Account Creation

   
    public static String newAccountOpeningBtn="xpath=.//*[@title='Private:New']";
    public static String accountOpeningPageVerificationTxt="xpath=.//*[@aria-label='Agency']";
    public static String agencyNameTxtBox="xpath=.//*[@aria-label='Agency']";
    public static String accountPINTxtBox="xpath=.//*[@aria-labelledby='VAT_registration_number_Label']";
    //public static String accountPINTxtBox="xpath=.//*[@name='s_3_1_31_0']";
    public static String clicksecurityQuestionDropdown="xpath=.//*[@aria-labelledby='VehicleCount_Label']//following::span[1]";
    //public static String clicksecurityQuestionDropdown="xpath=.//*[@aria-labelledby='VehicleCount_Label']";
    //public static String selectSecutiryQuestionValueDropdown="xpath=";
    public static String securityAnswerTxtBox="xpath=.//*[@aria-labelledby='DeviceSoldCount_Label']";
    public static String accountEmailIDTxtBox="xpath=.//*[@aria-label='Email Address']";
    public static String statementTypeTxtBox="xpath=.//*[@aria-labelledby='Statement_Delivery_Frequency_Label']";
    public static String preferredLanguageTxtBox="xpath=.//*[@aria-labelledby='Correspondence_Language_Preference_Label']";
    public static String accountDetailsSaveBtn="xpath=.//*[@title='Private:Save']";
    //public static String sectionOneRowCounter="xpath=.//*[@id='s_3_rc' and contains(text(),'1 of 1+')]";
    public static String sectionOneRowCounter="xpath=(.//*[@class='siebui-appletmenu-btn'])[3]//following::span[1]";

    //Properties of Entering Contact Details

    public static String contactDetailsNewBtn="xpath=.//*[@title='Contacts:New']";
    public static String contactDetailsLstNameElement="xpath=//*[contains(@aria-labelledby, '_Last_Name') and contains(@id,'_Last_Name')]";
    //public static String contactDetailsLstNameElement="xpath=.//input[@id='1_Last_Name']";
    //public static String contactDetailsLstNameTxtBox="xpath=.//*[@id='1_Last_Name']";
    public static String contactDetailsLstNameTxtBox="xpath=//input[@name='Last_Name']";
    
    public static String contactDetailsFrstNameElement="xpath=//*[contains(@aria-labelledby, '_First_Name') and contains(@id,'_First_Name')]";
    public static String contactDetailsFrstNameTxtBox="xpath=.//*[@id='1_First_Name']";
    public static String contactDetailsPhnNoElement="xpath=//*[contains(@aria-labelledby, 'Contact_Phone_Number') and contains(@id,'Contact_Phone_Number')]";
    public static String contactDetailsPhnNoTxtBox="xpath=.//*[@name='Contact_Phone_Number']";
    public static String contactDetailsSaveBtn="xpath=.//*[@title='Contacts:Save']";
    //public static String sectionTwoRowCounter="xpath=.//*[@id='s_1_rc' and contains(text(),'1 - 1 of 1')]";
    public static String sectionTwoRowCounter="xpath=(.//*[@class='siebui-appletmenu-btn'])[2]//following::span[1]";
    //Properties of Entering Address Details

    public static String addressDetailsNewBtn="xpath=//button[@title='Addresses:New']";
    public static String addressDetailsAddressTypeBtn="xpath=.//*[@id='1_Address_Type']//following::span[1]";
    public static String addressDetailsAddress1Element="xpath=//*[contains(@aria-labelledby, 'Street_Address') and contains(@id,'Street_Address')]";
    public static String addressDetailsAddress1TxtBox="xpath=.//*[@id='1_Street_Address']";
    public static String addressDetailsCityElement="xpath=//*[contains(@aria-labelledby, '_City') and contains(@id,'_City')]";
    public static String addressDetailsCityTxtBox="xpath=.//*[@id='1_City']";
    public static String addressDetailsPostalCodeELement="xpath=//*[contains(@aria-labelledby, '_Postal_Code s') and contains(@id,'_Postal_Code')]";
    public static String addressDetailsPostalCodeTxtBox="xpath=.//*[@id='1_Postal_Code']";
    public static String addressDetailsStateElement="xpath=//*[contains(@aria-labelledby, '_State s') and contains(@id,'_State s')]";
    public static String addressDetailsStateTxtBox="xpath=.//*[@id='1_State']";
    public static String addressDetailsCountryElement="xpath=//*[contains(@aria-labelledby, '_Country s') and contains(@id,'_Country s')]";
    public static String addressDetailsCountryTxtBox="xpath=.//*[@id='1_Country']";
    public static String addressDetailsSaveBtn="xpath=.//*[@title='Addresses:Save']";
    //public static String sectionThreeRowCounter="xpath=.//*[@id='s_2_rc' and contains(text(),'1 - 1 of 1')]";
    public static String sectionThreeRowCounter="xpath=(.//*[@class='siebui-appletmenu-btn'])[3]//following::span[1]";

    //Properties of Entering Details under Replenishment Tab

    public static String replenishmentTab="xpath=//a[contains(text(),'Replenishments')]";
    public static String replenishmentDetailsNewBtn="xpath=.//*[@title='Account Replenishment Info List:New']";
    public static String replenushmentDetailsPrimaryChkBox="xpath=.//*[@id='IsPrimary']";
    public static String replenishmentDetailsRebillPayTypeDropdown="xpath=.//*[@id='PaymentType']";
    public static String creditCardNoField="xpath=//*[@id='CCField']";
    public static String creditCardExpMpnth="xpath=//*[@id='ExpMonth']";
    public static String creditCardExpYear="xpath=//*[@id='ExpYear']";
    
    public static String replenishmentDetailsSaveBtn="xpath=.//*[@id='saveReBlInf']";
    public static String replenishmentPlanTypeDropdown="xpath=//span[@class='siebui-icon-dropdown']";
    public static String replenishmentPlanNameTextBoxElement="xpath=//span[@class='cell-wrapperleaf']";
    public static String replenishmentPlanNameTextBox="//*[contains(@aria-labelledby, '_Plan_Name') and contains(@id,'_Plan_Name')]";

    //Properties of Entering Details under Vehicles Tab

    public static String vehiclesTab="xpath=//a[contains(text(),'Vehicles')]";
    public static String vehiclesDetailsNewBtn="xpath=.//*[@title='Vehicles:New']";
    public static String vehiclesDetailsPlateNumberTxtBox="xpath=.//*[@id='1_Plate_Number']";
    public static String vehicleDetailsPlateStateElement="xpath=//*[contains(@aria-labelledby, '_Plate_State s') and contains(@id,'_Plate_State')]";
    public static String vehicleDetailsPlateStateTxtBox="xpath=.//*[@id='1_Plate_State']";
    public static String vehicleDetailsPlateTypeElement="xpath=.//*[@id='1_s_1_l_Plate_Type']";
    public static String vehicleDetailsPlateTypeTxtBox="xpath=.//*[@id='1_Plate_Type']";
    public static String vehicleDetailsPlateCountryElement="xpath=//*[contains(@aria-labelledby, '_Plate_Country s') and contains(@id,'_Plate_Country')]";
    public static String vehicleDetailsPlateCountryTxtBox="xpath=.//*[@id='1_Plate_Country']";
    public static String vehicleDetailsVehicleTypeElement="xpath=.//*[@id='1_s_1_l_Vehicle_Type']";
    public static String vehicleDetailsVehicleTypeTxtBox="xpath=.//*[@id='1_Vehicle_Type']";
    public static String vehicleDetailsVehicleYearElement="xpath=//*[contains(@aria-labelledby, '_Year_of_Vehicle s') and contains(@id,'_Year_of_Vehicle')]";
    public static String vehicleDetailsVehicleYearTxtBox="xpath=.//*[@id='1_Year_of_Vehicle']";
    public static String vehicleDetailsVehicleMakeElement="xpath=//*[contains(@aria-labelledby, '_Vehicle_Make s') and contains(@id,'_Vehicle_Make')]";
    public static String vehicleDetailsVehicleMakeTxtBox="xpath=.//*[@id='1_Vehicle_Make']";
    public static String vehicleDetailsVehicleModelElement="xpath=//*[contains(@aria-labelledby, '_Vehicle_Model') and contains(@id,'_Vehicle_Model')]";
    public static String vehicleDetailsVehicleModelTxtBox="xpath=.//*[@id='1_Vehicle_Model']";
    public static String vehicleDetailsSaveBtn="xpath=.//*[@title='Vehicles:Save']";


    //Properties of Entering Details under Device Request Tab

    public static String deviceRequestTab="xpath=//a[contains(text(),'Device Request')]";
    public static String deviceDetailsNewBtn="xpath=.//*[@title='Device Requests:New']";
    public static String deviceDetailsSmartIssueIdTxtBox="xpath=//*[@id='1_Smart_Issue_Id']";
    public static String deviceDetailsPlateNumberElement="xpath=//*[contains(@aria-labelledby, '_Plate_Number') and contains(@id,'_Plate_Number')]";

    public static String deviceDetailsPlateNumberTxtBox="xpath=.//*[@name='Plate_Number']";
    public static String deviceDetailsQuantityElement="xpath=//*[contains(@aria-labelledby, 'Quantity') and contains(@id,'Quantity')]";
    public static String deviceDetailsQuantityTxtBox="xpath=.//*[@id='1_Quantity']";
    public static String deviceDetailsSaveBtn="xpath=.//*[@title='Device Requests:Save']";


    //Properties of Entering Details under Plans Tab and Payment details

    public static String plansTab="xpath=//a[contains(text(),'Plans')]";


    public static String plansNewButton ="xpath=.//button[@title='New']";
    public static String planTypeDropDownBtn = "xpath=.//*[@id='1_Plan_Name']//following::span[1]";
    //public static String planAlreadyExisted = "//*[contains(@aria-labelledby, '_l_Plan_Name s_') and contains(@id,'_l_Plan_Name')]";
    public static String govtAgencyPolice="xpath=//td[@title='Police']";
    public static String planAlreadyExisted = "//*[contains(@aria-labelledby, '_l_Plan_Name s_')]";
    public static String planDeleteButton="xpath=//span[text()='Delete']";
    public static String govtAgencyTextbox="xpath=//*[@title='GOVPOST']//following::td[5]";
    public static String plansTabPayBtn="xpath=.//*[@title='Pay']";
    public static String paymentDetailsNewBtn="xpath=.//*[@title='Payments List:New']";
    public static String paymentDetailsPaymentTypeDropdown="xpath=.//select[@id='PaymentType']";
    public static String paymentDetailsBankAccountNbrTxtBox="xpath=.//input[@id='BankNum']";
    public static String paymentDetailsRoutingNbrTxtBox="xpath=.//input[@id='RoutingNum']";
    public static String paymentDetailsBankAccntFrstNameTxtBox="xpath=.//input[@id='CCFirstName']";
    public static String paymentDetailsBankAccntLstNameTxtBox="xpath=.//input[@id='CCLastName']";
    public static String paymentDetailsStreetAddressTxtBox="xpath=.//input[@id='BlAddress']";
    public static String paymentDetailsZipCodeTxtBox="xpath=.//input[@id='BlZipCode']";
    public static String paymentDetailsCityTxtBox="xpath=.//input[@id='BlCity']";
    public static String paymentDetailsStateDropdown="xpath=.//select[@id='BlState']";
    public static String paymentDetailsCountryDropdown="xpath=.//select[@id='BlCountry']";
    public static String paymentDetailsInfoSaveBtn="xpath=//button[@id='saveReBlInf']";
    public static String paymentListSaveBtn="xpath=//button[@title='Payments List:Save']";
    public static String processPayBtn="xpath=//button[@title='Payments List:Process Pay']";
    public static String checkPay="xpath=//*[@id='ChkNumber']";


    public static String accountNumberFieldTxt="xpath=//input[@aria-label='Acct #']";
    
    //**********************----***********************************************************//
    //Properties for Commercial/Business
  //properties to change Logon Mode
    public static String clickOnTool="xpath=//span[@class='ui-button-text' and text()='Tools']";
    public static String clickOnUserPreference="xpath=//a[@href='javascript:void(0)' and text()='User Preferences']";
    public static String clickOnLogOnModeIcon="xpath=.//*[@aria-label='Logon Mode']//following::span[1]";
    public static String clickOnSave="xpath=//button[@title='User Profile:Save']";
    public static String businessOrCommAcoDetailsSaveBtn="xpath=.//*[@title='Business/Commercial:Save']";
    
    //Properties for change to commercial account type
    public static String siteMapImage="xpath=//span[@class='siebui-icon-tb-sitemap ToolbarButtonOn glyphicon']";
    public static String administrativeUserLink="xpath=//*[text()='Administration - User' and contains(@id,'s_sma')]";
    public static String employeeLink="xpath=(.//*[@id='s_smc_00' and text()='Employees'])[1]";
    public static String employeeSearchComboBoxIcon="xpath=.//*[@aria-label='Find']//following::span[1]";
    public static String selectLoginName="xpath=.//*[@data-lovtype='Employee List Applet:QueryComboBox' and text()='Login Name']";
    public static String loginnameTextBox="xpath=//input[@class='siebui-ctrl-input siebui-align-left siebui-input-align-left s_1_1_16_0']";
    public static String selectGo="xpath=//button[@class='siebui-ctrl-btn siebui-icon-find s_1_1_20_0 appletButton']";
   // public static String commercialAccountSelect="xpath=.//*[@aria-label='Commercial Account Open']//following::span[1]";
   // public static String clickOnSaveCommercialAccount="xpath=//button[@title='Employee Form:Save']";
     public static String clickOnSaveCommercialAccount="xpath=//button[@title='Employee:Save']";
    //public static String clickOnBusinessCommercialAccount="xpath=//a[@href='#s_sctrl_tabView_noop' and text()='Business/Commercial Open Account View']";
    public static String clickOnBusinessCommercialAccount="xpath=//a[@class='ui-tabs-anchor' and text()='Business/Commercial Open Account View']";
    public static String clickOnNewButton="xpath=//button[@class='siebui-ctrl-btn appletButton siebui-icon-newrecord s_1_1_61_0']";
   /* //public static String selectSecutiryQuestionValueDropdown="xpath=";
    public static String securityAnswerTxtBox="xpath=.//*[@aria-labelledby='DeviceSoldCount_Label']";
    public static String accountEmailIDTxtBox="xpath=.//*[@aria-label='Email Address']";
    public static String statementTypeTxtBox="xpath=.//*[@aria-labelledby='Statement_Delivery_Frequency_Label']";
    public static String preferredLanguageTxtBox="xpath=.//*[@aria-labelledby='Correspondence_Language_Preference_Label']";
    public static String accountDetailsSaveBtn="xpath=.//*[@title='Private:Save']";
    public static String sectionOneRowCounter="xpath=.//*[@id='s_3_rc' and contains(text(),'1 of 1+')]";*/
    
    //for business and commercial extra added mandatory fields
    public static String accountNameTextBox ="xpath=.//*[@aria-label='Account Name']";
    public static String dbaNameTextBox="xpath=.//*[@aria-label='DBA Name']";
    public static String externalTextBox="xpath=.//*[@aria-label='External Reference #']";
    public static String FEINTextBox="xpath=.//*[@aria-label='FEIN']";
    public static String planNameDropDownIcon="xpath=//span[@class='siebui-icon-dropdown']";

    // account maintenance properties
    public static String accountCompanyNameTxtBox = "//*[contains(@aria-labelledby, 'Company Name')]";
    public static String commercialAccountSelect="xpath=.//input[@type='checkbox' and @aria-labelledby='Commercial_Account_Open_Label']";
    
    //******************************************************************************************************************************
  //For verify account info on payment  page
    public static String agencyName ="xpath=.//*[@aria-label='Agency']";
       public static String accName ="xpath=.//*[@aria-label='Acct Name']";
       public static String accType="xpath=.//*[@aria-label='Acct Type']";
       public static String accStatus="xpath=.//*[@aria-label='Acct Status']";
       public static String finRebilStatus ="xpath=.//*[@aria-label='Fin Sts/Rebill']";
       public static String rebillType="xpath=.//*[@aria-label='Rebill Type']";
       public static String challengeQuestion="xpath=.//*[@aria-label='Challenge QA']";
       public static String ChallengeAnswer="xpath=.//*[@aria-label='Challenge Answer']";

       public static String accNumber="xpath=.//*[@aria-label='Acct #']";
       public static String noOfDevices="xpath=.//*[@aria-label='# of Devices']";
       public static String noOfVehicles="xpath=.//*[@aria-label='# of Vehicles']";
       public static String noOfOpenSr="xpath=.//*[@aria-label='# of Open SR']";
       public static String noOfOpenInv="xpath=.//*[@aria-label='# of Open Inv']";
       public static String linkAccBalance="xpath=.//*[@aria-label='Link Account Balance']";
       public static String accBalance="xpath=.//*[@aria-label='Acct Bal']";
       public static String pptlBalance="xpath=.//*[@aria-label='PPTL Bal']";
       public static String postpaidToll="xpath=.//*[@aria-label='Postpaid Toll']";
       public static String tollInvBal="xpath=.//*[@aria-label='Toll Inv Bal']";
       public static String invOvrPmt="xpath=.//*[@aria-label='Inv OvrPmt']";
       public static String ccExpiry="xpath=.//*[@aria-label='CC Expriry']";
       public static String reminderMsg="xpath=.//*[@aria-label='Reminder Msg']";
       public static String lastTollDate="xpath=.//*[@aria-label='Last Toll Date']";
       public static String lastdispDateAmt="xpath=.//*[@aria-label='Last Disp Date/Amt']";
       public static String lastPmtDate="xpath=.//*[@aria-label='Last Pmt Date']";
       public static String accOpeningDate="xpath=.//*[@aria-label='Acct Open Date']";
       public static String pmtDueDate="xpath=.//*[@aria-label='Pmt Due Date']";


       public static String castAccCheckBox="xpath=.//input[@type='checkbox' and @aria-label='Cast Account']";
       public static String isPostPaidCheckBox="xpath=.//input[@type='checkbox' and @aria-label='Is Post Paid']";
       public static String nixieStatusCheckBox="xpath=.//input[@type='checkbox' and @aria-label='Nixie Status']";
       public static String courtCheckBox="xpath=.//input[@type='checkbox' and @aria-label='Court']";
       public static String nsfCheckBox="xpath=.//input[@type='checkbox' and @aria-label='NSF']";
       public static String accountHoldCheckBox="xpath=.//input[@type='checkbox' and @aria-label='Account Hold']";
       public static String isAnonymousCheckBox="xpath=.//input[@type='checkbox' and @aria-label='Is Anonymous']";
       public static String tagsPricesTable = "xpath=//*[@summary='Open Items List']";


}



