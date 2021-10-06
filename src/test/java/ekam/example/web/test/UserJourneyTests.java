package ekam.example.web.test;

import com.google.inject.Inject;
import com.testvagrant.ekam.commons.data.DataSetsClient;
import com.testvagrant.ekam.testBases.testng.WebTest;
import org.testng.annotations.Test;

@Test(groups = "web")
public class UserJourneyTests extends WebTest {
    @Inject
    private DataSetsClient dataSetsClient;

    @Test
    public void webExampleTest() {

    }
}