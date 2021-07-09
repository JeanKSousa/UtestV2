package utestv2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInformation {
    public static final Target FIRSTNAME = Target.the("")
               .located(By.id("firstName"));
    public static final Target LASTNAME = Target.the("")
            .located(By.id("lastName"));
    public static final Target EMAIL = Target.the("")
            .located(By.id("email"));
    public static final Target MONTH = Target.the("")
            .located(By.id("birthMonth"));
    public static final Target DAY = Target.the("")
            .located(By.id("birthDay"));
    public static final Target YEAR = Target.the("")
            .located(By.id("birthYear"));
    public static final Target LANGUAGE = Target.the("")
            .located(By.xpath("//div[@id='languages']//div[1]//input"));
    public static final Target NEXT_STEP = Target.the("")
            .located(By.xpath("//div[@class='form-group col-xs-12 text-right']//a"));
}
