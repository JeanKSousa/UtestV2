package utestv2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DeviceInformation {
    public static final Target COMPUTER1 = Target.the("")
            .located(By.xpath("//div[@id='web-device']//div[1]//div[2]//div"));
    public static final Target COMPUTER2 = Target.the("")
            .located(By.xpath("//div[@id='web-device']//div[1]//div[2]//div//input[1]"));
    public static final Target VERSION1 = Target.the("")
            .located(By.xpath("//div[@id='web-device']//div[2]//div[2]//div"));
    public static final Target VERSION2 = Target.the("")
            .located(By.xpath("//div[@id='web-device']//div[2]//div[2]//div//input[1]"));
    public static final Target LANGUAGE_DEVICE1 = Target.the("")
            .located(By.xpath("//div[@id='web-device']//div[3]//div[2]//div"));
    public static final Target LANGUAGE_DEVICE2 = Target.the("")
            .located(By.xpath("//div[@id='web-device']//div[3]//div[2]//div//input[1]"));
    public static final Target MOBIL1 = Target.the("")
            .located(By.xpath("//div[@id='mobile-device']//div[1]//div[2]//div"));
    public static final Target MOBIL2 = Target.the("")
            .located(By.xpath("//div[@id='mobile-device']//div[1]//div[2]//div//input[1]"));
    public static final Target MODE1 = Target.the("")
            .located(By.xpath("//div[@id='mobile-device']//div[2]//div[2]//div"));
    public static final Target MODEL2 = Target.the("")
            .located(By.xpath("//div[@id='mobile-device']//div[2]//div[2]//div//input[1]"));
    public static final Target SYSTEM1 = Target.the("")
            .located(By.xpath("//div[@id='mobile-device']//div[3]//div[2]//div"));
    public static final Target SYSTEM2 = Target.the("")
            .located(By.xpath("//div[@id='mobile-device']//div[3]//div[2]//div//input[1]"));
    public static final Target NEXT_STEP3 = Target.the("")
            .located(By.xpath("//div[@class='pull-right next-step']//a"));
}
