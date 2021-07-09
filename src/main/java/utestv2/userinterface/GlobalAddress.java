package utestv2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GlobalAddress {
    public static final Target CITY = Target.the("")
            .located(By.id("city"));
    public static final Target POSTAL = Target.the("")
            .located(By.id("zip"));
    public static final Target COUNTRY1 = Target.the("")
            .located(By.xpath("//div[@class='ui-select']//div[1]//div[1]"));
    public static final Target COUNTRY2 = Target.the("")
            .located(By.xpath("//div[@class='ui-select']//div[1]//div[1]//input[1]"));
    public static final Target NEXT_STEP2 = Target.the("")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
}
