package AmmoSearch;

import Properties.SetURL;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.io.IOException;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;
import Properties.SetPath;

public class Ammo {
    @BeforeMethod
    void login()throws IOException{
        String baseUrl = SetURL.Url();
        open(baseUrl);
        Configuration.reportsFolder = SetPath.FotoPath();
    }
    @Test
    void CaliberSelection45ACP() {
        SelenideElement ammo = $(By.xpath("//button[contains(text(),'Ammo')]")).waitUntil(Condition.visible, 1000);
        ammo.hover();
        SelenideElement acp = $(By.linkText("45 ACP")).waitUntil(Condition.visible, 2000);
        acp.click();
        String currentURL = url();
        System.out.println(currentURL);
        assert currentURL.contains("ACP");
        screenshot("45 ACP");
    }
        @Test
        void CaliberSelection12Gage(){
            SelenideElement ammo = $(By.xpath("//button[contains(text(),'Ammo')]")).waitUntil(Condition.visible,1000);
            ammo.hover();
            SelenideElement twelve = $(By.linkText("12 Gauge")).waitUntil(Condition.visible,2000);
            twelve.click();
            String currentURL = url();
            System.out.println(currentURL);
            assert currentURL.contains("12+Gauge");
            screenshot("12 Gauge");
    }
}
