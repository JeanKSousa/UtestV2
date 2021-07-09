package utestv2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class UtestPage extends PageObject {
    public static final Target SIGUP = Target.the("")
            .located(By.xpath("//a[contains(text(), 'Join Today')]"));
}
