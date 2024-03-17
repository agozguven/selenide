package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

public class ElementPageTest extends BaseTest {

    @BeforeMethod
    public void before(){
        pageManager.elementPage.open();

    }

    @Test
    public void ButtonsTest() {

        pageManager.elementPage.selectButtons.click();
        assertThat(pageManager.elementPage.clickMeButton.isDisplayed()).isTrue();
        pageManager.elementPage.clickMeButton.click();
        assertThat(pageManager.elementPage.txtDynamicCLick.isDisplayed()).isTrue();

    }

    @Test
    public void WebtablesTest(){
        pageManager.elementPage.selectWebTables.click();
        assertThat(pageManager.elementPage.addButton.isDisplayed()).isTrue();
        pageManager.elementPage.addItem("Gokce","Ozguven","gokce@gmail.com", "30","10000","test" );
        assertThat(pageManager.elementPage.addedItem.isDisplayed()).isTrue();
        pageManager.elementPage.editItem("Umut");
        assertThat(pageManager.elementPage.updatedItem.isDisplayed()).isTrue();


    }
}
