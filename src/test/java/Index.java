//import org.jboss.arquillian.graphene.enricher.findby.FindBy;
//import org.openqa.selenium.WebElement;
//
///**
// * Created with IntelliJ IDEA.
// * User: Wybraniec
// * Date: 19.07.13
// * Time: 11:36
// * To change this template use File | Settings | File Templates.
// */
//public class Index {
//
//    @FindBy(id = "Add")
//    private WebElement button;
//
//    @FindBy(id = "number")
//    private WebElement number;
//
//    @FindBy(id = "input_1")
//    private WebElement input;
//
//    private Integer counter;
//
//    public  void setCounter(Integer var){
//        counter = var;
//    }
//    public Integer getCounter(){
//        return counter;
//    }
//
//    public void clickButton(){
//        button.click();
//    }
//
//    public String getNumber(){
//        return number.getText();
//    }
//
//    public void setInput(String text){
//        input.clear();
//        input.sendKeys(text);
//    }
//}
