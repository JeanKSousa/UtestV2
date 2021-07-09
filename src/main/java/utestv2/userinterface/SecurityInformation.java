package utestv2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SecurityInformation {
    public static final Target PASSWORD1 = Target.the("")
            .located(By.id("password"));
    public static final Target PASSWORD2 = Target.the("")
            .located(By.id("confirmPassword"));
    public static final Target STAY = Target.the("")
            .located(By.xpath("//div[@class='signup-consent__text--highlight']"));
    public static final Target TERMS = Target.the("")
            .located(By.id("termOfUse"));
    public static final Target PRIVACY = Target.the("")
            .located(By.id("privacySetting"));
    public static  final  Target NAME_STEP = Target.the("")
            .located(By.xpath("//span[contains(text(), 'The last step')]"));
}
