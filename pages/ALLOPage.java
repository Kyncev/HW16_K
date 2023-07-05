package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ALLOPage {
    @FindBy(className = "ct-button")
    WebElement tab1;
    @FindBy(id = "1516")
    WebElement tab2;
    @FindBy(className = "mh-phone__title")
    WebElement tab3;

    public String tab1Test() {
        return tab1.findElement(By.className("ct-button")).getText();
    }

    public String tab2Test() {
        return tab2.findElement(By.id("1516")).getText();
    }

    public String tab3Test() {
        return tab3.findElement(By.tagName("span")).getText();
    }

}
