package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.List;
import java.util.concurrent.ExecutionException;

public abstract class AbstractPage {

    protected WebDriver driver ;
    private WebDriverWait wait;

    public AbstractPage(){
        this.driver = Driver.getDriver();
        wait = new WebDriverWait(driver, 20);

    }

    public void verifyDeletedAbstractClass(List<WebElement> tableList, String value ) throws InterruptedException {
        Thread.sleep( 2000 );
        boolean result = false;
        for(int i =0; i<tableList.size() ; i++){
            if(tableList.get( i ).getText().trim().equalsIgnoreCase( value )){
                result = true;
                break;
            }
        }
        if(result==true){
            Assert.fail(  );
        }else{
            System.out.println(value + " is not displayed");
        }
    }

    public void clickFunction(WebElement elementToClick){

        try{
            waitUntilClickable(elementToClick);
            elementToClick.click();
            Reporter.log( "Clicking on element "+elementToClick.toString(), true);
        }catch(Exception e){
            System.out.println(elementToClick + " not able to click this element");
              Assert.fail();
        }

    }

    public void sendKeysFunction(WebElement sendKeysElement ,String value){

        try{
            waitVisibility(sendKeysElement);
            sendKeysElement.sendKeys(value);
            Reporter.log( "Sending a value "+ value +  "on element ", true);
        }catch (Exception e){

            System.out.println(sendKeysElement + " not able to wait until this element");
            Assert.fail();
        }

    }

    public void waitUntilClickable(WebElement waitElement){

       try {
           wait.until(ExpectedConditions.elementToBeClickable(waitElement));
       }catch (Exception e){
           System.out.println( " Not able to wait until this element");
           Assert.fail();
       }
    }

    public void waitVisibility(WebElement waitElement){

        try {
            wait.until(ExpectedConditions.visibilityOf(waitElement));
            Reporter.log( "Waiting for an element"+waitElement , true);
        }catch (Exception e){
            System.out.println(waitElement + " not able to wait until this element");
            Assert.fail();
        }
    }

    public void verifyCreated(List<WebElement> names,String value){

        boolean result = false;
        for(WebElement eachElement :names){
            System.out.println("eachElement is here verify Created " + eachElement);
            waitVisibility(eachElement);
            if(eachElement.getText().equals(value)){
                result = true;
                Reporter.log( value +" is displayed");
                break;
            }
        }

        if(result == false){
            Reporter.log( value +" is not displayed");
           Assert.fail();
        }

        System.out.println("Element " + value +" is visible.");
    }

    public void deleteFunctionality(List<WebElement> names,List<WebElement> deleteButtons,String value ,WebElement buttonYes){

        waitVisibility(names.get(0));
        System.out.println(value);
        for(int i = 0 ; i<names.size() ; i++){
            System.out.println(names.get(i).getText()+ " <<---- each name is here ");
            if(names.get(i).getText().equals(value)){
                clickFunction(deleteButtons.get(i));
                clickFunction(buttonYes);

            }
        }
    }

    public void verifyDeleted(List<WebElement> names ,String value){

        waitVisibility(names.get(0));
        boolean result = false;
        System.out.println(names.size() + "<----- names.size() is here ");
        for(WebElement eachElement :names){
            if(eachElement.getText().equals(value)){
                result=true;
                break;
            }
        }

        if(result == true){
            Assert.fail();
        }

        System.out.println("Element " + value +" is not visible.");
    }

    public void waitUntilInvisibility(WebElement invisibleElement){

        try {
            wait.until(ExpectedConditions.invisibilityOf(invisibleElement));
        }catch (Exception e ){
            System.out.println(invisibleElement +" invisibility is FAILED");
        }
    }

    public void sleep(int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
    }

    public void clickByTextFromDropdown(WebElement dropdown ,String value, List<WebElement> optionsList){

        clickFunction(dropdown);

        for(int i=0 ; i<optionsList.size() ; i++){

            if(optionsList.get(i).getText().equals(value)){
                optionsList.get(i).click();
            }
        }

    }


}
