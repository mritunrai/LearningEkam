package ekam.example.web.page;

import com.testvagrant.ekam.reports.annotations.WebStep;
import com.testvagrant.ekam.atoms.web.WebPage;
import com.testvagrant.ekam.web.annotations.WebSwitchView;
import org.openqa.selenium.By;

public class GoogleHomePage extends WebPage {

    protected By searchBox = queryByName("q");
    private By searchButton = query("input[value='Google Search']");

    @WebSwitchView(view = GoogleHomeView.class)
    @WebStep(keyword = "When", description = "I hit search button")
    public GoogleHomePage search(String text) {

        textbox(searchBox).setText(text);
        element(searchButton).click();
        return this;
    }

    @WebStep(keyword = "And", description = "I return Title")
    public String getTitle() {

        return driver.getTitle();
    }
}