package ekam.example.web.test;

import com.testvagrant.ekam.testBases.testng.WebTest;

import static com.testvagrant.ekam.commons.LayoutInitiator.*;

import ekam.example.web.page.GoogleHomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GoogleSearchTests extends WebTest {
    @Test(groups = "web")
    public void shouldDoGoogleSearch1() {

        String title = Page(GoogleHomePage.class)
                .search("TestVagrant")
                .getTitle();

        assertEquals(title, "TestVagrant - Google Search");
    }

    @Test(groups = "web")
    public void shouldDoGoogleSearch2() {

        String title = Page(GoogleHomePage.class)
                .search("TestVagrant")
                .getTitle();

        assertEquals(title, "TestVagrant - Google Search");
    }

    @Test(groups = "web")
    public void shouldDoGoogleSearch3() {

        String title = Page(GoogleHomePage.class)
                .search("TestVagrant")
                .getTitle();

        assertEquals(title, "TestVagrant - Google Search");
    }
}