package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class ElementPage extends BasePage {
   //Buttons Elementleri
    public SelenideElement selectButtons = $("div.show ul li#item-4");
    public SelenideElement clickMeButton = $("div:nth-child(2) > div:nth-child(4) > button");
    public SelenideElement txtDynamicCLick = $(By.id("dynamicClickMessage"));

    //WebTables Elementleri
    public SelenideElement selectWebTables = $("div.show ul li#item-3");
    public SelenideElement addButton = $("button#addNewRecordButton");
    public SelenideElement regisForm = $("form#userForm");
    public SelenideElement firstNameInput = $("input#firstName");
    public SelenideElement lastNameInput = $("input#lastName");
    public SelenideElement emailInput = $("input#userEmail");
    public SelenideElement ageInput = $("input#age");
    public SelenideElement salaryInput = $("input#salary");
    public SelenideElement departmentInput = $("input#department");
    public SelenideElement submitButton = $("button#submit");
    public SelenideElement addedItem = $("div.rt-tbody > div:nth-child(4)");
    public SelenideElement editButton = $("span#edit-record-4");
    public SelenideElement updatedItem = $(By.xpath("//div[text()='Umut']"));


    public ElementPage(String pageUrl) {
        super(pageUrl);
    }


   public void addItem(String firstname, String lastname, String email, String age,String salary, String department){
     addButton.click();
     firstNameInput.sendKeys(firstname);
     lastNameInput.sendKeys(lastname);
     emailInput.sendKeys(email);
     ageInput.sendKeys(age);
     salaryInput.sendKeys(salary);
     departmentInput.sendKeys(department);
     submitButton.click();
   }

   public void editItem(String txtFirstname){
     editButton.click();
     firstNameInput.clear();
     firstNameInput.sendKeys(txtFirstname);
     submitButton.click();
   }


}
