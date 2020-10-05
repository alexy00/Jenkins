package FirearmsSearch;


import Properties.SetPath;
import Properties.Logins;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;

public class Firearms {

    @BeforeMethod
    void login()throws IOException {
        String baseUrl = Logins.Url();
        open(baseUrl);
        Configuration.reportsFolder = SetPath.FotoPath();
    }
    @Test
    void CaliberSelection45ACP() {
        SelenideElement firearms = $(By.xpath("//button[contains(text(),'Firearms')]")).waitUntil(Condition.visible, 1000);
        firearms.hover();
        SelenideElement nine = $(By.linkText("9MM")).waitUntil(Condition.visible, 2000);
        nine.click();
        String currentURL = url();
        System.out.println(currentURL);
        assert currentURL.contains("9mm");
        screenshot("9MM");
    }
}
