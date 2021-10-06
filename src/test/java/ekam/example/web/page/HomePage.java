package ekam.example.web.page;

import com.testvagrant.ekam.atoms.web.WebPage;
import com.testvagrant.ekam.reports.annotations.WebStep;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HomePage extends WebPage {
    private By searchBox = queryById("twotabsearchtextbox");

    @WebStep(keyword = "When", description = "I hit search button")
    public HomePage searchItem(String itemName) {
        textbox(searchBox).setText(itemName);
        textbox(searchBox).setText(Keys.ENTER);
        return this;
    }
}