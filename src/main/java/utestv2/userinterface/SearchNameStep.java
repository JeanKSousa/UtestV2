package utestv2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchNameStep {
    public static  final  Target NAME_STEP = Target.the("Dar click para buscar el curso")
            .located(By.xpath("//span[contains(text(), 'The last step')]"));

}
