package com.hanhngoa4.BT_Locators;

public class LocatorsCRM {
    // --- 1. Trang Login  ---
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String checkboxRememberMe = "//input[@id='remember']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot Password?']";
    public static String labelLoginHeader = "//h1[normalize-space()='Login']";

    // --- 2. Menu Hệ thống ---

    public static String menuCustomers = "//span[normalize-space()='Customers']";
    public static String menuProjects = "//ul[@id='side-menu']//span[contains(text(),'Projects')]"; //Parent to Child//span[normalize-space()='Projects']";

    // --- 3. Trang Customers Summary  ---
    public static String headerCustomersSummary = "//h4[normalize-space()='Customers Summary']";
    public static String buttonNewCustomer = "//a[contains(@class, 'new-customer')]";
    public static String buttonImportCustomers = "//a[normalize-space()='Import Customers']";
    public static String buttonContacts = "//div/div[1]/a[3]";
    public static String inputSearchCustomers = "//input[@id='search_input']";
    public static String iconSearchCustomers= "//i[@class='fa fa-search']";
    public static String labelTotalCustomers = "//span[normalize-space()='Total Customers']";

    // --- 4. Form New Customer - Customer Details  ---
    public static String inputCompany = "//input[@id='company']";
    public static String inputVatNumber = "//input[@id='vat']";
    public static String inputPhone = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";

    // Xpath cho Dropdown
    public static String dropdownGroups = "/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[7]/div[1]/div/div/button/span/span";
    public static String selectGroup= "//a[@id='bs-select-1-5']";
    public static String dropdownCurrency = "/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[7]/div[1]/div/div/button/div/div/div";
    public static String selectCurrency= "//a[@id='bs-select-2-1']";
    public static String dropdownLanguage = "/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[7]/div[2]/div/div/button/div/div/div";
    public static String selectLanguage= "//a[@id='bs-select-3-3']";

    public static String textareaAddress = "//textarea[@id='address']";
    public static String inputCity = "//input[@id='city']";
    public static String inputState = "//input[@id='state']";
    public static String inputZipCode = "//input[@name='zip']";
    public static String dropdownCountry = "/html/body/div[3]/div/div/div[3]/div/div[1]/div/div/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/div[12]/div/button/span/span";
    public static String selectCountry= "//a[@id='bs-select-4-8']";

    public static String buttonSave = "//div/div[2]/button[2]";
    public static String buttonSaveAndCreateContact = "//button[normalize-space()='Save and create contact']";


    // --- 5. Form New Project
    public static String buttonNewProject = "//a[normalize-space()='New Project']";
    // 5.1. Thông tin chung
    public static String inputProjectName = "//input[@id='name']";//----Heare
    public static String dropdownCustomer = "//button[@data-id='clientid']"; // Click để mở danh sách khách hàng
    public static String checkboxCalculateProgress = "//input[@id='progress_from_tasks']";

    // 5.2. Billing & Status
    public static String dropdownBillingType = "//button[@data-id='billing_type']";
    public static String dropdownStatus = "//button[@data-id='status']";
    public static String inputEstimatedHours = "//input[@id='estimated_hours']";
    public static String dropdownMembers = "//button[@data-id='project_members[]']";

    // 5.3. Thời gian & Nhãn
    public static String inputStartDate = "//input[@id='start_date']";
    public static String inputDeadline = "//input[@id='deadline']";
    public static String inputTags = "//ul[contains(@class, 'tagit')]//input"; // Ô nhập tag

    // 5.4. Mô tả (Description)
    // Lưu ý: Phần này thường dùng thẻ iframe hoặc div đặc biệt cho Rich Text Editor
    public static String areaDescription = "//div[@id='mceu_24']";

    // 5.5. Tùy chọn gửi mail & Nút lưu
    public static String checkboxSendEmail = "//input[@id='send_created_email']";
    public static String buttonSaveProject = "//button[@type='submit' and contains(@class, 'btn-info')]";

}
