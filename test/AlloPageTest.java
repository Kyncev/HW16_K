package test;
import data.Language;
import data.AllotestDATA;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.support.PageFactory;
import pages.ALLOPage;
import java.util.Arrays;
import java.util.Collection;
import java.util.ResourceBundle;
@RunWith(Parameterized.class)
public class AlloPageTest extends AllotestDATA {

    @Parameterized.Parameters
    public static Collection options(){
        return Arrays.asList(Language.values());
    }
    public AlloPageTest(Language lang, Object language){
        allobundle= ResourceBundle.getBundle(lang.getLang());
        if(!driver.getCurrentUrl().contains("https:://allo.ua"+allobundle.getString("language"))){
            driver.get("https:://allo.ua"+allobundle.getString("language"));
            allo= PageFactory.initElements(driver, ALLOPage.class);
        }
    }
    @Test
    public void testTab1(){
        Assert.assertEquals(allobundle.getString("tab1"),allo.tab1Test());
    }
    @Test
    public void testTab2(){
        Assert.assertEquals(allobundle.getString("tab2"),allo.tab2Test());
    }
    @Test
    public void testTab3(){
        Assert.assertEquals(allobundle.getString("tab3"),allo.tab3Test());
    }
}
