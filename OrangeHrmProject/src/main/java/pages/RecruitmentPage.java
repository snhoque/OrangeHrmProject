package pages;

import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RecruitmentPage {

    @FindBy(css ="div[role='option']>span") private List<WebElement> options;

    WebDriver driver = Browser.driver;

    public RecruitmentPage selectOptionFromDropdown (String textOption){
        List<WebElement> elements = driver.findElements(By.className("oxd-select-text--after"));
        elements.get(0).click();

        for(WebElement element : options){
            if (element.getText().equals(textOption)){
                element.click();
                break;
            }
        }
        return this;
    }

    public void selectCheckBox(String name){
        List<WebElement> allRows = driver.findElements(By.cssSelector(".oxd-table-row"));
        for(WebElement row: allRows){
            String cName = row.findElement(By.xpath("//div[3]")).getText();
            System.out.println("******"+cName);
            if(cName.equals(name)){
                row.findElement(By.xpath("//.div[1]")).click();

            }
        }
    }
}
