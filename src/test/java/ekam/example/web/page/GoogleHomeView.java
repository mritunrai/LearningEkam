package ekam.example.web.page;

import com.testvagrant.ekam.reports.annotations.WebStep;
import org.openqa.selenium.Keys;

public class GoogleHomeView extends GoogleHomePage {

    @WebStep(keyword = "When", description = "I hit search button")
    public GoogleHomeView search(String text) {
        textbox(searchBox).setText(text);
        textbox(searchBox).getElement().sendKeys(Keys.ENTER);
        return this;
    }
}